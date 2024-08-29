package com.Encapsulation;

import java.util.Scanner;

public class EmployeeBonus {

	public void calBonus() {
		
		System.out.println("Enter your name");
		Scanner s=new Scanner(System.in);
		String EmpName=s.next();
		System.out.println("Enter your salary");
		Scanner s1=new Scanner(System.in);
		int EmpSalary=s.nextInt();
		System.out.println("Enter your working day");
		Scanner s2=new Scanner(System.in);
		int EmpWorkingDay=s2.nextInt();
		
		
		int	EmpBonus=0;
		
		if(EmpWorkingDay >= 25 && EmpWorkingDay <= 30) {
			
			EmpBonus = (EmpSalary * 10/100);
			System.out.println(EmpBonus);
			
		}else if(EmpWorkingDay >= 15 && EmpWorkingDay < 25) {
			
			EmpBonus = (EmpSalary * 8/100);
			System.out.println(EmpBonus);
			
		}else if(EmpWorkingDay >= 5 && EmpWorkingDay < 15) {
			
			EmpBonus = (EmpSalary * 5/100);
			System.out.println(EmpBonus);
		}else if(EmpWorkingDay >= 1 && EmpWorkingDay < 5) {
			
			EmpBonus = (EmpSalary * 2/100);
			System.out.println(EmpBonus);
		}
		
	}
	public static void main(String [] args) {
		
		EmployeeBonus EB=new EmployeeBonus();
		EB.calBonus();
	}
	
	
}
