package com.optional.example;

import java.util.Optional;

public class Student {
	
	private String studentName;
	private String studentEmail;
	private String studentMobile;
	private Optional<Course> course;
	
	public Student() {}
	
	public Student(String studentName, String studentEmail, String studentMobile, Optional<Course> course) {
		super();
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentMobile = studentMobile;
		this.course = course;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getStudentMobile() {
		return studentMobile;
	}

	public void setStudentMobile(String studentMobile) {
		this.studentMobile = studentMobile;
	}

	public Optional<Course> getCourse() {
		return course;
	}

	public void setCourse(Optional<Course> course) {
		this.course = course;
	}
	
	

}
