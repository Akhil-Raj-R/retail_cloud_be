package com.employee.in.controller;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employee.in.model.EmployeeModel;
import com.employee.in.service.EmployeeService;

@RestController
@RequestMapping("employee")
public class EmployeeController {
	@Autowired
	public EmployeeService empserv;

	@PostMapping("add")
	public String addEmployee(@RequestBody EmployeeModel emp) {
		return empserv.addEmployee(emp);
	}

	@PutMapping("update")
	public String updateEmployee(@RequestBody EmployeeModel emp) {
		return empserv.updateEmployee(emp);
	}

	@DeleteMapping("{id}")
	public String deleteEmployeeModel(@PathVariable("id") int id) {
		return empserv.deleteEmployee(id);
	}

	@GetMapping("{id}")
	public String viewEmployeeModel(@PathVariable("id") int id) {
		EmployeeModel dpt = new EmployeeModel();
		dpt.setEmpId(id);
		return empserv.viewEmployee(dpt);
	}

	@GetMapping("view")
	public List<EmployeeModel> viewEmployeeModel() {
		return empserv.viewallEmployee();
	}

	@GetMapping("employeeAndId")
	public Map<Integer, String> getEmployees(@RequestParam String lookup) {
		if (lookup.equals("true")) {
			return empserv.getAllEmployees();
		}
		return new TreeMap<Integer, String>(); // or return an appropriate response when lookup is not true
	}

}
