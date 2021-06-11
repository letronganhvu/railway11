package com.vti.entity;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
	private String name;
	private Gender gender;
	private LocalDate birthDate;
	private String address;

	public Person() {

	}

	public Person(String name, Gender gender, LocalDate birthDate, String address) {
		super();
		this.name = name;
		this.gender = gender;
		this.birthDate = birthDate;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời bạn nhâp thông tin Person:");
		System.out.println("Name: ");
		this.name = sc.nextLine();
		System.out.println("Mời bạn nhập vào giới tính:\n1.Nam\n2.Nữ\n3.Không Biết");
		int soGender = sc.nextInt();
		sc.nextLine();
		switch (soGender) {
		case 1:
			this.gender = Gender.MALE;
			break;
		case 2:
			this.gender = Gender.FEMALE;
			break;
		default:
			this.gender = Gender.UNKNOWN;
			break;
		}
		System.out.println("Mời bạn nhập vào sinh nhật:");
		this.birthDate = LocalDate.parse(sc.nextLine());
		System.out.println("Mời bạn nhập địa chỉ:");
		this.address = sc.nextLine();
	}

	public String showInfo() {
		return "Person [name=" + name + ", gender=" + gender + ", birthDate=" + birthDate + ", address=" + address
				+ "]";
	}

}
