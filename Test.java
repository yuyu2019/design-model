package com.gupaoedu.vip.pattern.proxy;

public class Test {
	public static void main(String[] args) throws Exception {
		ProductService productService = new ProductServiceImpl();
		ProductService proxy = (ProductService) new JdkInvocationHandler()
				.getInstance(productService);
		proxy.addProduct("iphone");
	}
}