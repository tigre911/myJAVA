package com.our.office;

public class forMun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		
		for (int i = 50; i<94; i++) {
			System.out.println("i : " + i);
			sum += i;
			System.out.println("sum : " + sum);
		}

		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");
		
		for (int i = 0; i < 10; i++) {
			System.out.println("바깥쪽 for 문 i : " + i);
			for (int j = 0; j < 10; j++) {
				System.out.println("안쪽 for 문 j : " + j);
			}
		}
		
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + i*j);
			}
		}
		
//		char blank = " ";
//		String blank_sum = "";
//		char stars = "*";
//		String star_sum="";
//		
//		for (int i = 0; i < 3; i++) {
//			blank_sum += blank;
//			star_sum += stars;
//			System.out.println(blank_sum + star_sum);		
//		}
		
		System.out.println("   *");
		System.out.println("  ***");
		System.out.println(" *****");
		System.out.println("  ***");
		System.out.println("   *");
		
		
	}

}
