package com.sample;

public class Applicant {
	private String name;
	private int gender;
	private int dob;// create date object
	private int zipcode;
	private int single;
	private int education_status;
	private int id;
	private int risk;

	// metadata
	private int approval_status;
	private int state;
	private int approval_score;
	private int region;// fake
	private int round;

	// private static int app_id;

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

	// state
	public static final int INCOMPLETE= 0;
	public static final int COMPLETE= 1;

	public static final int LOW= 0;
	public static final int HIGH= 1;

	public Applicant(String n, int g, int d, int z, int s, int e, int r) {
		name= n;
		gender= g;
		dob= d;
		zipcode= z;
		single= s;
		education_status= e;
		risk= r;
		approval_status= PENDING;
		approval_score= 0;
		region= -1;
		round= 0;
		state= COMPLETE;
//		++app_id;
//		id= app_id;

	}

	public Applicant(int id) {
		name= null;
		gender= -1;
		dob= -1;
		zipcode= -1;
		single= -1;
		education_status= -1;
		risk= -1;
		approval_status= PENDING;
		approval_score= 0;
		region= -1;
		round= 0;
		state= COMPLETE;
		this.id= id;
	}

	public int getRisk() {
		return risk;
	}

	public void setRisk(int risk) {
		this.risk= risk;
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

	public void setGender(int gender) {
		this.gender= gender;
	}

	public int getDob() {
		return dob;
	}

	public void setDob(int dob) {
		this.dob= dob;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode= zipcode;
	}

	public int isSingle() {
		return single;
	}

	public void setSingle(int single) {
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

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state= state;
	}

	public int getRound() {
		return round;
	}

	public void setRound(int round) {
		this.round= round;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id= id;
	}

}