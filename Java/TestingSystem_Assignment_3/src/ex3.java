
public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Exercise 3(Optional): Boxing & Unboxing
//		Question 1:
//		Khởi tạo lương có datatype là Integer có giá trị bằng 5000.
//		Sau đó convert lương ra float và hiển thị lương lên màn hình (với số 
//		float có 2 số sau dấu thập phân)
		
		Integer luong = 5000;
		System.out.printf( "%.2f", (float) luong);
		
//		Question 2:
//			Khai báo 1 String có value = "1234567"
//			Hãy convert String đó ra số int
		
		String a = "1234567";
		int b = Integer.parseInt(a);
		System.out.println(b);
		
//		Question 3:
//			Khởi tạo 1 số Integer có value là chữ "1234567"
//			Sau đó convert số trên thành datatype int
		Integer c = 1234567;
		int d = c.intValue();
		System.out.println(d);


	}

}
