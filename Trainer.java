package com.optional.example;

public class Trainer {
	
	private String trainerName;
	private String trainerEmail;
	private String trainerMobile;
	
	public Trainer() {}
	
	public Trainer(String arg0, String arg1, String arg2) {
		this.trainerName = arg0;
		this.trainerEmail = arg1;
		this.trainerMobile = arg2;
	}
	
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public String getTrainerEmail() {
		return trainerEmail;
	}
	public void setTrainerEmail(String trainerEmail) {
		this.trainerEmail = trainerEmail;
	}
	public String getTrainerMobile() {
		return trainerMobile;
	}
	public void setTrainerMobile(String trainerMobile) {
		this.trainerMobile = trainerMobile;
	}
	
	

}
