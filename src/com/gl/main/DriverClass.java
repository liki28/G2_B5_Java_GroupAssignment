package com.gl.main;

import java.util.Scanner;

import com.gl.model.AdminDepartment;
import com.gl.model.HRDepartment;
import com.gl.model.SuperDepartment;
import com.gl.model.TechDepartment;

public class DriverClass {
	 public static void main(String[] args) {

	        Scanner in = new Scanner(System.in);
	        int option;

	        SuperDepartment parent = new SuperDepartment(); // base class

	        SuperDepartment admin = new AdminDepartment();
	        HRDepartment hr = new HRDepartment();
	        TechDepartment tech = new TechDepartment();


	            System.out.println("Enter the operation number you want to know department details ");
	            System.out.println("1. Admin\n2. HR \n3. Tech departments");

	            option = in.nextInt();

	            System.out.println();

	            switch (option) {

	                case 1: {
	                    System.out.println(" Welcome to " + admin.departmentName());
	                    System.out.println(admin.getTodaysWork() + "\n" + admin.getWorkDeadline() + "\n" + admin.isTodayAHoliday());
	                    System.out.println();
	                    break;
	                }
	                case 2:{

	                    System.out.println(" Welcome to " + hr.departmentName());
	                    System.out.println(hr.doActivity() + "\n" + hr.getTodaysWork() + "\n" + hr.getWorkDeadline() + "\n" + hr.isTodayAHoliday());
	                    System.out.println();
	                    break;
	                }
	                case 3:{

	                    System.out.println(" Welcome to " + tech.departmentName());
	                    System.out.println(tech.getTodaysWork() + "\n" + tech.getWorkDeadline() + "\n" + tech.getTechStackInformation() + "\n" + tech.isTodayAHoliday());

	                    break;
	                }

	              
	                default:
	                    System.out.println("Enter valid option");
	            }

	    }
	

}
