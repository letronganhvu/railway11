package entity.ex5;

import java.util.Scanner;

public class Canbo {
	String hoTen;
	int tuoi;
	Gender gioiTinh;
	String diaChi;
	
	public Canbo(String hoTen, int tuoi, Gender gioiTinh, String diaChi) {
		super();
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
	}
	
	public Canbo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Họ tên: ");
		hoTen = sc.nextLine();
		System.out.println("Tuổi: ");
		tuoi = sc.nextInt();
		sc.nextLine();
		System.out.println("Địa chỉ: ");
		diaChi = sc.nextLine();
		System.out.println("Giới Tính:\n1.Nam\n2.Nữ\n3.Không Biết");
		int x = sc.nextInt();
			switch (x) {
			case 1:
				gioiTinh = Gender.MALE;
				break;
			case 2:
				gioiTinh = Gender.FEMALE;
				break;
			case 3:
				gioiTinh = Gender.UNKNOWN;
				break;				
			}
		
		}

	@Override
	public String toString() {
		return "Canbo [hoTen=" + hoTen + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh + ", diaChi=" + diaChi + "]";
	}
	
		
	}


