package com.atguigu.builder.improve;
//����Ľ�����
public  abstract class HouseBuilder {
	protected House house=new House();
	//�����������д�� �����󷽷�
	public abstract void  buildBasic();
	public abstract void  buildWalls();
	public abstract void  roofed();
	
	//���췿�Ӻ󣬽���Ʒ�����ӣ�����
	public House buildHouse(){
		return  house;
	}
}
