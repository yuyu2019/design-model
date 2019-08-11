package com.gupaoedu.vip.pattern.proxy;

public class ProductServiceImpl implements ProductService {
	public void addProduct(String productName) {
	System.out.println("正在添加"+productName);
	}
}
