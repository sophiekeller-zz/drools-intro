package com.sample;

public class ApplicantInfo {
	private String name;
	private int gender;
	private int dob;// create date object
	private int zipcode;
	private int single;
	private int education_status;
	private int id;
	private int risk;
	private Applicant applicant;

	private static int app_id;

	public ApplicantInfo() {
		name= "Rachel Green";
		gender= 0;
		dob= 1999;
		zipcode= 22124;
		single= 1;
		education_status= 1;
		++app_id;
		id= app_id;
		risk= 0;
		applicant= new Applicant(id);

	}

	public void setGender() {
		applicant.setGender(gender);
	}

	public String getName() {
		return name;
	}

	public int getGender() {
		return gender;
	}

	public int getDob() {
		return dob;
	}

	public int getZipcode() {
		return zipcode;
	}

	public int getSingle() {
		return single;
	}

	public int getEducation_status() {
		return education_status;
	}

	public int getId() {
		return id;
	}

	public int getRisk() {
		return risk;
	}

	public Applicant getApplicant() {
		return applicant;
	}
}