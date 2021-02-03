package com.atguigu.principle.ocp.improve;

public class Ocp {

	public static void main(String[] args) {
//测试使用存在的问题
		GraphicalEditor graphicalEditor = new GraphicalEditor();
		graphicalEditor.drawShape(new Rectangle());
		graphicalEditor.drawShape(new Circle());
		graphicalEditor.drawShape(new Triangle());
		graphicalEditor.drawShape(new OtherGraphic());
	}

}

//这是一个用于绘图的类[使用方]
class GraphicalEditor {
	// 接收Shape对象，调用draw方法
	public void drawShape(Shape s) {
		s.draw();
	}
	/*
	 * if(s.m_type==1) drawRectangle(s); else if(s.m_type==2) drawCircle(s); else
	 * if(s.m_type==3) drawTriangle(s); }
	 */
	/*
	 * //绘制矩形 public void drawRectangle(Shape r) { System.out.println("绘制矩形"); }
	 * //绘制圆形 public void drawCircle(Shape r) { System.out.println("绘制圆型"); } public
	 * void drawTriangle(Shape r) { System.out.println("绘制三角形"); }
	 */
}

abstract class Shape {
	int m_type;

	public abstract void draw();
}

class Rectangle extends Shape {
	public Rectangle() {
		super.m_type = 1;
	}

	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("绘制矩形");
	}

}

class Circle extends Shape {
	public Circle() {
		super.m_type = 2;
	}

	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("绘制圆型");
	}

}

//绘制三角形
class Triangle extends Shape {
	public Triangle() {
		super.m_type = 3;
	}

	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("绘制三角形");
	}

}
//绘制其他图形
class OtherGraphic extends Shape {
	public OtherGraphic() {
		super.m_type = 4;
	}

	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("绘制其他图形");
	}

}