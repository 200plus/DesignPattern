package com.atguigu.simplefactory.pizzastore.order;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.atguigu.simplefactory.pizzastore.pizza.Pizza;

public class OrderPizza2 {
	Pizza pizza = null;
	String orderType;
	//构造器
	public OrderPizza2() {
		do {
			orderType = getType();
			pizza = SimpleFactory.createPizza2(orderType);
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
