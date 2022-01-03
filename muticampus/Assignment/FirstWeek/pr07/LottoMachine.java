package com.our.pr07;

import java.util.Random;

public class LottoMachine {

	Random random = new Random();
	
	int number01 = random.nextInt(45)+1; //1부터 45까지
	int number02 = random.nextInt(45)+1;
	int number03 = random.nextInt(45)+1;
	int number04 = random.nextInt(45)+1;
	int number05 = random.nextInt(45)+1;
	int number06 = random.nextInt(45)+1;
	
	
	public void lotto() {
		System.out.print(number01 + "\t");
		System.out.print(number02 + "\t");
		System.out.print(number03 + "\t");
		System.out.print(number04 + "\t");
		System.out.print(number05 + "\t");
		System.out.print(number06 + "\t");
		}
}
