package com.atguigu.principle.demeter;

import java.util.ArrayList;

import java.util.List;

//客户端
public class Demeter1 {

	public static void main(String[] args) {
		System.out.println("~~~~~~~使用demeter法则的改进~~~~~~");
		SchoolManager schoolManager=new SchoolManager();
		//输出了学院的员工id和学校总部的员工信息
		schoolManager.printAllEmployee(new CollegeManager());
	}
}
//学校总部员工
class Employee {
	private String id;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
//学校学院员工
class CollegeEmployee {
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
//关系学校学院员工的管理类
class CollegeManager {
	// 返回学院的所有员工
	public List<CollegeEmployee> getAllEmployee() {
		List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
		for (int i = 0; i < 10; i++) {// 这里增加了10个员工到list集合
			CollegeEmployee emp = new CollegeEmployee();
			emp.setId("学院员工id=" + i);
			list.add(emp);
		}
		return list;
	}
	//输出学院员工的信息
	public void  printEmployee() {
		// 获取到学院员工
				List<CollegeEmployee> list1 = this.getAllEmployee();
				System.out.println("------------分公司员工-------------");
				for (CollegeEmployee e : list1) {
					System.out.println(e.getId());
				}
	}
}

//管理学校员工的管理类

//schoolManager的直接朋友  Employee，CollegeManager
//CollegeEmployee不是直接朋友 而是一个直接类  这样就违背了demeter法则
class SchoolManager {

	public List<Employee> getAllEmployee() {
		List<Employee> list = new ArrayList<Employee>();
		for (int i = 0; i < 5; i++) {// 这里增加了10个员工到list集合
			Employee emp = new Employee();
			emp.setId("学校员工id=" + i);
			list.add(emp);
		}
		return list;
	}
	
	
public void printAllEmployee(CollegeManager sub) {
		//分析问题
		//1、将输出学院的员工方法封装到collegeManager
		sub.printEmployee();
		// 获取到学校所有员工
		List<Employee> list2 = this.getAllEmployee();
		System.out.println("------------学校总部员工-----------");
		for (Employee e : list2) {
			System.out.println(e.getId());
		}
	}
}