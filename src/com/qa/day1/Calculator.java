package com.qa.day1;

public class Calculator {

	public static int add(int a, int b) {
		return(a + b);
	}
	public static int subtract(int a, int b) {
		return(a - b);
	}
	public static int multiply(int a, int b) {
		return(a * b);
	}
	public static void divide(double a, double b) {
		if (a >= b) {
			System.out.println(a / b);
		}
		else {
			System.out.println("Division cannot be performed");
	}		
}
}
