package com.cisc181.core;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;
public class Student_Test {
	public static Date date(int year, int month, int day){
		Calendar the_date = Calendar.getInstance();
		the_date.set(year,month,day);
		return the_date.getTime();
	}
	
	
	

	@BeforeClass
	public static void setup() {
		ArrayList<Course> courses = new ArrayList<Course>();
		ArrayList<Semester> semester = new ArrayList<Semester>();
		ArrayList<Section> section = new ArrayList<Section>();
		ArrayList<Student> student = new ArrayList<Student>();
		ArrayList<Enrollment> enrollment = new ArrayList<Enrollment>();
		
		Course Engineering = new Course(UUID.randomUUID(),"Engineering I",5,eMajor.ENGINEERING);
		courses.add(Engineering);
		Course CompSi = new Course(UUID.randomUUID(),"Computer Science II",1,eMajor.COMPSI);
		courses.add(CompSi);
		Course Business = new Course(UUID.randomUUID(),"Business 101",0,eMajor.BUSINESS);
		courses.add(Business);
	
		Semester Fall = new Semester(UUID.randomUUID(),date(2016,8,30),date(2016,12,19));
		semester.add(Fall);
		Semester Spring = new Semester(UUID.randomUUID(),date(2017,2,6),date(2017,5,19));
		semester.add(Spring);
		
		Section Engineering_fall = new Section(Engineering.getCourseID(),Fall.getSemesterID(),205);
		section.add(Engineering_fall);
		Section CompSi_fall = new Section(CompSi.getCourseID(),Fall.getSemesterID(),181);
		section.add(CompSi_fall);
		Section Business_fall = new Section(Business.getCourseID(),Fall.getSemesterID(),101);
		section.add(Business_fall);
		
		Section Engineering_spring = new Section(Engineering.getCourseID(),Fall.getSemesterID(),305);
		section.add(Engineering_spring);
		Section CompSi_spring = new Section(Engineering.getCourseID(),Fall.getSemesterID(),220);
		section.add(CompSi_spring);
		Section Business_spring = new Section(Engineering.getCourseID(),Fall.getSemesterID(),107);
		section.add(Business_spring);
		
		
		//Changed grades to point values to calculate the gpa of each student easier. Grade is to the right commented out
		
		Student student0 = new Student("William","","Mullins",date(1995,2,18),eMajor.ENGINEERING,"136 Woodlawn Ave."
				+ "Newark,DE","(302) 555-2222","bmullins@udel.edu");
		student.add(student0);
		Enrollment EngineeringF16_S0 = new Enrollment(Engineering_fall.getSectionID(),student0.getStudentID());
		EngineeringF16_S0.setGrade(2.7);//(81);
		Enrollment CompSiF16_S0 = new Enrollment(CompSi_fall.getSectionID(),student0.getStudentID());
		CompSiF16_S0.setGrade(4.0);//(95);
		Enrollment BusinessF16_S0 = new Enrollment(Business_fall.getSectionID(),student0.getStudentID());
		BusinessF16_S0.setGrade(4.0);//(98);
		Enrollment EngineeringS17_S0 = new Enrollment(Engineering_spring.getSectionID(),student0.getStudentID());
		EngineeringS17_S0.setGrade(2.0);//(75)
		Enrollment CompSiS17_S0 = new Enrollment(CompSi_spring.getSectionID(),student0.getStudentID());
		CompSiS17_S0.setGrade(4.0);//(98)
		Enrollment BusinessS17_S0 = new Enrollment(Business_spring.getSectionID(),student0.getStudentID());
		BusinessS17_S0.setGrade(3.3);//(87)
		
		double GPAstudent0 = ((EngineeringF16_S0.getGrade()+CompSiF16_S0.getGrade()+BusinessF16_S0.getGrade()+
				EngineeringS17_S0.getGrade()+CompSiS17_S0.getGrade()+ BusinessS17_S0.getGrade())/6);
		assertEquals("GPA for student0 is:",GPAstudent0==3.33);
		
		
		Student student1 = new Student("Billie","Bob","Smith",date(1989,10,1),eMajor.BUSINESS,"137 Woodlawn Ave."
				+ "Newark,DE","(302) 555-2220","bsmith@udel.edu");
		student.add(student1);
		Enrollment EngineeringF16_S1 = new Enrollment(Engineering_fall.getSectionID(),student1.getStudentID());
		EngineeringF16_S1.setGrade(1.7);//(70)
		Enrollment CompSiF16_S1 = new Enrollment(CompSi_fall.getSectionID(),student1.getStudentID());
		CompSiF16_S1.setGrade(3.7);//(90)
		Enrollment BusinessF16_S1 = new Enrollment(Business_fall.getSectionID(),student1.getStudentID());
		BusinessF16_S1.setGrade(2.7);//(80)
		Enrollment EngineeringS17_S1 = new Enrollment(Engineering_spring.getSectionID(),student1.getStudentID());
		EngineeringS17_S1.setGrade(1.0);//65
		Enrollment CompSiS17_S1 = new Enrollment(CompSi_spring.getSectionID(),student1.getStudentID());
		CompSiS17_S1.setGrade(3.7);//(90)
		Enrollment BusinessS17_S1 = new Enrollment(Business_spring.getSectionID(),student1.getStudentID());
		BusinessS17_S1.setGrade(4.0);//(100)
		
		double GPAstudent1 = ((EngineeringF16_S1.getGrade()+CompSiF16_S1.getGrade()+BusinessF16_S1.getGrade()+
				EngineeringS17_S1.getGrade()+CompSiS17_S1.getGrade()+ BusinessS17_S1.getGrade())/6);
		assertEquals("GPA for student1 is:",GPAstudent1==2.8);
		
		Student student2 = new Student("Jimmy","Crack","Corn",date(1993,5,15),eMajor.NURSING,"138 Woodlawn Ave."
				+ "Newark,DE","(302) 555-2221","jcorn@udel.edu");
		student.add(student2);
		Enrollment EngineeringF16_S2 = new Enrollment(Engineering_fall.getSectionID(),student2.getStudentID());
		EngineeringF16_S2.setGrade(0.7);//(60)
		Enrollment CompSiF16_S2 = new Enrollment(CompSi_fall.getSectionID(),student2.getStudentID());
		CompSiF16_S2.setGrade(1.7);//(70)
		Enrollment BusinessF16_S2 = new Enrollment(Business_fall.getSectionID(),student2.getStudentID());
		BusinessF16_S2.setGrade(3.0);//(85)
		Enrollment EngineeringS17_S2 = new Enrollment(Engineering_spring.getSectionID(),student2.getStudentID());
		EngineeringS17_S2.setGrade(3.7);//(90)
		Enrollment CompSiS17_S2 = new Enrollment(CompSi_spring.getSectionID(),student2.getStudentID());
		CompSiS17_S2.setGrade(4.0);//(95)
		Enrollment BusinessS17_S2 = new Enrollment(Business_spring.getSectionID(),student2.getStudentID());
		BusinessS17_S2.setGrade(4.0);//(100)
		
		double GPAstudent2 = ((EngineeringF16_S2.getGrade()+CompSiF16_S2.getGrade()+BusinessF16_S2.getGrade()+
				EngineeringS17_S2.getGrade()+CompSiS17_S2.getGrade()+ BusinessS17_S2.getGrade())/6);
		assertEquals("GPA for student2 is:",GPAstudent2==2.85);
		
		Student student3 = new Student("Snake","","Pliscan",date(1996,3,18),eMajor.PHYSICS,"139 Woodlawn Ave."
				+ "Newark,DE","(302) 555-2223","snake@udel.edu");
		student.add(student3);
		Enrollment EngineeringF16_S3 = new Enrollment(Engineering_fall.getSectionID(),student3.getStudentID());
		EngineeringF16_S3.setGrade(0);//(55)
		Enrollment CompSiF16_S3 = new Enrollment(CompSi_fall.getSectionID(),student3.getStudentID());
		CompSiF16_S3.setGrade(3.7);//(90)
		Enrollment BusinessF16_S3 = new Enrollment(Business_fall.getSectionID(),student3.getStudentID());
		BusinessF16_S3.setGrade(4.0);//(98)
		Enrollment EngineeringS17_S3 = new Enrollment(Engineering_spring.getSectionID(),student3.getStudentID());
		EngineeringS17_S3.setGrade(2.0);//(75)
		Enrollment CompSiS17_S3 = new Enrollment(CompSi_spring.getSectionID(),student3.getStudentID());
		CompSiS17_S3.setGrade(2.7);//(82)
		Enrollment BusinessS17_S3 = new Enrollment(Business_spring.getSectionID(),student3.getStudentID());
		BusinessS17_S3.setGrade(2.3);//(78)
		
		double GPAstudent3 = ((EngineeringF16_S3.getGrade()+CompSiF16_S3.getGrade()+BusinessF16_S3.getGrade()+
				EngineeringS17_S3.getGrade()+CompSiS17_S3.getGrade()+ BusinessS17_S3.getGrade())/6);
		assertEquals("GPA for student3 is:",GPAstudent3==2.45);
		
		Student student4 = new Student("Bo","","Duke",date(1996,8,21),eMajor.CHEM,"130 Woodlawn Ave."
				+ "Newark,DE","(302) 555-2224","boduke@udel.edu");
		student.add(student4);
		Enrollment EngineeringF16_S4 = new Enrollment(Engineering_fall.getSectionID(),student4.getStudentID());
		EngineeringF16_S4.setGrade(1.3);//(69)
		Enrollment CompSiF16_S4 = new Enrollment(CompSi_fall.getSectionID(),student4.getStudentID());
		CompSiF16_S4.setGrade(4.0);//(96)
		Enrollment BusinessF16_S4 = new Enrollment(Business_fall.getSectionID(),student4.getStudentID());
		BusinessF16_S4.setGrade(1.7);//(71)
		Enrollment EngineeringS17_S4 = new Enrollment(Engineering_spring.getSectionID(),student4.getStudentID());
		EngineeringS17_S4.setGrade(2.0);//(75)
		Enrollment CompSiS17_S4 = new Enrollment(CompSi_spring.getSectionID(),student4.getStudentID());
		CompSiS17_S4.setGrade(3.7);//(93)
		Enrollment BusinessS17_S4 = new Enrollment(Business_spring.getSectionID(),student4.getStudentID());
		BusinessS17_S4.setGrade(2.7);//(83)
		
		double GPAstudent4 = ((EngineeringF16_S4.getGrade()+CompSiF16_S4.getGrade()+BusinessF16_S4.getGrade()+
				EngineeringS17_S4.getGrade()+CompSiS17_S4.getGrade()+ BusinessS17_S4.getGrade())/6);
		assertEquals("GPA for student4 is:",GPAstudent4==2.56);
		
		Student student5 = new Student("Wendy","Woo","Who",date(1995,10,16),eMajor.COMPSI,"131 Woodlawn Ave."
				+ "Newark,DE","(302) 555-2225","woowho@udel.edu");
		student.add(student5);
		Enrollment EngineeringF16_S5 = new Enrollment(Engineering_fall.getSectionID(),student5.getStudentID());
		EngineeringF16_S5.setGrade(4.0);//(100)
		Enrollment CompSiF16_S5 = new Enrollment(CompSi_fall.getSectionID(),student5.getStudentID());
		CompSiF16_S5.setGrade(4.0);//(100)
		Enrollment BusinessF16_S5 = new Enrollment(Business_fall.getSectionID(),student5.getStudentID());
		BusinessF16_S5.setGrade(4.0);//(100)
		Enrollment EngineeringS17_S5 = new Enrollment(Engineering_spring.getSectionID(),student5.getStudentID());
		EngineeringS17_S5.setGrade(4.0);//(100)
		Enrollment CompSiS17_S5 = new Enrollment(CompSi_spring.getSectionID(),student5.getStudentID());
		CompSiS17_S5.setGrade(4.0);//(100)
		Enrollment BusinessS17_S5 = new Enrollment(Business_spring.getSectionID(),student5.getStudentID());
		BusinessS17_S5.setGrade(4.0);//(100)
		
		double GPAstudent5 = ((EngineeringF16_S5.getGrade()+CompSiF16_S5.getGrade()+BusinessF16_S5.getGrade()+
				EngineeringS17_S5.getGrade()+CompSiS17_S5.getGrade()+ BusinessS17_S5.getGrade())/6);
		assertEquals("GPA for student5 is:",GPAstudent5==4.0);
		
		Student student6 = new Student("John","Jacob","Jacobhimersmidt",date(1994,1,1),eMajor.ENGINEERING,"132 Woodlawn Ave."
				+ "Newark,DE","(302) 555-2226","jjj@udel.edu");
		student.add(student6);
		Enrollment EngineeringF16_S6 = new Enrollment(Engineering_fall.getSectionID(),student6.getStudentID());
		EngineeringF16_S6.setGrade(0.7);//(60)
		Enrollment CompSiF16_S6 = new Enrollment(CompSi_fall.getSectionID(),student6.getStudentID());
		CompSiF16_S6.setGrade(1.7);//(70)
		Enrollment BusinessF16_S6 = new Enrollment(Business_fall.getSectionID(),student6.getStudentID());
		BusinessF16_S6.setGrade(0.7);//(60)
		Enrollment EngineeringS17_S6 = new Enrollment(Engineering_spring.getSectionID(),student6.getStudentID());
		EngineeringS17_S6.setGrade(1.7);//(70)
		Enrollment CompSiS17_S6 = new Enrollment(CompSi_spring.getSectionID(),student6.getStudentID());
		CompSiS17_S6.setGrade(0.7);//(60)
		Enrollment BusinessS17_S6 = new Enrollment(Business_spring.getSectionID(),student6.getStudentID());
		BusinessS17_S6.setGrade(1.7);//(70)
		
		double GPAstudent6 = ((EngineeringF16_S6.getGrade()+CompSiF16_S6.getGrade()+BusinessF16_S6.getGrade()+
				EngineeringS17_S6.getGrade()+CompSiS17_S6.getGrade()+ BusinessS17_S6.getGrade())/6);
		assertEquals("GPA for student6 is:",GPAstudent6==1.2);
		
		Student student7 = new Student("Katie","Marie","Davis",date(1998,2,18),eMajor.BUSINESS,"133 Woodlawn Ave."
				+ "Newark,DE","(302) 555-2227","kmd@udel.edu");
		student.add(student7);
		Enrollment EngineeringF16_S7 = new Enrollment(Engineering_fall.getSectionID(),student7.getStudentID());
		EngineeringF16_S7.setGrade(2.7);//(80)
		Enrollment CompSiF16_S7 = new Enrollment(CompSi_fall.getSectionID(),student7.getStudentID());
		CompSiF16_S7.setGrade(3.7);//(90)
		Enrollment BusinessF16_S7 = new Enrollment(Business_fall.getSectionID(),student7.getStudentID());
		BusinessF16_S7.setGrade(1.7);//(70)
		Enrollment EngineeringS17_S7 = new Enrollment(Engineering_spring.getSectionID(),student7.getStudentID());
		EngineeringS17_S7.setGrade(2.7);//(90)
		Enrollment CompSiS17_S7 = new Enrollment(CompSi_spring.getSectionID(),student7.getStudentID());
		CompSiS17_S7.setGrade(4.0);//(100)
		Enrollment BusinessS17_S7 = new Enrollment(Business_spring.getSectionID(),student7.getStudentID());
		BusinessS17_S7.setGrade(3.7);//(90)
		
		double GPAstudent7 = ((EngineeringF16_S7.getGrade()+CompSiF16_S7.getGrade()+BusinessF16_S7.getGrade()+
				EngineeringS17_S7.getGrade()+CompSiS17_S7.getGrade()+ BusinessS17_S7.getGrade())/6);
		assertEquals("GPA for student7 is:",GPAstudent7==3.08);
		
		Student student8 = new Student("Erin","Macy","Lussman",date(1997,2,22),eMajor.NURSING,"134 Woodlawn Ave."
				+ "Newark,DE","(302) 555-2228","eluss@udel.edu");
		student.add(student8);
		Enrollment EngineeringF16_S8 = new Enrollment(Engineering_fall.getSectionID(),student8.getStudentID());
		EngineeringF16_S8.setGrade(3.3);//(87)
		Enrollment CompSiF16_S8 = new Enrollment(CompSi_fall.getSectionID(),student8.getStudentID());
		CompSiF16_S8.setGrade(3.0);//(86)
		Enrollment BusinessF16_S8 = new Enrollment(Business_fall.getSectionID(),student8.getStudentID());
		BusinessF16_S8.setGrade(3.0);//(85)
		Enrollment EngineeringS17_S8 = new Enrollment(Engineering_spring.getSectionID(),student8.getStudentID());
		EngineeringS17_S8.setGrade(2.7);//(83)
		Enrollment CompSiS17_S8 = new Enrollment(CompSi_spring.getSectionID(),student8.getStudentID());
		CompSiS17_S8.setGrade(2.7);//(83)
		Enrollment BusinessS17_S8 = new Enrollment(Business_spring.getSectionID(),student8.getStudentID());
		BusinessS17_S8.setGrade(2.7);//(82)
		
		double GPAstudent8 = ((EngineeringF16_S8.getGrade()+CompSiF16_S8.getGrade()+BusinessF16_S8.getGrade()+
				EngineeringS17_S8.getGrade()+CompSiS17_S8.getGrade()+ BusinessS17_S8.getGrade())/6);
		assertEquals("GPA for student8 is:",GPAstudent8==2.9);
		
		Student student9 = new Student("Sophie","Kate","Johnson",date(1994,12,24),eMajor.PHYSICS,"135 Woodlawn Ave."
				+ "Newark,DE","(302) 555-2229","skj@udel.edu");
		student.add(student9);
		Enrollment EngineeringF16_S9 = new Enrollment(Engineering_fall.getSectionID(),student9.getStudentID());
		EngineeringF16_S9.setGrade(2.7);//(81)
		Enrollment CompSiF16_S9 = new Enrollment(CompSi_fall.getSectionID(),student9.getStudentID());
		CompSiF16_S9.setGrade(2.7);//(80)
		Enrollment BusinessF16_S9 = new Enrollment(Business_fall.getSectionID(),student9.getStudentID());
		BusinessF16_S9.setGrade(2.3);//(79)
		Enrollment EngineeringS17_S9 = new Enrollment(Engineering_spring.getSectionID(),student9.getStudentID());
		EngineeringS17_S9.setGrade(2.3);//(78)
		Enrollment CompSiS17_S9 = new Enrollment(CompSi_spring.getSectionID(),student9.getStudentID());
		CompSiS17_S9.setGrade(2.3);//(77)
		Enrollment BusinessS17_S9 = new Enrollment(Business_spring.getSectionID(),student9.getStudentID());
		BusinessS17_S9.setGrade(2.0);//(76)
		
		double GPAstudent9 = ((EngineeringF16_S9.getGrade()+CompSiF16_S9.getGrade()+BusinessF16_S9.getGrade()+
				EngineeringS17_S9.getGrade()+CompSiS17_S9.getGrade()+ BusinessS17_S9.getGrade())/6);
		assertEquals("GPA for student9 is:",GPAstudent9==2.38);
		
		//Average Course Grades
		double EngineeringAvg = ((EngineeringF16_S0.getGrade()+EngineeringS17_S0.getGrade()+
									  EngineeringF16_S1.getGrade()+EngineeringS17_S1.getGrade()+
									  EngineeringF16_S2.getGrade()+EngineeringS17_S2.getGrade()+
									  EngineeringF16_S3.getGrade()+EngineeringS17_S3.getGrade()+
									  EngineeringF16_S4.getGrade()+EngineeringS17_S4.getGrade()+
									  EngineeringF16_S5.getGrade()+EngineeringS17_S5.getGrade()+
									  EngineeringF16_S6.getGrade()+EngineeringS17_S6.getGrade()+
									  EngineeringF16_S7.getGrade()+EngineeringS17_S7.getGrade()+
									  EngineeringF16_S8.getGrade()+EngineeringS17_S8.getGrade()+
									  EngineeringF16_S9.getGrade()+EngineeringS17_S9.getGrade())/20);
		assertEquals("Engineering Average",EngineeringAvg==76.7);
			
		double CompSiAvg = ((CompSiF16_S0.getGrade()+CompSiF16_S0.getGrade()+
							     CompSiF16_S1.getGrade()+CompSiF16_S1.getGrade()+
							     CompSiF16_S2.getGrade()+CompSiF16_S2.getGrade()+
							     CompSiF16_S3.getGrade()+CompSiF16_S3.getGrade()+
							     CompSiF16_S4.getGrade()+CompSiF16_S4.getGrade()+
							     CompSiF16_S5.getGrade()+CompSiF16_S5.getGrade()+
							     CompSiF16_S6.getGrade()+CompSiF16_S6.getGrade()+
							     CompSiF16_S7.getGrade()+CompSiF16_S7.getGrade()+
							     CompSiF16_S8.getGrade()+CompSiF16_S8.getGrade()+
							     CompSiF16_S9.getGrade()+CompSiF16_S9.getGrade())/20);
		assertEquals("Computer Science Average",CompSiAvg==78.65);
		
		double BusinessAvg = ((BusinessS17_S0.getGrade()+BusinessS17_S0.getGrade()+
								   BusinessS17_S1.getGrade()+BusinessS17_S1.getGrade()+
								   BusinessS17_S2.getGrade()+BusinessS17_S2.getGrade()+
								   BusinessS17_S3.getGrade()+ BusinessS17_S3.getGrade()+
								   BusinessS17_S4.getGrade()+BusinessS17_S4.getGrade()+
								   BusinessS17_S5.getGrade()+BusinessS17_S5.getGrade()+
								   BusinessS17_S6.getGrade()+BusinessS17_S6.getGrade()+
								   BusinessS17_S7.getGrade()+BusinessS17_S7.getGrade()+
								   BusinessS17_S8.getGrade()+ BusinessS17_S8.getGrade()+
								   BusinessS17_S9.getGrade()+BusinessS17_S9.getGrade())/20);		   					   					 
		assertEquals("Business Average",BusinessAvg==84.6);
		

	}

	@Test
	//Cannot get error on "majorChange()" method to go away to test other methods
	//This is the test for changing the major of one student
	//Must create new instance of student (student 10)
	public void majorChange(){
		Student student10 = new Student("Bobby","","Johns",date(1994,2,28),eMajor.CHEM,"150 Woodlawn Ave."
				+ "Newark,DE","(302) 555-2129","jb@udel.edu");
		student10.setMajor(eMajor.NURSING);
		assertEquals(eMajor.NURSING,student10.getMajor());
		
		
	}
}