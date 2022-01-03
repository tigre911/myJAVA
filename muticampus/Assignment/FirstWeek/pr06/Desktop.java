package com.our.pr06;

public class Desktop {

	boolean power = false;
	
	public boolean desktopPowerOn() {
		power = true;
		return power;
	}
	
	public boolean desktopPowerOff() {
		power = false;
		return power;
	}
	
}
