import java.util.Random;
import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
//		Exercise 1 (Optional): Datatype Casting
//		Question 1:
//		Khai báo 2 số lương có kiểu dữ liệu là float.
//		Khởi tạo Lương của Account 1 là 5240.5 $
//		Khởi tạo Lương của Account 2 là 10970.055$
//		Khai báo 1 số int để làm tròn Lương của Account 1 và in số int đó ra
//		Khai báo 1 số int để làm tròn Lương của Account 2 và in số int đó ra

		float luong1;
		float luong2;
		luong1 = (float) 5240.5;
		luong2 = (float) 10970.055;
		System.out.println("luong1: " + luong1 + " $" + "|| luong2: " + luong2 + " $");

		int luong1moi = (int) luong1;
		int luong2moi = (int) luong2;
		System.out.println("luong1moi: " + luong1moi + " $" + "|| luong2moi: " + luong2moi + " $");

//		Question 2:
//			Lấy ngẫu nhiên 1 số có 5 chữ số (những số dưới 5 chữ số thì sẽ thêm
//			có số 0 ở đầu cho đủ 5 chữ số)
		
		Random random = new Random();
		int x = random.nextInt(100000);
		if (x >= 10000) {
			System.out.println(x);
		} else if (x >= 1000 && x < 10000) {
			System.out.println("0" + x);

		} else if (x >= 100 && x < 1000) {
			System.out.println("00" + x);

		} else if (x >= 10 && x < 100) {
			System.out.println("000" + x);

		} else if (x >= 0 && x < 10) {
			System.out.println("0" + x);

			System.out.println(x);
		}
		
		
//		Question 3: 
//			Lấy 2 số cuối của số ở Question 2 và in ra.
//			Gợi ý: 
//			Cách 1: convert số có 5 chữ số ra String, sau đó lấy 2 số cuối
//			Cách 2: chia lấy dư số đó cho 100
		
		System.out.println("2 số cuối: " + (x % 100));
		
//		Question 4:
//			Viết 1 method nhập vào 2 số nguyên a và b và trả về thương của chúng
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("nhập số nguyên 1: ");
		int a = scanner.nextInt();
		System.out.println("nhập số nguyên 2: ");
		int b = scanner.nextInt();
		System.out.println("thương của 1 và 2: " + (float) a/(float)b);
		
		
		
	}
}
