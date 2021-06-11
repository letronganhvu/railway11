package com.vti.entity.qs3;

public class Hinhchunhat {
	public float canh1;
	public float canh2;
	
	public void tinhChuVi() {
		System.out.println("chu vi :" + 2 * (canh1 + canh2));
	}
	public void tinhDienTich() {
		System.out.println("diện tích :" + canh1 * canh2);
	}
}
