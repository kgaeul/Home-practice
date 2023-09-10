package com.kh.hw.person.model.vo;

public class Employee {

	int salary ;
	String dept ;
	
	public Employee (int salary , String dept, String name,int  age,double height,double weight) {
		
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public int getSalary() {
		return salary;
	}

	public String getDept() {
		return dept;
	}

}
