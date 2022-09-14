package com.Surge.Sept14;

class EmployeeData{
	private int employeeId;
	private String employeeName;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
//	public boolean equals(Object obj) {
//		EmployeeData emp = (EmployeeData) obj;
//		return this.employeeId == emp.getEmployeeId() && this.employeeName == emp.getEmployeeName();
//	}
}