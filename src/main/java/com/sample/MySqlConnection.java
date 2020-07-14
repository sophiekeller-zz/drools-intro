package com.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MySqlConnection {
	private Connection connect= null;
	private Statement statement= null;
//	private PreparedStatement preparedStatement= null;
//	private ResultSet resultSet= null;

	final private String host= "rules.carnirybxixz.us-east-1.rds.amazonaws.com";
	final private String user= "admin";
	final private String password= "Qualytics2020!";

	public void readDataBase() throws Exception {
		try {
			// This will load the MySQL driver, each DB has its own driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Setup the connection with the DB
			connect= DriverManager
				.getConnection("jdbc:mysql://" + host, user, password);

			// Statements allow to issue SQL queries to the database
			statement= connect.createStatement();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void writeDataBaseApplicant(Applicant A) {
		String name= A.getName();
		int gender= A.getGender();
		Date dob= A.getDob();
		int single= A.isSingle();
		int education_status= A.getEducation_status();
		int id= A.getId();
		int state= A.getState();
		int risk= A.getRisk();
		int approval_status= A.getApproval_status();
		int approval_score= A.getApproval_score();
		int region= A.getRegion();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Setup the connection with the DB
			connect= DriverManager
				.getConnection("jdbc:mysql://" + host, user, password);

			// Statements allow to issue SQL queries to the database
			statement= connect.createStatement();

			if (state == 1) {
				connect.prepareStatement(
					"INSERT INTO 'applicantRecords' (id, name, dob, gender, single, risk, education, approvalStatus, approval Score, region)" +
						"VALUES (" + id + ", " + name + ", " + dob + ", " + gender + ", " + single + ", " + risk +
						", " +
						education_status + ", " + approval_status + ", " + approval_score + ", " + region + ")");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}