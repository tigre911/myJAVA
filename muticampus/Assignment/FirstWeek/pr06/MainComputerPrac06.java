package com.our.pr06;

public class MainComputerPrac06 {

	public static void main(String[] args) {

		Desktop desktop = new Desktop();
		Keyboard keyboard = new Keyboard();
		Moniter moniter = new Moniter();
		
		System.out.println(desktop.power);
		System.out.println(keyboard.keyConnect);
		System.out.println(moniter.moConnect);
		
		desktop.desktopPowerOn();
		desktop.desktopPowerOff();
		
		if (desktop.power == true) {
			keyboard.keyConnectOn();
			moniter.moConnectOn();
		}else {
			keyboard.keyConnectOff();
			moniter.moConnectOff();
		}
		
		System.out.println(desktop.power);
		System.out.println(keyboard.keyConnect);
		System.out.println(moniter.moConnect);
		
		if (desktop.power == true && keyboard.keyConnect == true && moniter.moConnect == true) {
			System.out.println("컴퓨터가 켜졌습니다.");
		}else {
			System.out.println("컴퓨터가 꺼져있습니다.");
		}
		
		
	}

}
