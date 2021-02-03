package com.atguigu.principle.ocp;

public class Ocp {

	public static void main(String[] args) {
//测试使用存在的问题
		GraphicalEditor graphicalEditor = new GraphicalEditor();
		graphicalEditor.drawShape(new Rectangle());
		graphicalEditor.drawShape(new Circle());
		graphicalEditor.drawShape(new Triangle());
	}

}
//这是一个用于绘图的类[使用方]
class GraphicalEditor{
	//接收Shape对象，然后根据type 绘制不同的图形
	public void drawShape(Shape s) {
		   if(s.m_type==1)
			drawRectangle(s);
		else if(s.m_type==2)
			drawCircle(s);
		else if(s.m_type==3)
		    drawTriangle(s);
	}
	//绘制矩形
	public void drawRectangle(Shape r) {
		System.out.println("绘制矩形");
	}
	//绘制圆形
	public void drawCircle(Shape r) {
		System.out.println("绘制圆型");
	}
	public void drawTriangle(Shape r) {
		System.out.println("绘制三角形");
	}
}


class Shape{
	int m_type;
}
class Rectangle extends Shape{
	public Rectangle() {
		super.m_type=1;
	}
}
class Circle extends Shape{
	public Circle() {
		super.m_type=2;
	}
}
//绘制三角形
class Triangle extends Shape{
	public  Triangle() {
		super.m_type=3;
	}
}