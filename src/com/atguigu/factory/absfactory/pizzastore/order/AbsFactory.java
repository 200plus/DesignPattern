package com.atguigu.factory.absfactory.pizzastore.order;

import com.atguigu.factory.absfactory.pizzastore.pizza.Pizza;

//һ�����󹤳�ģʽ�ĳ���㣨�ӿڣ�
public interface AbsFactory {
	//������Ĺ�������������ʵ��
	public Pizza createPizza(String orderType);
}
