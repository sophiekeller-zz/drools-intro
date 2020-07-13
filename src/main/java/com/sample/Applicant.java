package com.sample;

public class Applicant {
	private String name;
	private char gender;
	private Date dob;// create date object
	private int zipcode;
	private boolean single;
	private int education_status;

	public static final int HIGH_SCHOOL_DIPLOMA= 0;
	public static final int BACHELORS= 1;
	public static final int MASTERS= 2;

	public Applicant(String n, char g, String d, int z, boolean s, int e) {
		name= n;
		gender= g;
		dob= new Date(d);
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