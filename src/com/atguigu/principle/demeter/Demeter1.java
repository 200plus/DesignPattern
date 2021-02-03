package com.atguigu.principle.demeter;

import java.util.ArrayList;

import java.util.List;

//�ͻ���
public class Demeter1 {

	public static void main(String[] args) {
		System.out.println("~~~~~~~ʹ��demeter����ĸĽ�~~~~~~");
		SchoolManager schoolManager=new SchoolManager();
		//�����ѧԺ��Ա��id��ѧУ�ܲ���Ա����Ϣ
		schoolManager.printAllEmployee(new CollegeManager());
	}
}
//ѧУ�ܲ�Ա��
class Employee {
	private String id;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
//ѧУѧԺԱ��
class CollegeEmployee {
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
//��ϵѧУѧԺԱ���Ĺ�����
class CollegeManager {
	// ����ѧԺ������Ա��
	public List<CollegeEmployee> getAllEmployee() {
		List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
		for (int i = 0; i < 10; i++) {// ����������10��Ա����list����
			CollegeEmployee emp = new CollegeEmployee();
			emp.setId("ѧԺԱ��id=" + i);
			list.add(emp);
		}
		return list;
	}
	//���ѧԺԱ������Ϣ
	public void  printEmployee() {
		// ��ȡ��ѧԺԱ��
				List<CollegeEmployee> list1 = this.getAllEmployee();
				System.out.println("------------�ֹ�˾Ա��-------------");
				for (CollegeEmployee e : list1) {
					System.out.println(e.getId());
				}
	}
}

//����ѧУԱ���Ĺ�����

//schoolManager��ֱ������  Employee��CollegeManager
//CollegeEmployee����ֱ������ ����һ��ֱ����  ������Υ����demeter����
class SchoolManager {

	public List<Employee> getAllEmployee() {
		List<Employee> list = new ArrayList<Employee>();
		for (int i = 0; i < 5; i++) {// ����������10��Ա����list����
			Employee emp = new Employee();
			emp.setId("ѧУԱ��id=" + i);
			list.add(emp);
		}
		return list;
	}
	
	
public void printAllEmployee(CollegeManager sub) {
		//��������
		//1�������ѧԺ��Ա��������װ��collegeManager
		sub.printEmployee();
		// ��ȡ��ѧУ����Ա��
		List<Employee> list2 = this.getAllEmployee();
		System.out.println("------------ѧУ�ܲ�Ա��-----------");
		for (Employee e : list2) {
			System.out.println(e.getId());
		}
	}
}