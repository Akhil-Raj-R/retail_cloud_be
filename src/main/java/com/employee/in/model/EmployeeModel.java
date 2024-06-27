package com.employee.in.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "employee_details")
@Entity
public class EmployeeModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	private Integer empId;
	private String name;
	@Column(name = "dateofbirth")
	private String dateOfBirth;
	@Column(name = "joining_date")
	private String joiningDate;
	private Long salary;
	private String place;
	@Column(name = "department_id")
	private Integer departmentId;
	private String role;
	@Column(name = "reporting_manger")
	private String repotingManger;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getRepotingManger() {
		return repotingManger;
	}

	public void setRepotingManger(String repotingManger) {
		this.repotingManger = repotingManger;
	}

	@Override
	public String toString() {
		return "EmployeeModel [empId=" + empId + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", joiningDate="
				+ joiningDate + ", salary=" + salary + ", place=" + place + ", departmentId=" + departmentId + ", role="
				+ role + ", repotingManger=" + repotingManger + "]";
	}

	public EmployeeModel(Integer empId, String name, String dateOfBirth, String joiningDate, Long salary, String place,
			Integer departmentId, String role, String repotingManger) {
		super();
		this.empId = empId;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.joiningDate = joiningDate;
		this.salary = salary;
		this.place = place;
		this.departmentId = departmentId;
		this.role = role;
		this.repotingManger = repotingManger;
	}

	public EmployeeModel() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws JsonProcessingException {
		System.out.println(new ObjectMapper().writeValueAsString(new EmployeeModel()));
	}

}
