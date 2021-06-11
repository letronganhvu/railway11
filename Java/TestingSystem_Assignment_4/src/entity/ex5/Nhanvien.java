package entity.ex5;

import java.util.Scanner;

public class Nhanvien extends Canbo implements IStudy {
	String congViec;

	public Nhanvien(String hoTen, int tuoi, Gender gioiTinh, String diaChi, String congViec) {
		super(hoTen, tuoi, gioiTinh, diaChi);
		this.congViec = congViec;		
	}
	
	


	public Nhanvien() {
		super();
		Scanner sc = new Scanner(System.in);
		System.out.println("Công Việc: ");
		congViec = sc.nextLine();
	}




	@Override
	public String toString() {
		return "Congviec [congViec=" + congViec + ", hoTen=" + hoTen + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh
				+ ", diaChi=" + diaChi + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}




	@Override
	public void doHomeWork() {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void copyHomeWork() {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void rollUp() {
		// TODO Auto-generated method stub
		
	}
	
	

}
