package com.atguigu.principle.inversion;

public class DependencyInversion {

	public static void main(String[] args) {
		Person person = new Person();
		person.receive(new Email());

	}

}

class Email {
	public String getInfo() {
		return "�����ʼ���Ϣ��hello  Mr.zi";
	}
}

//���Person������Ϣ�Ĺ���
//��ʽ1����
//1���� ���Ƚ����׻�ȡ��
//2��������ǻ�ȡ�Ķ����� ΢�š����ŵȵ� �������� ͬʱPersonҲҪ������Ӧ�Ľ��շ���
//3�����˼·������һ������Ľӿ�IReceiver����ʾ�����ߣ�����Person����ӿ�IReceiver��������
//��ΪEmail WEIXIN����������ߵķ�Χ�����Ǹ���ʵ��IReceiver�ӿھ�OK
class Person {
	public void receive(Email email) {
		System.out.println(email.getInfo());
	}
}