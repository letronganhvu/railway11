package com.vti.frontend;

import java.util.Scanner;

import com.vti.entity.InvalidAgeException;

public class Demo {

	public static void main(String[] args) throws Exception {
//		while (true) {
//			try {
//				Scanner sc = new Scanner(System.in);
//				System.out.println("Mời bạn nhập tuổi:");
//				int age = sc.nextInt();
//				sc.close();
//				System.out.println(" tuổi của bạn là: " + age);
//				return;
//			} catch (Exception e) {
//				System.out.println("Nhập vào 1 số nguyên");
//			}
//		}
//		checkAge(19);
		try {
			checkAge(14);
		} catch (InvalidAgeException e) {
				
			System.out.println(e.getMessage());
		}
	}
//	private static void checkAge(int age) {
//		if (age < 18) {
//			throw new ArithmeticException("Bạn cần ít nhất 18 tuổi!");
//		} else {
//			System.out.println("Bạn đã đủ 18 tuổi!");
//		}
//	}
	private static void checkAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Bạn cần ít nhất 18 tuổi!");
		} else {
			System.out.println("age:" + age);
		}
	}
}
