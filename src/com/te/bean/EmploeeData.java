package com.te.bean;

import java.io.Serializable;

public class EmploeeData implements Serializable{
	int id;
	String name;
	 int marks;
	 int phonenum;
	 String age;
	 public EmploeeData() {
		 super();
		 }
		  public EmploeeData(int id,String name,int marks,int phonenum,String age) {
		 	this.id=id;
		 	this.name=name;
		 	this.marks=marks;
		 	this.phonenum=phonenum;
		 	this.age=age;
		  }
	 public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(int phonenum) {
		this.phonenum = phonenum;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	

}
