package com.employee.in.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.in.model.DepartmentModel;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentModel, Integer> {

}
