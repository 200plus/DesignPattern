package com.atguigu.principle.ocp;

public class Ocp {

	public static void main(String[] args) {
//����ʹ�ô��ڵ�����
		GraphicalEditor graphicalEditor = new GraphicalEditor();
		graphicalEditor.drawShape(new Rectangle());
		graphicalEditor.drawShape(new Circle());
		graphicalEditor.drawShape(new Triangle());
	}

}
//����һ�����ڻ�ͼ����[ʹ�÷�]
class GraphicalEditor{
	//����Shape����Ȼ�����type ���Ʋ�ͬ��ͼ��
	public void drawShape(Shape s) {
		   if(s.m_type==1)
			drawRectangle(s);
		else if(s.m_type==2)
			drawCircle(s);
		else if(s.m_type==3)
		    drawTriangle(s);
	}
	//���ƾ���
	public void drawRectangle(Shape r) {
		System.out.println("���ƾ���");
	}
	//����Բ��
	public void drawCircle(Shape r) {
		System.out.println("����Բ��");
	}
	public void drawTriangle(Shape r) {
		System.out.println("����������");
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
//����������
class Triangle extends Shape{
	public  Triangle() {
		super.m_type=3;
	}
}