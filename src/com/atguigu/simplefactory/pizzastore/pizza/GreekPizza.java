package com.atguigu.simplefactory.pizzastore.pizza;

public class GreekPizza extends Pizza {

	@Override
	public void prepare() {
		System.out.println("给希腊pizza准备原材料!");
		
	}

}
