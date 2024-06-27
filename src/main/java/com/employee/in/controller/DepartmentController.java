package com.employee.in.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.in.model.DepartmentModel;
import com.employee.in.service.DepartmentService;

@RestController
@RequestMapping("department")
public class DepartmentController {
	@Autowired
	public DepartmentService depserv;

	@PostMapping("add")
	public DepartmentModel addDepartmentModel(@RequestBody DepartmentModel dpt) {
		return depserv.addDepartment(dpt);
	}

	@PutMapping("update")
	public DepartmentModel updateDepartmentModel(@RequestBody DepartmentModel dpt) {
		return depserv.updateDepartment(dpt);
	}

	@DeleteMapping("delete/{id}")
	public DepartmentModel deleteDepartmentModel(@PathVariable("id") int id) {
		return depserv.deleteDepartmnet(id);
	}

	@GetMapping("viewone/{id}")
	public DepartmentModel viewDepartmentModel(@PathVariable("id") int id) {
		DepartmentModel dpt = new DepartmentModel();
		dpt.setId(id);
		return depserv.viewDepartment(dpt);
	}

	@GetMapping("viewall")
	public List<DepartmentModel> viewDepartmentModel() {
		return depserv.viewallDepartment();
	}

}
