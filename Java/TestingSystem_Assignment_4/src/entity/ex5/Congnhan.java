package entity.ex5;

import java.util.Scanner;

public class Congnhan extends Canbo {
	int capBac;

	public Congnhan(String hoTen, int tuoi, Gender gioiTinh, String diaChi, int capBac) {
		super(hoTen, tuoi, gioiTinh, diaChi);
		this.capBac = capBac;
	}

	public Congnhan() {
		super();
		Scanner sc = new Scanner(System.in);
		System.out.println("Cấp Bậc: ");
		capBac = sc.nextInt();
	}

	@Override
	public String toString() {
		return "Congnhan [capBac=" + capBac + ", hoTen=" + hoTen + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh
				+ ", diaChi=" + diaChi + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
