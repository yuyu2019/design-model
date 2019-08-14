package com.gupaoedu.vip.pattern.strategy;

public class BusCost implements IPrice{
	public String countPrice(int path){
		return path*2+"";
	}
	

}
