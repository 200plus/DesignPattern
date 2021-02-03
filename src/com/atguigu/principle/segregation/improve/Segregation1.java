package com.atguigu.principle.segregation.improve;

public class Segregation1 {

	public static void main(String[] args) {
		//A��ͨ���ӿ�ȥ����B��
		A a=new A();
		a.dependency1(new B());
		a.dependency2(new B());
		a.dependency3(new B());
		//C��ͨ���ӿ�����D��
		C c = new C();
		c.dependency1(new D());
		c.dependency4(new D());
		c.dependency5(new D());

	}
	
}
//�ӿ�
	interface Interface1{
		void operation1();
	}
	interface Interface2{
		void operation2();
		void operation3();
	}
	interface  Interface3{
		void operation4();
		void operation5();
	}
	class B implements Interface1,Interface2{
		public void operation1() {
			System.out.println("B��ʵ���� opration1");
		}
		public void operation2() {
			System.out.println("B��ʵ���� operation2");
		}
		public void operation3(){
			System.out.println("B��ʵ���� operation3");
		}
		
	}
	class D implements Interface1,Interface3{
		public void operation1() {
			System.out.println("D��ʵ���� opration1");
		}
		
		public void operation4(){
			System.out.println("D��ʵ���� operation4");
		}
		public void operation5(){
			System.out.println("D��ʵ���� operation5");
		}
	}
	class A{//A��ͨ���ӿ�Interface1 ����(ʹ��)B�࣬����ֻ���õ�1,2,3����
		public void dependency1(Interface1 i) {
			i.operation1();
		}
		public void dependency2(Interface2 i) {
			i.operation2();
		}
		public void dependency3(Interface2 i) {
			i.operation3();
		}
	}
	class C{//C��ͨ���ӿ�Interface1,Interface3 ����(ʹ��)B�࣬����ֻ���õ�1,4,5����
		public void dependency1(Interface1 i) {
			i.operation1();
		}
		public void dependency4(Interface3 i) {
			i.operation4();
		}
		public void dependency5(Interface3 i) {
			i.operation5();
		}
	}