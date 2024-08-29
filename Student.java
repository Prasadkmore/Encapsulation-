package com.Encapsulation;

import java.util.Scanner;

public class Student {
	
	public void studentDetails() {	
		try {	
			System.out.println("Enter the student name");
			Scanner s=new Scanner(System.in);
			String studentname = s.next();
			System.out.println("Enter the student age");
			Scanner s1=new Scanner(System.in);
			int studentage = s1.nextInt();
			
				if(studentage >= 18 && studentage <= 100) {
					System.out.println(studentname  +" "+    studentage);
					System.out.println("Your data submit");
				}else {
					System.out.println("provide valide age");
				}
		
		}catch(Exception e) {
			System.out.println("Check your data");
		}
	}
	public static void main(String [] args) {		
    Student s=new Student();
    s.studentDetails();	
	}		
}
