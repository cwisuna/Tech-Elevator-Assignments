package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Department;

public class JdbcDepartmentDao implements DepartmentDao {
	
	private final JdbcTemplate jdbcTemplate;

	public JdbcDepartmentDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Department getDepartment(int id) {

		Department department = new Department();
		String sql = " SELECT * " + "FROM department" + " WHERE department_id = ?;";

		SqlRowSet result = jdbcTemplate.queryForRowSet(sql, id);

		if(result.next()){
			department.setId(result.getInt("department_id"));
			department.setName((result.getString("name")));
		}else{
			return null;
		}
		return department;
	}

	@Override
	public List<Department> getAllDepartments() {

		List<Department> departmentsList = new ArrayList<>();

		String sql =  " SELECT *" + " FROM department ;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);

		while(results.next()) {

			Department department = new Department();
			department.setId(results.getInt("department_id"));
			department.setName(results.getString("name"));

			departmentsList.add(department);
		}
		return departmentsList;
	}

	@Override
	public void updateDepartment(Department updatedDepartment) {

		String sql = " UPDATE department "  +  " SET name = ? " + " WHERE department_id = ? ";
		jdbcTemplate.update(sql, updatedDepartment.getName(), updatedDepartment.getId());

	}

}
