package com.atguigu.simplefactory.pizzastore.order;

//相当于一个客户端
public class PizzaStore {

	public static void main(String[] args) {
//			new OrderPizza();
		//使用简单工厂模式
//		new OrderPizza(new SimpleFactory());
//		System.out.println("~~退出程序~~");
		new OrderPizza2();
	}

}
