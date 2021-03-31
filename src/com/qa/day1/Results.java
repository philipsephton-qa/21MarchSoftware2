package com.qa.day1;

public class Results {
	
	int biology = x;
	int chemistry = y;
	int physics = z;
	int total = x + y + z;
	double percentage = (total * 100) / 450;
	
	public static void method1(int b, int c, int p) {
		System.out.println("Biology Result: " + b);
		System.out.println("Chemistry Result: " + c);
		System.out.println("Physics Results: " + p);
		System.out.println("Results Total: " + (b + c + p));
	}
	
	public static void method2(int b, int c, int p) {
		double per = ((b + c + p) *100) / 450;
		System.out.println("Percentage: " + per);
	}

}
