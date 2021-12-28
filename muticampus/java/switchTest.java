package com.our.office;

import java.util.Scanner;

public class switchTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		switch (num%2) {
		case 0:
			System.out.println("짝수(다빈님꺼에서는 1)");
			break;	
		
		default:
			System.out.println("홀수(다빈님꺼에서는 2");
			break;
		}
		
	}

}
