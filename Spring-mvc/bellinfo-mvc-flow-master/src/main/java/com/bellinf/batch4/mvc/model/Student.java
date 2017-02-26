package com.bellinf.batch4.mvc.model;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



public class Student {
	
	@NotNull
	@Size(min=4,max=15)
	private String name;
	private String course;
	@Min(101)
	private int fee;
	@Min(2017)
	private int year;
	private String currentdate;
	
	
	
	public String getCurrentdate() {
		return currentdate;
	}
	public void setCurrentdate(String currentdate) {
		this.currentdate = currentdate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + ", fee=" + fee
				+ ", year=" + year + ", currentdate=" + currentdate + "]";
	}
	
	}