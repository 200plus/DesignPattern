package com.atguigu.singleton.type2;

public class SingletonTest02 {

	public static void main(String[] args) {
	//����
		Singleton instance=Singleton.getInstance();
		Singleton instance2=Singleton.getInstance();
		System.out.println(instance == instance2);
		System.out.println("instance.hashCode"+instance.hashCode());
		System.out.println("instance2.hashCode"+instance2.hashCode());
		

	}

}
//����ģʽ����̬������
 class  Singleton{
	 //1��������˽�л����ⲿ��new
	 private  Singleton() {
		
	 }
	 
	 //2�������ڲ���������ʵ��
	 private   static Singleton instance;
	 
	 static {//��̬������У�������������
		 instance =new Singleton();
	 }
	 
	 //3���ṩһ�����еľ�̬����������ʵ������
	 public static Singleton getInstance() {
		 return instance;
	 }
 }