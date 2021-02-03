package com.atguigu.prototype;

public class Sheep {
  private String name;
  private String age;
  private String color;
public Sheep(String name, String age, String color) {
	super();
	this.name = name;
	this.age = age;
	this.color = color;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
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

}
