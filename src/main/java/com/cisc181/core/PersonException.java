package com.cisc181.core;

//import java.sql.Date;
import java.util.Date;

public class PersonException extends Exception{
	private Date DOB;
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date DOB) {
		this.DOB = DOB;
	}
	public PersonException(Date DOB){
		this.DOB = DOB;
		System.out.println("This is an invalid date of birth");
	}
	private String phone_number;
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public PersonException(String phone_number){
		this.phone_number = phone_number;
		System.out.println("This is an invalid phone number");
	}
		
}
