import java.security.DomainCombiner;
import java.text.DateFormatSymbols;
import java.time.LocalDate;

import java.util.Locale;

public class System_out_printf {
	

	public static void main(String[] args) {
		Department department1 = new Department();
		department1.id = 1;
		department1.name = " Marketing ";

		Department department2 = new Department();
		department2.id = 2;
		department2.name = " Sale ";

		Department department3 = new Department();
		department3.id = 3;
		department3.name = " Bảo Vệ ";

		// add data position
		Position position1 = new Position();
		position1.id = 1;
		position1.name = " Developer ";

		Position position2 = new Position();
		position2.id = 2;
		position2.name = " Test ";

		Position position3 = new Position();
		position3.id = 3;
		position3.name = " Scrum Master ";

		Position position4 = new Position();
		position4.id = 4;
		position4.name = "PM";

		// add data Account
		Account account1 = new Account();
		account1.id = 1;
		account1.email = " nguyenvanthuong@gmail.com ";
		account1.userName = " thuong ";
		account1.fullName = " Nguyễn Văn Thưởng ";
		account1.department = department2;
		account1.position = position3;
		account1.createDate = LocalDate.now();

		Account account2 = new Account();
		account2.id = 2;
		account2.email = " phanvinhhien@gmail.com ";
		account2.userName = " Hien ";
		account2.fullName = " Phan Vĩnh Hiển ";
		account2.department = department1;
		account2.position = position4;
		account2.createDate = LocalDate.now();

		Account account3 = new Account();
		account3.id = 3;
		account3.email = " luuquangthien@gmail.com ";
		account3.userName = " Thien ";
		account3.fullName = "Lưu Quang Thiện ";
		account3.department = department3;
		account3.position = position2;
		account3.createDate = LocalDate.now();

		System.out.println(account1.toString());

		// add data Group

		Group group1 = new Group();
		group1.id = 1;
		group1.name = "Cái Bang";
		group1.account = account1;
		group1.createDate = LocalDate.now();

		Group group2 = new Group();
		group2.id = 2;
		group2.name = "Nga Mi";
		group2.account = account2;
		group2.createDate = LocalDate.now();

		Group group3 = new Group();
		group3.id = 3;
		group3.name = "Thiếu Lâm";
		group3.account = account3;
		group3.createDate = LocalDate.now();

		// add account vao group
		account2.groups = new Group[] { group2, group3 };
		account1.groups = new Group[] { group1, group2 };
		account3.groups = new Group[] { group1, group3 };

		GroupAccount grAcc1 = new GroupAccount();
		grAcc1.group = group1;
		GroupAccount grAcc2 = new GroupAccount();
		grAcc2.group = group2;
		GroupAccount grAcc3 = new GroupAccount();
		grAcc3.group = group3;
		
//		Exercise 2 (Optional): System out printf
//		Question 1: 
//		Khai báo 1 số nguyên = 5 và sử dụng lệnh System out printf để in ra số 
//		nguyên đó
		
		int a = 5;
		System.out.printf("%d%n", a);
		
//		Question 2: 
//		Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out printf để in 
//		ra số nguyên đó thành định dạng như sau: 100,000,000
		
		int b = 100000000;
		System.out.printf(Locale.US,"%,d%n", b);
//		Question 3: 
//		Khai báo 1 số thực = 5,567098 và sử dụng lệnh System out printf để in ra số 
//		thực đó chỉ bao gồm 4 số đằng sau
		
		float c = 5.567098f;
		System.out.printf("%7.4f %n", c);
//		Question 4: 
//		Khai báo Họ và tên của 1 học sinh và in ra họ và tên học sinh đó theo định 
//		dạng như sau:
//		Họ và tên: "Nguyễn Văn A" thì sẽ in ra trên console như sau: 
//		Tên tôi là "Nguyễn Văn A" và tôi đang độc thân.
		String d = "Nguyễn Văn A";
		System.out.printf("Tên tôi là " + d + " và tôi đang độc thân");
//		Question 5:
//		Lấy thời gian bây giờ và in ra theo định dạng sau:
//		24/04/2020 11h:16p:20s
//		String pattern = "dd/MM/yyyy HH:mm:ss";
//		SimpleDateFormat simpleDateFormat  = new SimpleDateFormat(pattern);
//		String date = simpleDateFormat.format(new Date());
//		System.out.println(date);
		
		
//		Question 6:
//		In ra thông tin account (như Question 8 phần FOREACH) theo định dạng 
//		table (giống trong Database)
	}	

}
