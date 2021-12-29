package com.our.office;

import java.util.Scanner;

public class ifCondition {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if (a > 0) {
			if (a > 10) {
				System.out.print("입력하신 수는 10보다 크고");
			
				if (a % 2 == 0) {
					System.out.print(" 짝수 입니다.");
				}
				else {
					System.out.print(" 홀수 입니다.");
				}
			}
			
			else {
				System.out.print("입력하신 수는 10보다 작고");
				
				if (a % 2 == 0) {
					System.out.print(" 짝수 입니다.");
				}
				else {
					System.out.print(" 홀수 입니다.");
				}
			}
		}
		
		else {
			System.out.println("숫자가 음수 입니다.");
		}
		
		sc.close();
		
	}
}
