package com.atguigu.simplefactory.pizzastore.order;

import java.io.BufferedReader;
import java.io.InputStreamReader;


import com.atguigu.simplefactory.pizzastore.pizza.Pizza;

public class OrderPizza {
	// 构造器
//	public OrderPizza() {
//		Pizza pizza=null;
//		String orderType;//订购披萨类型
//		do {
//			orderType=getType();
//			if(orderType.equals("greek")) {
//				pizza = new  GreekPizza();
//				pizza.setName("greekPizza");
//			}else if(orderType.equals("cheese")) {
//				pizza=new CheesePizza();
//				pizza.setName("cheesePizza");
//			}else if(orderType.equals("pepper")) {
//				pizza=new PepperPizza();
//				pizza.setName("pepperPizza");
//			}
//			else {
//				break;
//			}
//			//输出pizza制作过程
//			pizza.prepare();
//			pizza.brake();
//			pizza.cut();
//			pizza.box();
//		}while(true);
//	}
	// 定义一个简单工厂对象
	SimpleFactory simpleFactory;
	Pizza pizza = null;

	//构造器
	public OrderPizza(SimpleFactory simpleFactory) {
		setFactory(simpleFactory);
	}
	public void setFactory(SimpleFactory simpleFactory) {
		String orderType = "";// 用户输入的

		this.simpleFactory = simpleFactory;// 设置简单工厂对象
		do {
			orderType = getType();
			pizza = this.simpleFactory.createPizza2(orderType);
			//输出pizza
			if(pizza!=null) {//订购成功
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			}else {
				System.out.println("订购pizza失败！");
				break;
			}
		} while (true);
	}

	// 写一个方法，可以获取客户希望订购的披萨种类
	private String getType() {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("input pizza 种类:");
			String str = strin.readLine();
			return str;
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}
}
