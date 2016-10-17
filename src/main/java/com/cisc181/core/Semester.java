package com.cisc181.core;
import java.util.Date;

import java.util.UUID;

public class Semester {
	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;
	//private UUID SectionID;
	
	public Semester(){
			
	}
	public Semester(UUID semesterID, Date startdate, Date enddate){
		super();
		SemesterID = semesterID;
		StartDate = startdate;
		EndDate = enddate;
	}
	
	public UUID getSemesterID() {
		return SemesterID;
	}
	public void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
	}
	public Date getStartDate() {
		return StartDate;
	}
	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}
	public Date getEndDate() {
		return EndDate;
	}
	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}
	
	

}
