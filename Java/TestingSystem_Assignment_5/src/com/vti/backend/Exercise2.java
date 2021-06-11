package com.vti.backend;

import java.util.ArrayList;
import java.util.Scanner;

import com.vti.entity.Student;
import com.vti.entity.Student2;
import com.vti.entity.qs3.Hinhchunhat;
import com.vti.entity.qs3.Hinhvuong;

public class Exercise2 {
	public void question1() {
//	a) Tạo 10 học sinh, chia thành 3 nhóm

		Student[] dsStudent = new Student[10];
		for (int i = 0; i < dsStudent.length; i++) {
			dsStudent[i] = new Student(i + 1, "Nguyễn Văn A" + (i + 1), i % 3 + 1);
			System.out.println(dsStudent[i]);
		}
//	b) Kêu gọi cả lớp điểm danh.
		for (int i = 0; i < dsStudent.length; i++) {
			dsStudent[i].diemDanh();
		}
//	c) Gọi nhóm 1 đi học bài
		for (int i = 0; i < dsStudent.length; i++) {
			if (dsStudent[i].group == 1)
				dsStudent[i].hocBai();
		}
//	d) Gọi nhóm 2 đi dọn vệ sinh
		for (int i = 0; i < dsStudent.length; i++) {
			if (dsStudent[i].group == 2)
				dsStudent[i].donVeSinh();
		}
	}

	public void question2() {
		Scanner sc = new Scanner(System.in);
		Student2 st2 = new Student2();
		System.out.println(
				"Mời bạn chọn chức năng:\n1.Nhập thông tin học sinh\n2.xem thông tin học sinh\n3.thoát chương trình");
		int choose;
		while (true) {
			System.out.println("Mời bạn nhập chức năng");
			choose = sc.nextInt();
			switch (choose) {
			case 1:
				st2.inputInfo();
				break;
			case 2:
				System.out.println(st2.showInfo());
				break;
			case 3:

				return;

			default:
				break;
			}

		}
	}
	
	public void question3() {
		Hinhchunhat hinhchunhat = new Hinhchunhat();
		hinhchunhat.canh1 = 5f;
		hinhchunhat.canh2 = 10f;
		System.out.println("tính Chu vi/Diện tích hình chữ nhật:");
		hinhchunhat.tinhChuVi();
		hinhchunhat.tinhDienTich();
		
		Hinhvuong hinhVuong = new Hinhvuong();
		hinhVuong.canh1 = 6f;
		hinhVuong.canh2 = 6f;
		System.out.println("tính Chu vi/Diện tích hình vuông:");
		hinhVuong.tinhChuVi();
		hinhVuong.tinhDienTich();
	}
	
	
}
