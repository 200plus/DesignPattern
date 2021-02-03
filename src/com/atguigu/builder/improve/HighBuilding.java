package com.atguigu.builder.improve;

public class HighBuilding  extends HouseBuilder{

	@Override
	public void buildBasic() {
		// TODO Auto-generated method stub
		System.out.println("高楼地基150m");
	}

	@Override
	public void buildWalls() {
		// TODO Auto-generated method stub
		System.out.println("高楼砌墙240cm");
	}

	@Override
	public void roofed() {
		// TODO Auto-generated method stub
		System.out.println("高楼屋顶 透明方式");
	}

}
