package com.atguigu.singleton.type7;

public class SingletonTest07 {

	public static void main(String[] args) {
		System.out.println("��̬�ڲ�����ɵ���ģʽ");
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2);
		System.out.println("instance.hashCode" + instance.hashCode());
		System.out.println("instance2.hashCode" + instance2.hashCode());

	}

}


class Singleton {
	private static volatile Singleton instance;

	private Singleton() {

	}
	//дһ����̬�ڲ��� ��������һ����̬����Singleton
	private static class SingletonInstance{
		private static final Singleton INSTANCE=new Singleton();
	}
	
	// �ṩһ����̬�Ĺ��з��� ֱ�ӷ���  SingletonInstance.INSTANCE
	public static synchronized Singleton getInstance() {
		/*
		 * if (instance == null) { synchronized (Singleton.class) { if (instance ==
		 * null) { instance = new Singleton(); }
		 * 
		 * } }
		 */
		return SingletonInstance.INSTANCE;
	}
}