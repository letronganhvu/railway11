package entity.ex5;

import java.util.Scanner;

public class Kysu extends Canbo {

	private String nganhDaoTao;

	public Kysu(String hoTen, int tuoi, Gender gioiTinh, String diaChi, String nganhDaoTao) {
		super(hoTen, tuoi, gioiTinh, diaChi);
		this.nganhDaoTao = nganhDaoTao;
	}
	public Kysu() {
		super();
		Scanner sc = new Scanner(System.in);
		System.out.println("Ngành Đào Tạo: ");
		nganhDaoTao = sc.nextLine();
	}
	

	@Override
	public String toString() {
		return "Kysu [nganhDaoTao=" + nganhDaoTao + ", hoTen=" + hoTen + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh
				+ ", diaChi=" + diaChi + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
