package com.vti.entity;

import java.util.Scanner;

public class QLthisinh {
	private int soBaoDanh;
	private String hoTen;
	private String diaChi;
	private int mucUuTien;
	private Khoi khoi;
	
	public int getSoBaoDanh() {
		return soBaoDanh;
	}
	public void setSoBaoDanh(int soBaoDanh) {
		this.soBaoDanh = soBaoDanh;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public int getMucUuTien() {
		return mucUuTien;
	}
	public void setMucUuTien(int mucUuTien) {
		this.mucUuTien = mucUuTien;
	}	

	
	public QLthisinh(int soBaoDanh, String hoTen, String diaChi, int mucUuTien, Khoi khoi) {
		super();
		this.soBaoDanh = soBaoDanh;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.mucUuTien = mucUuTien;
		this.khoi = khoi;
	}
	
	public QLthisinh() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào số báo danh: ");
		this.soBaoDanh = sc.nextInt();
		sc.nextLine();
		System.out.println("Mời bạn nhập Họ Tên: ");
		this.hoTen = sc.nextLine();
		System.out.println("Mời bạn nhập địa chỉ: ");
		this.diaChi = sc.nextLine();
		System.out.println("Mời bạn nhập mức ưu tiên");
		this.mucUuTien = sc.nextInt();
		sc.nextLine();
		System.out.println("Mời bạn nhập vào Khối A, B, C: ");
		this.khoi = new Khoi(sc.nextLine());
	}
	@Override
	public String toString() {
		return "QLthisinh [soBaoDanh=" + soBaoDanh + ", hoTen=" + hoTen + ", diaChi=" + diaChi + ", mucUuTien="
				+ mucUuTien + ", khoi=" + khoi.getName() +", Subject=" + khoi.getSubject() + "]";
	}
	
	
}
