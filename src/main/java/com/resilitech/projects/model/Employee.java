package com.resilitech.projects.model;

public class Employee {
	private int empIID;
	private String empName;
	private String address;

	public Employee() {
	}

	public Employee(int empIID, String empName, String address) {

		this.empIID = empIID;
		this.empName = empName;
		this.address = address;
	}

	public int getEmpIID() {
		return empIID;
	}

	public void setEmpIID(int empIID) {
		this.empIID = empIID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
