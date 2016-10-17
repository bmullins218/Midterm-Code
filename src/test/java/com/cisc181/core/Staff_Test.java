package com.cisc181.core;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void test() {
		ArrayList<Staff> new_staff = new ArrayList<Staff>();
		//Adding Names and Titles to new ArrayList <Staff>
		Staff Billy = new Staff(eTitle.MR);
		Staff Josh = new Staff(eTitle.JR);
		Staff Ben = new Staff(eTitle.SR);
		Staff Erin = new Staff(eTitle.MS);
		Staff Katie = new Staff(eTitle.MRS);
		//Adding staff in ArrayList<Staff> to new_staff ArrayList
		new_staff.add(Billy);
		new_staff.add(Josh);
		new_staff.add(Ben);
		new_staff.add(Erin);
		new_staff.add(Katie);
		//Setting staffs salaries
		Billy.setSalary(100000);
		Josh.setSalary(5500);
		Ben.setSalary(89000);
		Erin.setSalary(45000);
		Katie.setSalary(322000);
		
		//Getting average salary of staff members in ArrayList new_staff
		double AverageSalary = 0;
		for (Staff staff: new_staff){
			AverageSalary +=staff.getSalary();
		}
		AverageSalary /= 5;
		assertTrue(AverageSalary == 112300);
		assertFalse(AverageSalary == 112301);
	}
	
		public static void test_dateOfBirth() throws PersonException{
		//Tests the date of births for the new Staff added to the ArrayList new_staff
		Calendar birthdate = Calendar.getInstance();
		Date DOB = birthdate.getTime();
		Staff Alice = new Staff(eTitle.MRS);
		//Enter birthdate as (YEAR,MONTH,DAY)
		birthdate.set(1969,1,1);
		Alice.setDOB(DOB);
		
		Staff William = new Staff(eTitle.MR);
		birthdate.set(1963,9,26);
		William.setDOB(DOB);
		}
		public static void test_phoneNumber() throws PersonException{
			//Testing the phone numbers of new Staff added to the ArrayList new_staff
			Staff Mike=new Staff(eTitle.III);
			Mike.getPhone();
			Mike.setPhone("(610) 224-55416"); //Will throw an exception (in PersonException) due to invalid phone number type
		
			Staff Mary = new Staff(eTitle.MRS);
			Mary.getPhone();
			Mary.setPhone("(302) 824-9947"); //This phone number is valid	
		}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//assertEquals(1,1);
		

