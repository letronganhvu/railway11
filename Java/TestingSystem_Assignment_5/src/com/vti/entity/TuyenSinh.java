package com.vti.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TuyenSinh implements ITuyenSinh {
	public TuyenSinh() {
	}

	ArrayList<QLthisinh> QLthisinhs = new ArrayList<QLthisinh>();

	@Override
	public void addThiSinh() {
		QLthisinhs.add(new QLthisinh());
	}

	@Override
	public void showThiSinh() {
		for (QLthisinh qLthisinh : QLthisinhs) {
			System.out.println(qLthisinh);
		}
	}

	@Override
	public void findByNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số báo danh muốn tìm:");
		int findNum = sc.nextInt();
		for (QLthisinh qLthisinh : QLthisinhs) {
			if (qLthisinh.getSoBaoDanh() > 0) {
				System.out.println(qLthisinh);
			}

		}

	}

}
