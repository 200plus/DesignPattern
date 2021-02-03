package com.atguigu.principle.ocp.improve;

public class Ocp {

	public static void main(String[] args) {
//����ʹ�ô��ڵ�����
		GraphicalEditor graphicalEditor = new GraphicalEditor();
		graphicalEditor.drawShape(new Rectangle());
		graphicalEditor.drawShape(new Circle());
		graphicalEditor.drawShape(new Triangle());
		graphicalEditor.drawShape(new OtherGraphic());
	}

}

//����һ�����ڻ�ͼ����[ʹ�÷�]
class GraphicalEditor {
	// ����Shape���󣬵���draw����
	public void drawShape(Shape s) {
		s.draw();
	}
	/*
	 * if(s.m_type==1) drawRectangle(s); else if(s.m_type==2) drawCircle(s); else
	 * if(s.m_type==3) drawTriangle(s); }
	 */
	/*
	 * //���ƾ��� public void drawRectangle(Shape r) { System.out.println("���ƾ���"); }
	 * //����Բ�� public void drawCircle(Shape r) { System.out.println("����Բ��"); } public
	 * void drawTriangle(Shape r) { System.out.println("����������"); }
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
		System.out.println("���ƾ���");
	}

}

class Circle extends Shape {
	public Circle() {
		super.m_type = 2;
	}

	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("����Բ��");
	}

}

//����������
class Triangle extends Shape {
	public Triangle() {
		super.m_type = 3;
	}

	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("����������");
	}

}
//��������ͼ��
class OtherGraphic extends Shape {
	public OtherGraphic() {
		super.m_type = 4;
	}

	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("��������ͼ��");
	}

}