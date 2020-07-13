package com.sample;

public class Date {
	private int year;
	private int month;
	private int day;

	public Date(String date) {
		String delim= "/";
		String[] tokens= date.split(delim);
		month= Integer.parseInt(tokens[0]);
		day= Integer.parseInt(tokens[1]);
		year= Integer.parseInt(tokens[2]);
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public int getDay() {
		return day;
	}
}