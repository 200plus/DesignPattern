package com.atguigu.simplefactory.pizzastore.order;

import com.atguigu.simplefactory.pizzastore.pizza.CheesePizza;
import com.atguigu.simplefactory.pizzastore.pizza.ChinaPizza;
import com.atguigu.simplefactory.pizzastore.pizza.GreekPizza;
import com.atguigu.simplefactory.pizzastore.pizza.PepperPizza;
import com.atguigu.simplefactory.pizzastore.pizza.Pizza;

//简单工厂类
public class SimpleFactory {

	// 根据orderType返回对应的Pizza对象
	public static  Pizza createPizza2(String orderType) {
		Pizza pizza = null;
		System.out.println("使用简单工厂模式");
		if (orderType.equals("greek")) {
			pizza = new GreekPizza();
			pizza.setName("greekPizza");
		} else if (orderType.equals("cheese")) {
			pizza = new CheesePizza();
			pizza.setName("cheesePizza");
		} else if (orderType.equals("pepper")) {
			pizza = new PepperPizza();
			pizza.setName("pepperPizza");
		}
		else if(orderType.equals("china")){
			pizza=new ChinaPizza();
			pizza.setName("chinaPizza");
		}
		return pizza;
	}
	//简单工厂模式 也叫静态工厂模式
}
