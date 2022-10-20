package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.techelevator.projects.model.Project;
import org.springframework.jdbc.core.JdbcTemplate;

import com.techelevator.projects.model.Employee;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JdbcEmployeeDao implements EmployeeDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcEmployeeDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Employee> getAllEmployees() {

		List<Employee> employeeList = new ArrayList<>();

		String sql = " SELECT employee_id, department_id, first_name, last_name, birth_date, hire_date FROM employee ";
		SqlRowSet result = jdbcTemplate.queryForRowSet(sql);

		while(result.next()){
		employeeList.add(mapRowToEmployee(result));
		}
		return employeeList;
	}

	@Override
	public List<Employee> searchEmployeesByName(String firstNameSearch, String lastNameSearch) {
		List<Employee> employeeList = new ArrayList<>();

		String sql = "SELECT employee_id, department_id, first_name, last_name, birth_date, hire_date " +
				"FROM employee " +
				"WHERE first_name ILIKE ? AND last_name ILIKE ? ";

		SqlRowSet result = jdbcTemplate.queryForRowSet(sql, "%" + firstNameSearch + "%", "%" + lastNameSearch + "%");
		while(result.next()){
			employeeList.add(mapRowToEmployee(result));
		}
		return employeeList;
	}

	@Override
	public List<Employee> getEmployeesByProjectId(int projectId) {
		List<Employee> employeeList = new ArrayList<>();
		String sql = "SELECT* " +
				"FROM employee " +
				"JOIN project_employee ON project_employee.employee_id = employee.employee_id " +
				"WHERE project_id = ?";

		SqlRowSet result = jdbcTemplate.queryForRowSet(sql, projectId);
		while(result.next()){
			employeeList.add(mapRowToEmployee(result));
		}

		return employeeList;
	}

	@Override
	public void addEmployeeToProject(int projectId, int employeeId) {

		String sql = "INSERT into project_employee (project_id, employee_id) VALUES(?,?)";
		jdbcTemplate.update(sql, projectId, employeeId);


	}

	@Override
	public void removeEmployeeFromProject(int projectId, int employeeId) {

			String sql = "DELETE from project_employee WHERE project_id = ? AND employee_id = ?";
			jdbcTemplate.update(sql, projectId, employeeId);

//			String sql1 = "DELETE FROM timesheet WHERE employee_id = ? AND project_id = ? ";
//			jdbcTemplate.update(sql1, projectId, employeeId);
//			String sql2 = "DELETE FROM project WHERE project_id = ? ";
//		    jdbcTemplate.update(sql2, projectId);
//			String sql3 = "DELETE FROM project_employee WHERE project_id = ? AND employee_id = ? ";
//			jdbcTemplate.update(sql3, projectId, employeeId);
//			String sql4 = "DELETE FROM employee WHERE employee_id ";
//			jdbcTemplate.update(sql4, projectId, employeeId);
	}

	@Override
	public List<Employee> getEmployeesWithoutProjects() {
		List<Employee> employeeList = new ArrayList<>();
		String sql = " SELECT* " +
				" FROM employee " +
				" LEFT JOIN project_employee ON employee.employee_id = project_employee.employee_id " +
				"WHERE project_id IS NULL";

		SqlRowSet result = jdbcTemplate.queryForRowSet(sql);
		while(result.next()){
			employeeList.add(mapRowToEmployee(result));
		}

		return employeeList;
	}


	private Employee mapRowToEmployee(SqlRowSet result) {

		Employee employeei = new Employee();

		employeei.setId(result.getInt("employee_id"));
		employeei.setDepartmentId(result.getInt("department_id"));
		employeei.setFirstName(result.getString("first_name"));
		employeei.setLastName(result.getString("last_name"));
		employeei.setBirthDate(result.getDate("birth_date").toLocalDate());
		employeei.setHireDate(result.getDate("hire_date").toLocalDate());
		return employeei;
	}

}
