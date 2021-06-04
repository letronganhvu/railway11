import java.time.LocalDate;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

//		Exercise 4: String
//		Question 1:
//		Nhập một xâu kí tự, đếm số lượng các từ trong xâu kí tự đó (các từ có 
//		thể cách nhau bằng nhiều khoảng trắng );

		Scanner scanner = new Scanner(System.in);
//		System.out.println("Hãy nhập vào 1 xâu ký tự: ");
//		String i = scanner.nextLine();
//		System.out.println(i.length());
//		
////		Question 2: 
////			Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1;
//		System.out.println("Nhập xâu kí tự s1: ");
//		String s1 = scanner.nextLine();
//		System.out.println("Nhập xâu kí tự s2");
//		String s2 = scanner.nextLine();
//		System.out.println("nối xâu kí tự s2 vào sau xâu s1: " + s1 + s2);

//		Question 3: 
//			Viết chương trình để người dùng nhập vào tên và kiểm tra, nếu tên chưa
//			Viết hoa chữ cái đầu thì viết hoa lên
//		System.out.println("nhập vào tên: ");
//		String a = scanner.nextLine();
//		System.out.println(a.substring(0, 1).toUpperCase() + a.substring(1));

//		Question 4: 
//			Viết chương trình để người dùng nhập vào tên in từng ký tự trong tên 
//			của người dùng ra
//			VD: 
//			Người dùng nhập vào "Nam", hệ thống sẽ in ra
//			"Ký tự thứ 1 là: N" 
//			"Ký tự thứ 1 là: A" 
//			"Ký tự thứ 1 là: M" 
//		System.out.println("nhập vào tên: ");
//		String b = scanner.nextLine();
//		b = b.toUpperCase();
//		for (int c = 0; c < b.length(); c++) {
//			System.out.println("Ký tự thứ " + c + " là: " + b.charAt(c));
//		}
//		
//		Question 5: 
//			Viết chương trình để người dùng nhập vào họ, sau đó yêu cầu người 
//			dùng nhập vào tên và hệ thống sẽ in ra họ và tên đầy đủ
//	System.out.println("Nhập họ: ");
//	String d = scanner.nextLine();
//	System.out.println("Nhập tên: ");
//	String e = scanner.nextLine();
//	System.out.println("họ và tên: " + d + " " + e);

//	Question 6:
//		Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và 
//		sau đó hệ thống sẽ tách ra họ, tên , tên đệm
//		VD:
//		Người dùng nhập vào "Nguyễn Văn Nam"
//		Hệ thống sẽ in ra
//		"Họ là: Nguyễn"
//		"Tên đệm là: Văn"
//		"Tên là: Nam"
//	Question 7:
//		Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và 
//		chuẩn hóa họ và tên của họ như sau:
//		a) Xóa dấu cách ở đầu và cuối và giữa của chuỗi người dùng nhập 
//		vào
//		VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ 
//		chuẩn hóa thành "nguyễn văn nam"
//		b) Viết hoa chữ cái mỗi từ của người dùng
//		VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ 
//		chuẩn hóa thành "Nguyễn Văn Nam"

//	Question 8:
//		In ra tất cả các group có chứa chữ "Java"
		String[] names = { "java 1", "java 2", "khong co ten" };
		for (String group : names) {
			if (group.contains("java")) {
				System.out.println(group);
			}
		}
//		Question 9:
//			In ra tất cả các group "Java"
		String[] names2 = { "java", "khong co ten", "có chắc yêu là đây" };
		for (String group2 : names2) {
			if(group2.equals("java")) {
				System.out.println(group2);
			}
		}
		

	}
}
