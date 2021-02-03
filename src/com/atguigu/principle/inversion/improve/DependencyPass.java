package com.atguigu.principle.inversion.improve;



public class DependencyPass {

	public static void main(String[] args) {
		ChangHong changHong = new ChangHong();
		OpenAndClose openAndClose = new OpenAndClose();
		openAndClose.open(changHong);
	}

}

//方法1、通过结构传递实现依赖
	interface IOpenAndClose{
	public void open(ITV tv);//抽象方法 接收接口
}
	interface ITV{//ITV 接口
	public void play();
}
   //方法1测试
   class ChangHong implements ITV{
		public void play() {
			System.out.println("长虹电视机，打开");
	}
   }
	//实现接口
   class OpenAndClose implements IOpenAndClose{
   public void open(ITV tv) {
		tv.play();
	}
}
/*//方法2：通过构造器方法依赖传递
interface IOpenAndClose{
	public void open();//抽象方法
	
}
interface ITV{
	public void play();
}
//方法2测试
   class ChangHong implements ITV{
		public void play() {
			System.out.println("长虹电视机，打开");
	}
   }
class OpenAndClose implements IOpenAndClose{
	public ITV tv;//成员
	public OpenAndClose(ITV tv) {
		this.tv=tv;
	}
	public void open() {
		this.tv.play();
	}*/
/*//方法3
interface IOpenAndClose {
	public void open();// 抽象方法
	public void setTv(ITV tv);
}

interface ITV { // ITV接口
	public void play();
}
class OpenAndClose implements IOpenAndClose{
	private ITV tv;
	public  void setTv(ITV tv) {
		this.tv=tv;
	}
	public void  open() {
		this.tv.play();
	}*/
