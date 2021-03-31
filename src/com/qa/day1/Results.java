package com.qa.day1;

public class Results {
	
/*	int biology = x;
	int chemistry = y;
	int physics = z;
	int total = x + y + z;
	double percentage = (total * 100) / 450;
*/	
	public static void method1(int b, int c, int p) {
		System.out.println("Biology Result: " + b);
		System.out.println("Chemistry Result: " + c);
		System.out.println("Physics Results: " + p);
		System.out.println("Results Total: " + (b + c + p));
	}
	
	public static void method2(int b, int c, int p) {
		double per = ((b + c + p) *100) / 450;
		double bPer = (b * 100) /150;
		boolean bbPer = 
			if (bPer >= 60){
				return true;	}
			else {
				return false;	}
		double cPer = (c * 100) /150;
		boolean ccPer = 
				if (cPer >= 60){
					return true;	}
				else {
					return false;	}
		double pPer = (p * 100) /150;
		boolean ppPer = 
				if (pPer >= 60){
					return true;	}
				else {
					return false;	}
		System.out.println("Percentage: " + per);
		if (bbPer ) {
			System.out.println("Fail");
		}
		else if (ccPer) {
			System.out.println("Fail");
		}
		else if (ppPer) {
			System.out.println("Fail");
		}
		else {
			System.out.println("Pass");
		}
	}

}
