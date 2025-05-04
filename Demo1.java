package com.optional.example;

import java.util.Optional;

public class Demo1 {

	public static void main(String[] args) {
		
		Trainer myTrainer = new Trainer("srinivas", "srinivas@gmail.com", "123456789");
		Optional<Trainer> myTrainerOptional1 = Optional.ofNullable(myTrainer);
		// even I can directly pass Optional.ofNullable(myTrainer) as an argument of Course constructor
		Course myCourse1 = new Course("java", 5000.00, myTrainerOptional1);
		//Optional<Course> myCourseOptional1 = Optional.ofNullable(myCourse1);
		// I can pass myCourseOptional1 here or directly pass Optional.ofNullable(myCourse1)
		Student myStudent1 = new Student("AAA", "aaa@gmail.com", "8888", Optional.ofNullable(myCourse1));
		
		Optional<Student> myStudentOptional1 = Optional.ofNullable(myStudent1);
		Optional<Course> c1 = myStudentOptional1.flatMap(input -> input.getCourse());
		Optional<Trainer> t1 = c1.flatMap(input2 -> input2.getTrainer());
		Optional<String> opStr = t1.map(input3 -> input3.getTrainerEmail());
		System.out.println("1. "+opStr);
		
		String outputTrainerEmail = opStr.orElse("Email Not Provided");
		System.out.println("2. "+outputTrainerEmail);
		
		
		//second way: directly call with the help of method chaining
		
		String outString = myStudentOptional1.flatMap(myS -> myS.getCourse()).flatMap(myC -> myC.getTrainer()).map(myTr -> myTr.getTrainerEmail()).orElse("Email Not Provided");
		System.out.println("Trainer Email: "+outString);
		
		//third way; almost same but slightly differ
		
		String outString3 = myStudentOptional1.flatMap(myS2 -> myS2.getCourse().flatMap(myC2 -> myC2.getTrainer().map(myTr2 -> myTr2.getTrainerEmail()))).orElse("No Email");
		System.out.println("4. "+outString3);

	}

}
