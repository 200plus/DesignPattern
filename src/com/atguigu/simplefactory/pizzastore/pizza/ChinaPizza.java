package com.atguigu.simplefactory.pizzastore.pizza;

public class ChinaPizza extends Pizza{

	@Override
	public void prepare() {
		System.out.println("给中国pizza准备原材料");
		
	}

}
