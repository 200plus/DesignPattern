package com.atguigu.factory.absfactory.pizzastore.order;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.atguigu.factory.absfactory.pizzastore.pizza.Pizza;

public class OrderPizza {
	AbsFactory factory;

	// ������
	public OrderPizza() {
		setFactory(factory);
	}

	private void setFactory(AbsFactory factory) {
		Pizza pizza = null;
		String orderType = "";// �û�����
		this.factory = factory;
		do {
			orderType = getType();
			// factory�����Ǳ����Ĺ������� Ҳ�������׶صĹ�������
			pizza = factory.createPizza(orderType);
			if (pizza != null) {
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			} else {
				System.out.println("����ʧ��");
				break;
			}
		} while (true);
	}

	// дһ�����������Ի�ȡ�ͻ�ϣ����������������
	private String getType() {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("input pizza ����:");
			String str = strin.readLine();
			return str;
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}
}
