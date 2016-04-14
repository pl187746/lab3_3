package edu.iis.mto.time;

public class SysTime {
	
	static public long bias;
	
	static public long currentTimeMillis() {
		return System.currentTimeMillis() + bias;
	}

}
