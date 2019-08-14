package com.gupaoedu.vip.pattern.strategy;

public class CountCostManager {
	public IPrice iPrice;
	
	public void setCostType(IPrice price){
		iPrice = price;
	}
	
	public String countCost(int path){
		return iPrice.countPrice(path);
	}

}
