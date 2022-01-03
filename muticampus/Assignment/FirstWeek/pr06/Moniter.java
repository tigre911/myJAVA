package com.our.pr06;

public class Moniter {
	boolean moConnect = false;
	
	public boolean moConnectOn() {
		moConnect = true;
		return moConnect;
	}
	
	public boolean moConnectOff() {
		moConnect = false;
		return moConnect;
	}
}
