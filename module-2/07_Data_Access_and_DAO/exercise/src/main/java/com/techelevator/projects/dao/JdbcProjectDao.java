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

		String sql = " SELECT * " + " FROM project " + "WHERE project_id = ? ;";

		SqlRowSet result = jdbcTemplate.queryForRowSet(sql, projectId);

		if(result.next()){
			project.setId(result.getInt("project_id"));
			project.setName(result.getString("name"));
			project.setFromDate(result.getDate("from_date").toLocalDate());
			project.setToDate(result.getDate("to_date").toLocalDate());
		}else{
			return null;
		}
		return project;
	}

	@Override
	public List<Project> getAllProjects() {
		return new ArrayList<>();
	}

	@Override
	public Project createProject(Project newProject) {
		return null;
	}

	@Override
	public void deleteProject(int projectId) {

	}
	

}
