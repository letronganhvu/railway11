package com.vti.frontend;

import com.vti.backend.Exercise2;
import com.vti.entity.Department;
import com.vti.ultis.ScannerUltils;

public class Program2 {

	public static void main(String[] args) {

		Exercise2 qs3 = new Exercise2();
		qs3.question3();
		Exercise2 ex2qs4 = new Exercise2();
		ex2qs4.question4();
		Exercise2 ex2qs56 = new Exercise2();
		ex2qs56.question5_6();

//		Question9:
		Department dep = new Department();
		dep.setId(ScannerUltils.inputInt());
		dep.setName("dev");
		System.out.println(dep);
//Question1:
		try {
			float result = divide(7, 0);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("cannot divide 0");
		} finally {
			System.out.println("divide complete");
		}

	}

	public static float divide(int a, int b) {
		return a / b;
	}

}
