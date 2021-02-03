package com.atguigu.principle.inversion.improve;

public class DependencyInversion {

	public static void main(String[] args) {
		Person person = new Person();
		person.receive(new Email());
		person.receive(new WeiXin());
	}

}

//����ӿ�
interface IReceiver {
	public String getInfo();
}

class Email implements IReceiver {
	public String getInfo() {
		return "�����ʼ���Ϣ��hello  Mr.zi";
	}
}

//����΢��
class WeiXin implements IReceiver {
	public String getInfo() {
		return "΢����Ϣ��Hello OK";
	}
}

//����ʽ2
class Person {
	// �����ǶԽӿڵ�����
	public void receive(IReceiver receiver) {
		System.out.println(receiver.getInfo());
	}
}