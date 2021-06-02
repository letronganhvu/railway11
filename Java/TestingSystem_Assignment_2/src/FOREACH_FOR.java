import java.time.LocalDate;

public class FOREACH_FOR {
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

//		FOREACH
//		Question 8: 
//		In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của 
//		họ

		Account[] dsAccount = new Account[] { account1, account2, account3 };
		System.out.println(dsAccount.length);
		for (Account account : dsAccount) {
			System.out.println("email: " + account.email);
			System.out.println("fullName: " + account.fullName);
			System.out.println("phòng ban: " + account.department.name);
		}

//		Question 9: 
//			In ra thông tin các phòng ban bao gồm: id và name
		Department[] dsDepartment = new Department[] { department1, department2, department3 };
		System.out.println(dsDepartment.length);
		for (Department department : dsDepartment) {
			System.out.println("id: " + department.id);
			System.out.println("phòng ban: " + department.name);
		}

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
		for (int k = 0; k < dsDepartment.length; k++) {
			System.out.println("Thông tin department thứ " + (k + 1) + " là: ");
			System.out.println("id: " + dsDepartment[k].id);
			System.out.println("Name: " + dsDepartment[k].name);
		}

//		Question 12: 
//			Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10
		for (int k = 0; k < 2; k++) {
			System.out.println("Thông tin department thứ " + (k + 1) + " là: ");
			System.out.println("id: " + dsDepartment[k].id);
			System.out.println("Name: " + dsDepartment[k].name);

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
			for (int i = 0; i < dsAccount.length; i++) {
				if (dsAccount[i].id < 4) {
					System.out.println("Thông tin account thứ " + (i + 1) + " là: ");
					System.out.println("email: " + dsAccount[i].email);
					System.out.println("fullName: " + dsAccount[i].fullName);
					System.out.println("phòng ban: " + dsAccount[i].department.name);
				}
			}
//			Question 15: 
//			In ra các số chẵn nhỏ hơn hoặc bằng 203
			for (int i = 2; i <= 203; i = i + 2) {
				System.out.println(i);
			}
		}
	}
}