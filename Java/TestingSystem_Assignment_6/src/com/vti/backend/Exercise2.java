package com.vti.backend;

import java.util.Scanner;

import com.vti.entity.Department;

public class Exercise2 {
	
	public void question3() {
		int[] numbers = {1,2,3};
		try {
			System.out.println(numbers[10]);	
		} catch (Exception e) {
			System.out.println("khong tim thay phan tu");
		}
	}
	public void question4() {
		Department[] departments = new Department[3];
		getIndex(2, departments);
	}

	void getIndex(int index, Department[] departments) {
		try {
			System.out.println(departments[index].toString());
		} catch (Exception e) {
			System.out.println("Cannot find department. ");
		}
	}

	public void question5_6() {
		int age = inputAge();
		System.out.println("age: " + age);
	}

	public int inputAge() {
		while (true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Mời bạn nhập vào tuổi:");
				int age = sc.nextInt();
				if (age < 0) {
					System.out.println("Wrong inputing! The age must be greater than 0, please input again.");

				} else {
					return age;
				}
			} catch (Exception e) {
				System.out.println("wrong inputing! Please input an age as int, input again.");

			}
		}

	}
}
