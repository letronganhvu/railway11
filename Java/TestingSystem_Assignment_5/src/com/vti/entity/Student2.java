package com.vti.entity;

import java.util.Scanner;

public class Student2 extends Person {
	private String maSinhVien;
	private float diemTB;
	private String email;
	
	@Override
	public void inputInfo() {
		super.inputInfo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời bạn nhập MaSinhVien:");
		this.maSinhVien = sc.nextLine();
		System.out.println("Mời bạn nhập Điểm Trung Bình:");
		this.diemTB = sc.nextFloat();
		sc.nextLine();
		System.out.println("Mời bạn nhập email:");
		this.email = sc.nextLine();
	}

	@Override
	public String showInfo() {
		return super.showInfo() + "Student2 [maSinhVien=" + maSinhVien + ", diemTB=" + diemTB + ", email=" + email + "]";
	}
	public boolean xetHocBong() {
		return diemTB >= 8.0 ? true : false;
	}
	

	
	
}
