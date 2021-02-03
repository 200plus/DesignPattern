package com.atguigu.singleton.type3;

import com.atguigu.singleton.type3.Singleton;

public class SingletonTest03 {

	public static void main(String[] args) {
		System.out.println("����ʽ(�̲߳���ȫ)");
		Singleton instance=Singleton.getInstance();
		Singleton instance2=Singleton.getInstance();
		System.out.println(instance == instance2);
		System.out.println("instance.hashCode"+instance.hashCode());
		System.out.println("instance2.hashCode"+instance2.hashCode());
		

	}

}
class Singleton{
	private static Singleton instance;
	private Singleton() {
		
	}
	//�ṩһ����̬�Ĺ��з�������ʹ�ø÷���ʱ����ȥ����instance
	//������ʽ
	public static  Singleton getInstance() {
		if(instance==null) {
			instance=new Singleton();
		}
		return instance;
	}
}