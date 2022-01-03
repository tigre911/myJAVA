package com.our.pr08;

public class MainPrac08 {

	public static void main(String[] args) {
		
		Player player = new Player();
		
		int a = player.playerA; //playerA 가 낸 것
		int b = player.playerB; //playerB 가 낸 것
		
		
		System.out.println("A선수 : " + a +"\t"+ "B선수 : " + b);
		
		if (a == 1 && b == 2) {
			System.out.println("B선수가 이겼습니다.");
		}else if (a == 2 && b == 3) {
			System.out.println("B선수가 이겼습니다.");
		}else if (a ==3 && b == 1) {
			System.out.println("B선수가 이겼습니다.");
		}else if (a == 1 && b == 3) {
			System.out.println("A선수가 이겼습니다.");
		}else if (a == 2 && b == 1) {
			System.out.println("A선수가 이겼습니다.");
		}else if (a == 3 && b == 2) {
			System.out.println("A선수가 이겼습니다.");
		}else {
			System.out.println("비겼습니다.");
		}
		
	}

}
