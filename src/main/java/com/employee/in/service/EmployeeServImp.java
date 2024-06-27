package com.employee.in.service;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.in.model.DepartmentModel;
import com.employee.in.model.EmployeeModel;
import com.employee.in.repository.EmployeeRepository;

@Service
public class EmployeeServImp implements EmployeeService {

	@Autowired
	public EmployeeRepository eRepo;

	@Autowired
	public DepartmentService dService;

	@Override
	public String addEmployee(EmployeeModel emp) {
		List<DepartmentModel> dList = dService.viewallDepartment();
		List<Integer> idList = dList.stream().map(dl -> dl.getDepartmentId()).toList();
		if (idList.contains(emp.getDepartmentId())) {
			eRepo.save(emp);
			return "success";
		} else {
			return "failed";
		}
	}

	@Override
	public String updateEmployee(EmployeeModel emp) {
		if (eRepo.findById(emp.getEmpId()) != null && eRepo.findById(emp.getEmpId()).isPresent()) {
			return eRepo.save(emp).toString();
		}
		return "failed";
	}

	@Override
	public String deleteEmployee(int id) {
		EmployeeModel emp = eRepo.findById(id).get();
		eRepo.delete(emp);
		return emp.toString();
	}

	@Override
	public String viewEmployee(EmployeeModel emp) {
		if (eRepo.findById(emp.getEmpId()) != null && eRepo.findById(emp.getEmpId()).isPresent()) {
			return eRepo.findById(emp.getEmpId()).get().toString();
		}
		return "failed";
	}

	@Override
	public List<EmployeeModel> viewallEmployee() {
		return eRepo.findAll();
	}

	@Override
	public Map<Integer, String> getAllEmployees() {
		List<EmployeeModel> list = eRepo.findAll();
		return list.stream().collect(Collectors.toMap(EmployeeModel::getEmpId, EmployeeModel::getName, (e1, e2) -> e1,
				TreeMap<Integer, String>::new));
	}

}
