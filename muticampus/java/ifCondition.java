package com.our.office;

import java.util.Scanner;

public class ifCondition {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if (a > 0) {
			if (a > 10) {
				System.out.print("�Է��Ͻ� ���� 10���� ũ��");
			
				if (a % 2 == 0) {
					System.out.print(" ¦�� �Դϴ�.");
				}
				else {
					System.out.print(" Ȧ�� �Դϴ�.");
				}
			}
			
			else {
				System.out.print("�Է��Ͻ� ���� 10���� �۰�");
				
				if (a % 2 == 0) {
					System.out.print(" ¦�� �Դϴ�.");
				}
				else {
					System.out.print(" Ȧ�� �Դϴ�.");
				}
			}
		}
		
		else {
			System.out.println("���ڰ� ���� �Դϴ�.");
		}
		
		sc.close();
		
	}
}
