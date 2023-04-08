package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("student name:Pavi");
	}
	
	public void studentDept() {
		System.out.println("student dept: ECE");
	}
	public void studentId() {
		System.out.println("student id:123456");
	}
	
	public static void main(String[] args) {
		
		Student obj=new Student();
		obj.collegeCode();
		obj.collegeName();
		obj.collegeRank();
		obj.departmentName();
		obj.studentDept();
		obj.studentId();
		obj.studentName();
		
		
		
		
		
	}
	
	
	
}
