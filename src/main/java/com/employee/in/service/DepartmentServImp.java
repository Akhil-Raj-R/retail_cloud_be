package com.employee.in.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.in.model.DepartmentModel;
import com.employee.in.repository.DepartmentRepository;

@Service
public class DepartmentServImp implements DepartmentService {

	@Autowired
	public DepartmentRepository drepo;

	@Override
	public DepartmentModel addDepartment(DepartmentModel dpt) {
		return drepo.save(dpt);
	}

	@Override
	public DepartmentModel updateDepartment(DepartmentModel dpt) {
		return drepo.save(dpt);
	}

	@Override
	public DepartmentModel deleteDepartmnet(int id) {
		DepartmentModel dpt = drepo.findById(id).get();
		drepo.delete(dpt);
		return dpt;
	}

	@Override
	public DepartmentModel viewDepartment(DepartmentModel dpt) {
		return drepo.findById(dpt.getId()).get();
	}

	@Override
	public List<DepartmentModel> viewallDepartment() {
		return drepo.findAll();
	}

}
