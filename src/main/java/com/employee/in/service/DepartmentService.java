package com.employee.in.service;

import java.util.List;

import com.employee.in.model.DepartmentModel;

public interface DepartmentService {
	public DepartmentModel addDepartment(DepartmentModel dpt);

	public DepartmentModel updateDepartment(DepartmentModel dpt);

	public DepartmentModel deleteDepartmnet(int id);

	public DepartmentModel viewDepartment(DepartmentModel dpt);

	public List<DepartmentModel> viewallDepartment();

}
