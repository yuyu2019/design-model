package com.gupaoedu.vip.pattern.strategy;

public class CarCost implements IPrice{
	public String countPrice(int path){
		return path*5+"";
	}

}

