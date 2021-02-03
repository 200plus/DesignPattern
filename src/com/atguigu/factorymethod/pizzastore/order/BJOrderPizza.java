package com.atguigu.factorymethod.pizzastore.order;

import com.atguigu.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.atguigu.factorymethod.pizzastore.pizza.BJPepperPizza;
import com.atguigu.factorymethod.pizzastore.pizza.Pizza;

public class BJOrderPizza extends OrderPizza{

	@Override
	Pizza createPizza(String orderType) {
		// TODO Auto-generated method stub
		Pizza pizza=null;
		if(orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		}else if(orderType.equals("pepper")) {
			pizza=new BJPepperPizza();
		}
		return null;
	}

}
