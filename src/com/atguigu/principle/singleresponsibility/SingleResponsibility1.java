package com.atguigu.principle.singleresponsibility;

public class SingleResponsibility1 {

	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle();
		vehicle.run("Ħ�г�");
		vehicle.run("����");
		vehicle.run("�ɻ�");
	}

}

//��ͨ������
//��ʽ1
//1������1��run ������Υ���˵�һְ��ԭ��
//2����������ǳ��򵥣����ݽ�ͨ�������з�����ͬ���ֽ�ɲ�ͬ�༴��
class Vehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + "�ڹ�·������...");
	}
}
