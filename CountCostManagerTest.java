package com.gupaoedu.vip.pattern.strategy;

public class CountCostManagerTest {
	public static void main(String[] args) {
		CountCostManager countCostManager = new CountCostManager();
		countCostManager.setCostType(new BusCost());
		String price = countCostManager.countCost(10);
		System.out.println("公交车费用" + price);

		countCostManager.setCostType(new TaxiCost());
		System.out.println("出租车费用" + countCostManager.countCost(10));

		countCostManager.setCostType(new CarCost());
		System.out.println("小汽车费用" + countCostManager.countCost(10));

	}

}
