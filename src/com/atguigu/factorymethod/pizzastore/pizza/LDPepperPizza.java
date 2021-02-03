package com.atguigu.factorymethod.pizzastore.pizza;

public class LDPepperPizza extends Pizza {
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		setName("伦敦的胡椒pizza");
		System.out.println("北京胡椒披萨准备原材料！！！");
	}
}
