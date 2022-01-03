package com.our.pr09;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainPrac09 {

	public static void main(String[] args) {
		
		Date today = new Date();
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
		
		System.out.println(date.format(today));
	}

}
