package com.our.pr06;

public class Keyboard {
	
	boolean keyConnect = false;
	
	public boolean keyConnectOn() {
		keyConnect = true;
		return keyConnect;
	}
	
	public boolean keyConnectOff() {
		keyConnect = false;
		return keyConnect;
	}
	
}
