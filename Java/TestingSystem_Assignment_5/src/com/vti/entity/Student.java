package com.vti.entity;

public class Student implements IStudent {
 int id;
 String name;
 public int group;

 
 
 
 public Student(int id, String name, int group) {
	super();
	this.id = id;
	this.name = name;
	this.group = group;
}




public Student() {
	super();
	
}




@Override
public void diemDanh() {
	// TODO Auto-generated method stub
	System.out.println(name + " điểm danh");
}




@Override
public void hocBai() {
	// TODO Auto-generated method stub
	System.out.println(name + " học bài");
}




@Override
public void donVeSinh() {
	// TODO Auto-generated method stub
	System.out.println(name + " dọn vệ sinh");
}
 
}
