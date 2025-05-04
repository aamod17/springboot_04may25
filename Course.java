package com.optional.example;

import java.util.Optional;

public class Course {
	
	private String courseName;
	private Double coursePrice;
	private Optional<Trainer> trainer;
	
	
	public Course() {}
	
	public Course(String courseName, Double coursePrice, Optional<Trainer> trainer) {
		super();
		this.courseName = courseName;
		this.coursePrice = coursePrice;
		this.trainer = trainer;
	}
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Double getCoursePrice() {
		return coursePrice;
	}
	public void setCoursePrice(Double coursePrice) {
		this.coursePrice = coursePrice;
	}
	public Optional<Trainer> getTrainer() {
		return trainer;
	}
	public void setTrainer(Optional<Trainer> trainer) {
		this.trainer = trainer;
	}
	
	

}
