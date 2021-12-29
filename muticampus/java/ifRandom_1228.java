package com.our.office;

import java.util.Random;
import java.util.Scanner;

public class ifRandom {
	public static void main(String[] args) {
		
		Scanner score_scanner = new Scanner(System.in);
		
		int a = (int) (Math.random()*100) + 1;
		
		System.out.println("성적 : " + a);
		
		if (a > 90) {
			System.out.println("수 입니다");
		}else if(a>80){
			System.out.println("우 입니다");
		}else if(a>70){
			System.out.println("미 입니다");
		}else if(a>60){
			System.out.println("양 입니다");
		}else {
			System.out.println("가 입니다");
		}
		
//		score_scanner.close();
		
		int A = 4;
		int b = 2;
		boolean c = true;
		
		if (A == 4) {
			if (b%2 ==0) {
				if (c = true) {
					System.out.println("정답");
				}
			}
		}
		
		if (A == 4 && b%2 == 0 && c == true) {
			System.out.println("정답");
		}
		
		
		Random random = new Random();
		
		int dice = random.nextInt(6) + 1;
		
		System.out.println("dice : " + dice);
		
		if (dice == 1) {
			System.out.println("1번이 나왔습니다.");
		}else if (dice == 2) {
			System.out.println("2번이 나왔습니다.");
		}else if (dice == 3) {
			System.out.println("3번이 나왔습니다.");
		}else if (dice == 4) {
			System.out.println("4번이 나왔습니다.");
		}else if (dice == 5) {
			System.out.println("5번이 나왔습니다.");
		}else if (dice == 6) {
			System.out.println("6번이 나왔습니다.");
		}
		
		Scanner sc = new Scanner(System.in);
		
		int user = 1, admin = 2, customer =3, password = 1234;
		int inputNum = sc.nextInt();
		
		
		if (inputNum == user) {
			System.out.println("1");
		}else if (inputNum == admin) {
			System.out.println("비번?");
			int psNum = sc.nextInt();
			
			if (psNum == password) {
				System.out.println("로그인 완료");
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}else if (inputNum == customer) {
			System.out.println("3");
		}
		
	}
}
