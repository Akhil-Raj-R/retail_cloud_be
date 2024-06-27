package com.employee.in.service;

import java.util.List;
import java.util.Map;

import com.employee.in.model.EmployeeModel;

public interface EmployeeService {

	public String addEmployee(EmployeeModel emp);

	public String updateEmployee(EmployeeModel emp);

	public String deleteEmployee(int id);

	public String viewEmployee(EmployeeModel emp);

	public List<EmployeeModel> viewallEmployee();

	public Map<Integer, String> getAllEmployees();

}
