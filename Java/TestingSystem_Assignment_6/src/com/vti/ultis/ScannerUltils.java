package com.vti.ultis;

import java.util.Scanner;

public class ScannerUltils {

	public static int inputAge() {
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

	public static int inputInt() {
		while (true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Mời bạn nhập vào số:");
				int num = sc.nextInt();

				return num;
			} catch (Exception e) {
				System.out.println("wrong inputing! Please input as int, input again.");

			}
		}

	}

	public static float inputFloat() {
		while (true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Mời bạn nhập vào thap phan:");
				float flo = sc.nextFloat();

				return flo;
			} catch (Exception e) {
				System.out.println("wrong inputing! Please input as float, input again.");

			}
		}
	}
	public static double inputDouble() {
		while (true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Mời bạn nhập vào double:");
				double dou = sc.nextDouble();

				return dou;
			} catch (Exception e) {
				System.out.println("wrong inputing! Please input as double, input again.");

			}
		}
	}
	public static String inputString() {
		while (true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Mời bạn nhập:");
				String stri = sc.nextLine();

				return stri;
			} catch (Exception e) {
				System.out.println("wrong inputing! Please input as string, input again.");

			}
		}
	}
}
