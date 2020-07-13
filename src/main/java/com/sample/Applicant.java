package com.sample;

public class Applicant {
	private String name;
	private int gender;
	private Date dob;// create date object
	private int zipcode;
	private boolean single;
	private int education_status;

	// metadata
	private int approval_status;
	private int approval_score;
	private int region;// fake

	public static final int HIGH_SCHOOL_DIPLOMA= 0;
	public static final int BACHELORS= 1;
	public static final int MASTERS= 2;

	public static final int MALE= 0;
	public static final int FEMALE= 1;

	public static final int NORTH= 0;
	public static final int SOUTH= 1;
	public static final int EAST= 2;
	public static final int WEST= 3;

	// metadata globals
	public static final int PENDING= 0;
	public static final int APPROVED_BASIC= 1;
	public static final int APPROVED_ADVANCED= 2;
	public static final int DENIED= 3;

	public Applicant(String n, int g, String d, int z, boolean s, int e) {
		name= n;
		gender= g;
		dob= new Date(d);
		zipcode= z;
		single= s;
		education_status= e;
		approval_status= 0;
		approval_score= 0;
		region= -1;
	}

	public int getApproval_score() {
		return approval_score;
	}

	public void setApproval_score(int approval_score) {
		this.approval_score= approval_score;
	}

	public int getRegion() {
		return region;
	}

	public void setRegion(int region) {
		this.region= region;
	}

	public int getGender() {
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