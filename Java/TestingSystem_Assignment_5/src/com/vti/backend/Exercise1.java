package com.vti.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.entity.News;
import com.vti.entity.QLthisinh;
import com.vti.entity.TuyenSinh;


public class Exercise1 {

	public void question1() {
		List<News> newss = new ArrayList<News>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào chức năng sau:\n1.Insert news\n2.View list news\n3.Average rate\n4.Exit");
		while (true) {
			System.out.println("Mời bạn chọn chức năng:");
			int choose = sc.nextInt();
			switch (choose) {
			case 1:
				News myNews = new News();
				newss.add(myNews);
				break;
			case 2:
				for (News news : newss) {
					news.display();
				}
				break;
			case 3:
				for (News news : newss) {
					news.calculate();
					news.display();
				}
				break;
			case 4:
				System.out.println("Bạn đã thoát chương trình!");
				return;
			default:
				break;
			}

		}

	}
	public void question2() {
		Scanner sc = new Scanner(System.in);
		TuyenSinh ts = new TuyenSinh();
		System.out.println("Mời bạn nhập vào phương thức thực hiện các chức năng sau:\n1.Thêm mới thí sinh\n2.Hiện thị thông tin của thí sinh và khối thi của thí sinh\n3.Tìm kiếm theo số báo danh\4.Thoát khỏi chương trình");
		while (true) {
			System.out.println("Mời bạn nhập chức năng:");
			int choose2 = sc.nextInt();
			switch (choose2) {
			case 1:
				ts.addThiSinh();
				break;
			case 2:
				ts.showThiSinh();
				break;
			case 3:
				ts.findByNum();
				break;
			case 4:
				return;				
			default:
				break;
			}
			
		}
	}
}
