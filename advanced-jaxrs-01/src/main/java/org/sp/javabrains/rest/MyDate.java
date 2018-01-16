package org.sp.javabrains.rest;

public class MyDate {

	private int date;
	private int year;
	private int month;
	
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	@Override
	public String toString() {
		return "MyDate [date=" + date + ", year=" + year + ", month=" + month
				+ "]";
	}
	
	
	
}
