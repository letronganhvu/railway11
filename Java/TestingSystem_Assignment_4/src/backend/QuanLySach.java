package backend;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.ex5.qs4.Bao;
import entity.ex5.qs4.Sach;
import entity.ex5.qs4.TaiLieu;
import entity.ex5.qs4.Tapchi;

public class QuanLySach {
	List<TaiLieu> dsTaiLieu = new ArrayList<TaiLieu>();

	void addTaiLieu(int loai) {
		Scanner sc = new Scanner(System.in);
		if (loai == 1) {
			System.out.println("Mời bạn nhập mã sách:");
			String maTaiLieu = sc.nextLine();
			// thêm mới sách
			Sach sach = new Sach(maTaiLieu, "", 1, "", 1);
			dsTaiLieu.add(sach);
		} else if (loai == 2) {
			System.out.println("Mời bạn nhập mã tạp chí:");
			String maTaiLieu = sc.nextLine();
			// thêm mới tạp chí
			Tapchi tapchi = new Tapchi(maTaiLieu, "", 1, 1, 6);
			dsTaiLieu.add(tapchi);
		} else {
			System.out.println("Mời bạn nhập mã báo:");
			String maTaiLieu = sc.nextLine();
			// thêm mới báo
			Bao bao = new Bao(maTaiLieu, "", 1, LocalDate.now());
			dsTaiLieu.add(bao);
		}
	}

	void showTaiLieu() {
		for (TaiLieu taiLieu : dsTaiLieu) {
			if (taiLieu instanceof Sach) {
				Sach sach1 = (Sach) taiLieu;
				System.out.println(sach1.toString());
			} else if (taiLieu instanceof Tapchi) {
				Tapchi tapchi1 = (Tapchi) taiLieu;
				System.out.println(tapchi1.toString());
			} else if (taiLieu instanceof Bao) {
				Bao bao1 = (Bao) taiLieu;
				System.out.println(bao1.toString());
			} else {
				System.out.println(taiLieu.toString());
			}
		}
	}
}
