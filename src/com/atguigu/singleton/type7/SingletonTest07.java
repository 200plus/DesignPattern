package com.atguigu.singleton.type7;

public class SingletonTest07 {

	public static void main(String[] args) {
		System.out.println("静态内部类完成单例模式");
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
	//写一个静态内部类 该类中有一个静态属性Singleton
	private static class SingletonInstance{
		private static final Singleton INSTANCE=new Singleton();
	}
	
	// 提供一个静态的公有方法 直接返回  SingletonInstance.INSTANCE
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