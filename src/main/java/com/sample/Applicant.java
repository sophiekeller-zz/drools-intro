package com.sample;

public class Applicant {
	private String name;
	private char gender;
	private Date dob;// create date object
	private int zipcode;
	private boolean single;
	private int education_status;
	private int approval_status;

	public static final int HIGH_SCHOOL_DIPLOMA= 0;
	public static final int BACHELORS= 1;
	public static final int MASTERS= 2;

	public static final int PENDING= 0;
	public static final int APPROVED= 1;
	public static final int DENIED= 2;

	public Applicant(String n, char g, String d, int z, boolean s, int e) {
		name= n;
		gender= g;
		dob= new Date(d);
		zipcode= z;
		single= s;
		education_status= e;
		approval_status= 0;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender= gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob= dob;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode= zipcode;
	}

	public boolean isSingle() {
		return single;
	}

	public void setSingle(boolean single) {
		this.single= single;
	}

	public int getEducation_status() {
		return education_status;
	}

	public void setEducation_status(int education_status) {
		this.education_status= education_status;
	}

	public int getApproval_status() {
		return approval_status;
	}

	public void setApproval_status(int approval_status) {
		this.approval_status= approval_status;
	}

	public void setName(String name) {
		this.name= name;
	}

	public String getName() {
		return name;
	}

}