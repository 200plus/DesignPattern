package com.atguigu.prototype.improve;

import com.atguigu.prototype.improve.Sheep;

public class Sheep implements Cloneable {
  private String name;
  private int age;
  private String color;
  public Sheep friend;
public Sheep(String name, int i, String color) {
	super();
	this.name = name;
	this.age = i;
	this.color = color;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}

@Override
public String toString() {
	return "Sheep [name=" + name + ", age=" + age + ", color=" + color + "]";
}
//��¡��ʵ�� ʹ��Ĭ�ϵ�clone���������
@Override
	protected Object clone() {
		Sheep sheep=null;
		try {
			sheep=(Sheep)super.clone();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return sheep;
	}
  
}
