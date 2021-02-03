package com.atguigu.principle.inversion.improve;



public class DependencyPass {

	public static void main(String[] args) {
		ChangHong changHong = new ChangHong();
		OpenAndClose openAndClose = new OpenAndClose();
		openAndClose.open(changHong);
	}

}

//����1��ͨ���ṹ����ʵ������
	interface IOpenAndClose{
	public void open(ITV tv);//���󷽷� ���սӿ�
}
	interface ITV{//ITV �ӿ�
	public void play();
}
   //����1����
   class ChangHong implements ITV{
		public void play() {
			System.out.println("������ӻ�����");
	}
   }
	//ʵ�ֽӿ�
   class OpenAndClose implements IOpenAndClose{
   public void open(ITV tv) {
		tv.play();
	}
}
/*//����2��ͨ��������������������
interface IOpenAndClose{
	public void open();//���󷽷�
	
}
interface ITV{
	public void play();
}
//����2����
   class ChangHong implements ITV{
		public void play() {
			System.out.println("������ӻ�����");
	}
   }
class OpenAndClose implements IOpenAndClose{
	public ITV tv;//��Ա
	public OpenAndClose(ITV tv) {
		this.tv=tv;
	}
	public void open() {
		this.tv.play();
	}*/
/*//����3
interface IOpenAndClose {
	public void open();// ���󷽷�
	public void setTv(ITV tv);
}

interface ITV { // ITV�ӿ�
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
