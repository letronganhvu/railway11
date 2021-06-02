import java.time.LocalDate;

public class IF_AND_SWITCH_CASE {

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

//		Question 1:
//		Kiểm tra account thứ 2
//		Nếu không có phòng ban (tức là department == null) thì sẽ in ra text 
//		"Nhân viên này chưa có phòng ban"
//		Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là …"

		if (account2.department == null) {
			System.out.println("Phong ban nay chua co nhan vien");
		} else {
			System.out.println("Phong ban cua nhan vien nay la" + account2.department);
		}

//		Question 2: 
//			Kiểm tra account thứ 2
//			Nếu không có group thì sẽ in ra text "Nhân viên này chưa có group"
//			Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "Group của nhân viên 
//			này là Java Fresher, C# Fresher"
//			Nếu có mặt trong 3 Group thì sẽ in ra text "Nhân viên này là người 
//			quan trọng, tham gia nhiều group"
//			Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là 
//			người hóng chuyện, tham gia tất cả các group"

		if (account2.groups == null) {
			System.out.println("Nhân viên này chưa có group");
		} else if (account2.groups.length == 1) {
			System.out.println("Group của nhân viên này là" + account2.groups[0].name);
		} else if (account2.groups.length == 2) {
			System.out.println("Group của nhân viên này là " + account2.groups[0].name);
			System.out.println("Group của nhân viên này là " + account2.groups[1].name);
		} else if (account2.groups.length == 3) {
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
		} else if (account2.groups.length >= 4) {
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
		}

//		Question 3:
//			Sử dụng toán tử ternary để làm Question 1

		System.out.println(account2.department == null ? "Phong ban nay chua co nhan vien"
				: "Phong ban cua nhan vien nay la" + account2.department);

//		Question 4:
//			Sử dụng toán tử ternary để làm yêu cầu sau:
//			Kiểm tra Position của account thứ 1
//			Nếu Position = Dev thì in ra text "Đây là Developer"
//			Nếu không phải thì in ra text "Người này không phải là Developer"

		System.out.println(account1.position != null && account1.position.name == "Developer" ? "Đây là Developer"
				: "Người này không phải là Developer");

//		SWITCH CASE
//		Question 5:
//		Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau:
//		Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
//		Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
//		Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
//		Còn lại in ra "Nhóm có nhiều thành viên"
		
		int x = grAcc1.accounts.length;
		switch (x) {
		case 1:
			System.out.println("Nhóm có một thành viên");
		case 2:
			System.out.println("Nhóm có hai thành viên");
		case 3:
			System.out.println("Nhóm có ba thành viên");
			break;
		default:
			System.out.println("Nhóm có nhiều thành viên");
		}

//		Question 6: 
//			Sử dụng switch case để làm lại Question 2
		int q = account2.groups.length;
		switch (q) {
		case 0:
			System.out.println("Nhân viên này chưa có group");
		case 1:
			System.out.println("Group của nhân viên này là" + account2.groups[0].name);
		case 2:
			System.out.println("Group của nhân viên này là " + account2.groups[0].name);
			System.out.println("Group của nhân viên này là " + account2.groups[1].name);
		case 3:
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
			break;
		default:
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
		}
		

//		Question 7: 
//			Sử dụng switch case để làm lại Question 4
		String w = account1.position.name;
		switch (w) {
		case "Developer":
			System.out.println("Đây là Developer");
			break;
		default:
			System.out.println("Người này không phải là Developer");
		}

//		FOREACH
//		Question 8: 
//		In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của 
//		họ

		Account[] dsAccount = new Account[] { account1, account2, account3 };
		question2(dsAccount);
		System.out.println(dsAccount.length);
		for (Account account : dsAccount) {
			System.out.println("email: " + account.email);
			System.out.println("fullName: " + account.fullName);
			System.out.println("phòng ban: " + account.department.name);
		}

//		Question 9: 
//			In ra thông tin các phòng ban bao gồm: id và name

//		FOR
//		Question 10: 
//		In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của 
//		họ theo định dạng như sau:
//		Thông tin account thứ 1 là: 
//		Email: NguyenVanA@gmail.com
//		Full name: Nguyễn Văn A
//		Phòng ban: Sale
//		Thông tin account thứ 2 là: 
//		Email: NguyenVanB@gmail.com
//		Full name: Nguyễn Văn B
//		Phòng ban: Marketting

		for (int i = 0; i < dsAccount.length; i++) {
			System.out.println("Thông tin account thứ " + (i + 1) + " là: ");
			System.out.println("email: " + dsAccount[i].email);
			System.out.println("fullName: " + dsAccount[i].fullName);
			System.out.println("phòng ban: " + dsAccount[i].department.name);
		}

//		Question 11: 
//			In ra thông tin các phòng ban bao gồm: id và name theo định dạng sau: 
//			Thông tin department thứ 1 là: 
//			Id: 1
//			Name: Sale
//			Thông tin department thứ 2 là: 
//			Id: 2
//			Name: Marketing
		Department[] dsDepartment = new Department[] { department1, department2, department3 };
		for (int k = 0; k < dsDepartment.length; k++) {
			System.out.println("Thông tin department thứ " + (k + 1) + " là: ");
			System.out.println("id: " + dsDepartment[k].id);
			System.out.println("Name: " + dsDepartment[k].name);
		}

//		Question 12: 
//			Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10

//		Question 13: 
//			In ra thông tin tất cả các account ngoại trừ account thứ 2

		for (int i = 0; i < dsAccount.length; i++) {
			if ((i + 1) == 2) {
				continue;

			}
			System.out.println(dsAccount[i].toString());
		}

//		Question 14: 
//			In ra thông tin tất cả các account có id < 4
//			Question 15: 
//			In ra các số chẵn nhỏ hơn hoặc bằng 203
//			WHILE
//			Question 16:
//			Làm lại các Question ở phần FOR bằng cách sử dụng WHILE kết hợp với 
//			lệnh break, continue
//			DO-WHILE
//			Question 17:
//			Làm lại các Question ở phần FOR bằng cách sử dụng DO-WHILE kết hợp với 
//			lệnh break, continue





	}
//	Exercise 6 (Optional): Method
//	Question 2:
//	Tạo method để in thông tin các account

	static void question2(Account[] dsAccount) {
		for (Account account : dsAccount) {
			System.out.println(account.toString());
		}

	}

//			Question 1:
//			Tạo method để in ra các số chẵn nguyên dương nhỏ hơn 10
	static void nguyenduong() {
		for (int l = 1; l < 10; l++) {
			if (l % 2 == 0)
				System.out.println(l);
		}
	}
}
