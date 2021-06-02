import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		position1.name = PositionName.DEVELOPER;

		Position position2 = new Position();
		position2.id = 2;
		position2.name = PositionName.TEST;

		Position position3 = new Position();
		position3.id = 3;
		position3.name = PositionName.SCRUM_MASTER;

		Position position4 = new Position();
		position4.id = 4;
		position4.name = PositionName.PM;

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

		Scanner scanner = new Scanner(System.in);
//		Exercise 5: Input from console
//		Question 1: 
//		Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình
		System.out.print("nhập 3 số nguyên ");
		System.out.print("nhập số thư nhất: ");
		int a = scanner.nextInt();
		System.out.print("nhập số thư hai: ");
		int b = scanner.nextInt();
		System.out.print("nhập số thư ba: ");
		int c = scanner.nextInt();
		System.out.println("Input " + a + " " + b + " " + c);

//		Question 2: 
//		Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình
		System.out.print("nhập 2 số thực ");
		System.out.print("nhập số thực thứ nhất ");
		float d = scanner.nextFloat();
		System.out.print("nhập số thực thứ hai ");
		float e = scanner.nextFloat();
		System.out.println("Input " + d + " " + e);

//		Question 3: 
//		Viết lệnh cho phép người dùng nhập họ và tên

		System.out.println("nhập họ và tên ");
		System.out.println("nhập họ: ");
		String f = scanner.next();
		System.out.println("nhập tên: ");
		String g = scanner.next();
		System.out.println("họ và tên: " + f + " " + g);

//		Question 4: 
//		Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ
		System.out.println("nhập năm sinh: ");
		int h = scanner.nextInt();
		System.out.println("nhập tháng sinh: ");
		int i = scanner.nextInt();
		System.out.println("nhập ngày sinh: ");
		int k = scanner.nextInt();
		LocalDate sinhnhat = LocalDate.of(h, i, k);
		System.out.println("sinh nhật: " + sinhnhat);

		question5();

	}

//	Question 5: 
//	Viết lệnh cho phép người dùng tạo account (viết thành method)
//	Đối với property Position, Người dùng nhập vào 1 2 3 4 5 và vào 
//	chương trình sẽ chuyển thành Position.Dev, Position.Test, 
//	Position.ScrumMaster, Position.PM5
	public static void question5() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập thông tin account ");
		Account acc = new Account();
		System.out.println("Nhập ID: ");
		acc.id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Nhập email: ");
		acc.email = scanner.nextLine();
		System.out.println("Nhập userName: ");
		acc.userName = scanner.nextLine();
		System.out.println("Nhập fullName: ");
		acc.fullName = scanner.nextLine();
		System.out.println("Nhập position (Nhập các số từ 1 đến 4 tương ứng với: 1.Dev, 2.Test, 3.Scrum_Master, 4.PM): ");
		int posNum = scanner.nextInt();
		switch (posNum) {
		case 1:
			Position pos1 = new Position();
			pos1.name = PositionName.DEVELOPER;
			acc.position = pos1;
			break;
		case 2:
			Position pos2 = new Position();
			pos2.name = PositionName.TEST;
			acc.position = pos2;
			break;
		case 3:
			Position pos3 = new Position();
			pos3.name = PositionName.SCRUM_MASTER;
			acc.position = pos3;
			break;
		case 4:
			Position pos4 = new Position();
			pos4.name = PositionName.PM;
			acc.position = pos4;
			break;
		}

		System.out.println("Tạo mới account thành công!");
		System.out.println("Account [id=" + acc.id + ", email=" + acc.email + ", userName=" + acc.userName
				+ ", fullName=" + acc.fullName + ", position=" + acc.position.name + "]");
	}

//	Question 6: 
//	Viết lệnh cho phép người dùng tạo department (viết thành method)
//	Question 7: 
//	Nhập số chẵn từ console
//	Question 8: 
//	Viết chương trình thực hiện theo flow sau:
//	Bước 1: 
//	Chương trình in ra text "mời bạn nhập vào chức năng muốn sử 
//	dụng"
//	Bước 2: 
//	Nếu người dùng nhập vào 1 thì sẽ thực hiện tạo account
//	Nếu người dùng nhập vào 2 thì sẽ thực hiện chức năng tạo 
//	department
//	Nếu người dùng nhập vào số khác thì in ra text "Mời bạn nhập 
//	lại" và quay trở lại bước 1
//	Question 9: 
//	Viết method cho phép người dùng thêm group vào account theo flow sau:
//	Bước 1: 
//	In ra tên các usernames của user cho người dùng xem
//	Bước 2: 
//	Yêu cầu người dùng nhập vào username của account
//	Bước 3: 
//	In ra tên các group cho người dùng xem
//	Bước 4: 
//	Yêu cầu người dùng nhập vào tên của group
//	Bước 5: 
//	Dựa vào username và tên của group người dùng vừa chọn, hãy 
//	thêm account vào group đó .
//	Question 10: Tiếp tục Question 8 và Question 9
//	Bổ sung thêm vào bước 2 của Question 8 như sau:
//	Nếu người dùng nhập vào 3 thì sẽ thực hiện chức năng thêm group vào 
//	account 
//	Bổ sung thêm Bước 3 của Question 8 như sau: 
//	Sau khi người dùng thực hiện xong chức năng ở bước 2 thì in ra dòng 
//	text để hỏi người dùng "Bạn có muốn thực hiện chức năng khác 
//	không?". Nếu người dùng chọn "Có" thì quay lại bước 1, nếu người 
//	dùng chọn "Không" thì kết thúc chương trình (sử dụng lệnh return để 
//	kết thúc chương trình)
//	Question 11: Tiếp tục Question 10
//	Bổ sung thêm vào bước 2 của Question 8 như sau:
//	Nếu người dùng nhập vào 4 thì sẽ thực hiện chức năng thêm account 
//	vào 1 nhóm ngẫu nhiên, chức năng sẽ được cài đặt như sau:
//	Bước 1: 
//	In ra tên các usernames của user cho người dùng xem6
//	Bước 2: 
//	Yêu cầu người dùng nhập vào username của account
//	Bước 3: 
//	Sau đó chương trình sẽ chọn ngẫu nhiên 1 group
//	Bước 4: 
//	Thêm account vào group chương trình vừa chọn ngẫu 
//	nhiên
}
