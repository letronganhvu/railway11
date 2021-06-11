package entity.ex5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class QLCB {
	private List<Canbo> canBos = new ArrayList<Canbo>();

	// mảng ds cán bộ lưu trữ những cán bộ đc tạo ra
	public void addCanBo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bạn muốn add bao nhiêu cán bộ: ");
		int x = sc.nextInt();
		for (int i = 0; i < x; i++) {
			System.out.println("Mời bạn nhập theo hướng dẫn sau:\n1.Công nhân\n2.Kỹ sư\n3.Nhân viên");
			int choose = sc.nextInt();
			switch (choose) {
			case 1:
				canBos.add(new Congnhan());
				break;
			case 2:
				canBos.add(new Kysu());
				break;
			case 3:
				canBos.add(new Nhanvien());
				break;
			}
			System.out.println("nhập thành công cán bộ: " + (i + 1));

		}

	}

	public void findHoTen() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập họ tên muốn tìm: ");
		String findName = sc.nextLine();
		for (Canbo canbo : canBos) {
			if (canbo.hoTen.toLowerCase().indexOf(findName.toLowerCase()) >= 0) {
				System.out.println(canbo);
			}
//			if (canbo.hoTen.equals(findName)) {
//				System.out.println(canbo);
//			}
		}
	}

	public void dsCanBo() {
		for (Canbo canbo : canBos) {
			System.out.println(canbo.toString());

		}
	}

	public void deleteCanBo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập tên cán bộ cần xóa: ");
		String delName = sc.nextLine();
		for (int i = 0; i < canBos.size(); i++) {
			if (canBos.get(i).hoTen.toLowerCase().indexOf(delName.toLowerCase()) >= 0) {
				canBos.remove(i);
			i = i -1;
			
			}
		}

	}

}
