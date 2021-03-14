package com.cg.eis.exception;

import java.util.Scanner;

public class EmpoyeeSal {
	public static void main(String [] args) {
		System.out.println("Enter salary");
		Scanner sc=new Scanner(System.in);
		int sal=sc.nextInt();
		try {
			EmpSalExp(sal);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void EmpSalExp(int sal) throws EmployeeException{
		if(sal>=3000) {
			System.out.println("Correct salary");
		}
		else {
			throw new EmployeeException(sal);
		}
	}
	

}
