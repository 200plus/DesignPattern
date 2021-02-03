package com.atguigu.principle.segregation.improve;

public class Segregation1 {

	public static void main(String[] args) {
		//A类通过接口去依赖B类
		A a=new A();
		a.dependency1(new B());
		a.dependency2(new B());
		a.dependency3(new B());
		//C类通过接口依赖D类
		C c = new C();
		c.dependency1(new D());
		c.dependency4(new D());
		c.dependency5(new D());

	}
	
}
//接口
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
			System.out.println("B中实现了 opration1");
		}
		public void operation2() {
			System.out.println("B中实现了 operation2");
		}
		public void operation3(){
			System.out.println("B中实现了 operation3");
		}
		
	}
	class D implements Interface1,Interface3{
		public void operation1() {
			System.out.println("D中实现了 opration1");
		}
		
		public void operation4(){
			System.out.println("D中实现了 operation4");
		}
		public void operation5(){
			System.out.println("D中实现了 operation5");
		}
	}
	class A{//A类通过接口Interface1 依赖(使用)B类，但是只会用到1,2,3方法
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
	class C{//C类通过接口Interface1,Interface3 依赖(使用)B类，但是只会用到1,4,5方法
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