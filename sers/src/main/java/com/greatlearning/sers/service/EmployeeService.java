package com.greatlearning.sers.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.greatlearning.sers.entity.Employee;
import com.greatlearning.sers.entity.Role;
import com.greatlearning.sers.entity.User;

@Component
public interface EmployeeService {

	String addSingleEmployee(Employee employee);

	String addAllEmployees(List<Employee> employees);

	public String addRole(Role role);

	String addUser(User user);

	List<User> getAllUsers();

	Optional<Employee> getEmployeeById(Integer id);

	List<Employee> SortById(Direction direction);

	List<Employee> getAllEmployees();

	String deleteEmployeeById(Integer id);

	public List<Employee> SortedByName(Direction direction);

	List<Employee> searchBy(String name);

}