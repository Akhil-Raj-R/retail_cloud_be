package com.employee.in.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "department_details")
public class DepartmentModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "department_id")
	private Integer departmentId;
	@Column(name = "department_name")
	private String departmentName;
	@Column(name = "department_head")
	private String departmentHead;
	@Column(name = "creation_date")
	private String creationDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentHead() {
		return departmentHead;
	}

	public void setDepartmentHead(String departmentHead) {
		this.departmentHead = departmentHead;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public String toString() {
		return "DepartmentModel [id=" + id + ", departmentId=" + departmentId + ", departmentName=" + departmentName
				+ ", departmentHead=" + departmentHead + ", creationDate=" + creationDate + "]";
	}

	public DepartmentModel(Integer id, Integer departmentId, String departmentName, String departmentHead,
			String creationDate) {
		super();
		this.id = id;
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentHead = departmentHead;
		this.creationDate = creationDate;
	}

	public DepartmentModel() {
	}
}
