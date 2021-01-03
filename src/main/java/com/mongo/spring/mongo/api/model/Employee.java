package com.mongo.spring.mongo.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Employee")
public class Employee {

	@Id
	private int id;
	private String Emp_name;
	private String desig;
	
	public Employee(int id, String Emp_name, String desig) {
		super();
		this.id = id;
		this.Emp_name = Emp_name;
		this.desig = desig;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setEmp_name(String Emp_name) {
		this.Emp_name = Emp_name;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public int getId() {
		return id;
	}

	public String getEmp_name() {
		return Emp_name;
	}

	public String getDesig() {
		return desig;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", Emp_name=" + Emp_name + ", desig=" + desig + "]";
	}
	
	
}
