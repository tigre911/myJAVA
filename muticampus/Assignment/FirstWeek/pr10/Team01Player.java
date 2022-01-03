package com.our.pr10;

import java.util.Random;

public class Team01Player extends Team01 {

	Random random = new Random();
	
	int playerA = random.nextInt(3)+1;

	public int aNum() {
		this.playerA = playerA;
		return playerA;
	}
	
	
	
//	1 = 가위 , 2 = 바위 , 3 = 보
	
}
