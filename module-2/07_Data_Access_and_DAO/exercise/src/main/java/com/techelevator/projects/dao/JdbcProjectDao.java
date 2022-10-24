package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Project;

public class JdbcProjectDao implements ProjectDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcProjectDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Project getProject(int projectId) {

		Project project = new Project();

		String sql = " SELECT * " + " FROM project " + " WHERE project_id = ? ";

		SqlRowSet result = jdbcTemplate.queryForRowSet(sql, projectId);
		if(result.next()){
			project = mapRowToProject(result);
		}else{
			return null;
		}
		return project;
	}

	@Override
	public List<Project> getAllProjects() {

		List<Project> project = new ArrayList<>();
		String sql = "SELECT * " +
				"FROM project";
		SqlRowSet result = jdbcTemplate.queryForRowSet(sql);

		while(result.next()){

			project.add(mapRowToProject(result));
		}
		return project;
	}

	@Override
	public Project createProject(Project newProject) {
		String sql = "INSERT INTO project (name, from_date, to_date) " +
				"VALUES(?, ?, ?) RETURNING project_id";

		Integer newId = jdbcTemplate.queryForObject(sql, Integer.class, newProject.getName(), newProject.getFromDate(), newProject.getToDate());

		return getProject(newId);
	}

	@Override
	public void deleteProject(int projectId) {

		String sql1 = "DELETE FROM timesheet WHERE project_id = ?";
		jdbcTemplate.update(sql1, projectId);

		String sql2 = "DELETE FROM project_employee WHERE project_id = ?";
		jdbcTemplate.update(sql2, projectId);

		String sql3 = "DELETE FROM project WHERE project_id = ?";
		jdbcTemplate.update(sql3, projectId);

	}

	private Project mapRowToProject(SqlRowSet result) {
		Project projecti = new Project();

		projecti.setId(result.getInt("project_id"));
		projecti.setName(result.getString("name"));
		if(result.getDate("from_date") != null) {
			projecti.setFromDate(result.getDate("from_date").toLocalDate());
		}
		if(result.getDate("to_date") != null) {
			projecti.setToDate(result.getDate("to_date").toLocalDate());
		}
		return projecti;
	}

}
