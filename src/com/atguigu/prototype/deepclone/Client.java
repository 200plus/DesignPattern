package com.atguigu.prototype.deepclone;

public class Client {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		DeepPrototype p = new DeepPrototype();
		p.name="�ν�";
		p.deepCloneableTargert=new DeepCloneableTargert("��ţ", "��ţ����");
		
		//��ʽ1 ������
//		DeepPrototype p2=(DeepPrototype)p.clone();
//		
//		System.out.println("p.name="+p.name+"p.deepCloneableTargert="+p.deepCloneableTargert.hashCode());
//		System.out.println("p2.name="+p2.name+"p2.deepCloneableTargert="+p2.deepCloneableTargert.hashCode());
//		
		//��ʽ2������
		DeepPrototype p2=(DeepPrototype)p.deepClone();
		System.out.println("p.name="+p.name+"p.deepCloneableTargert="+p.deepCloneableTargert.hashCode());
		System.out.println("p2.name="+p2.name+"p2.deepCloneableTargert="+p2.deepCloneableTargert.hashCode());
		
	}

}
