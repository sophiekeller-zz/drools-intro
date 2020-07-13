package com.sample;

public class Applicant {
	String name;
	char gender;
	Date dob;// create date object
	int zipcode;
	boolean single;
	int education_status;

	static final int HIGH_SCHOOL_DIPLOMA= 0;
	static final int UNDERGRAD= 1;
	static final int MASTER= 2;

	public Applicant(String n, char g, Date d, int z, boolean s, int e) {
		name= n;
		gender= g;
		dob= d;
		zipcode= z;
		single= s;
		education_status= e;
	}

//	private String message;
//
//	private int status;
//
//	public String getMessage() {
//		return message;
//	}
//
//	public void setMessage(String message) {
//		this.message= message;
//	}
//
//	public int getStatus() {
//		return status;
//	}
//
//	public void setStatus(int status) {
//		this.status= status;
//	}

}