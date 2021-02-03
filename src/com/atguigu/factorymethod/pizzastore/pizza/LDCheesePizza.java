package com.atguigu.factorymethod.pizzastore.pizza;

public class LDCheesePizza  extends Pizza{
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		setName("伦敦的奶酪pizza");
		System.out.println("北京奶酪披萨准备原材料！！！");
	}
}
