package com.our.pr02;

public class MainNationPrac02 {
	public static void main(String[] args) {
		
		String mainName = "global";
		System.out.println("this is " + mainName);
		
		System.out.println("Show all nations");
		Nation01 na1 = new Nation01();
		Nation02 na2 = new Nation02();
		Nation03 na3 = new Nation03();
		
		na1.name();
		na2.name();
		na3.name();
		
	}
}
