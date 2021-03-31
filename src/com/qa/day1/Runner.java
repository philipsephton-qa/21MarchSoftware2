package com.qa.day1;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Calculator.add(6, 2));
		Calculator.divide(1, 2);
		System.out.println(Calculator.multiply(6, 2));
		System.out.println(Calculator.subtract(6, 2));
		
		Results.method1(40, 45, 50);
		Results.method2(120, 100, 120);
		
		boolean bool1 = true;
		boolean bool2 = false;
		if (bool1 && bool1) {
			System.out.println("TRUE!!");
		}
	
	}
}
