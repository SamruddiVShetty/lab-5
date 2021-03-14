package com.cg.eis.exception;

public class EmployeeException extends Exception{
	int sal;
 public EmployeeException(int sal) {
	 this.sal=sal;
	
}
@Override
public String toString() {
	return "EmployeeException [sal=" + sal + "]";
}
 
}
