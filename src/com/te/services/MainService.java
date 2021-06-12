package com.te.services;

import com.te.bean.EmploeeData;

public class MainService {

	public static void main(String[] args) {
		EmploeeServiceImpl e1=new EmploeeServiceImpl();
		EmploeeData emp=e1.getSingleRecord(1);
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getMarks());
		System.out.println(emp.getAge());
		System.out.println(emp.getPhonenum());


	}

}
