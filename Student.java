package org.students;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Dharseni");

	}
	public void studentDept() {
		System.out.println("communication");

	}
	public void studentId() {
		System.out.println("15");

	}
	public static void main(String[] args) {
		Student s= new Student();
		s.collegeCode();
		s.collegeName();
		s.collegeRank();
		s.deptName();
		s.studentDept();
		s.studentName();
		s.studentId();
	}


	

}
