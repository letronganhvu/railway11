import java.time.LocalDate;


public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// add data department
		Department department1 = new Department ();
		department1.id = 1;
		department1.name = " Marketing ";
		
		Department department2 = new Department ();
		department2.id = 2;
		department2.name = " Sale ";
		
		Department department3 = new Department ();
		department3.id = 3;
		department3.name = " Bảo Vệ ";
		
		// add data position
		Position position1 = new Position ();
		position1.id = 1;
		position1.name = " Developer ";
		
		Position position2 = new Position ();
		position2.id = 2;
		position2.name = " Test ";
		
		Position position3 = new Position ();
		position3.id = 3;
		position3.name = " Scrum Master ";
		
		Position position4 = new Position ();
		position4.id = 4;
		position4.name = "PM";
		
		
		// add data Account
		Account account1 = new Account() ;
		account1.id = 1;
		account1.email = " nguyenvanthuong@gmail.com ";
		account1.userName = " thuong ";
		account1.fullName = " Nguyễn Văn Thưởng ";
		account1.department = department2;
		account1.position = position3;
		account1.createDate = LocalDate.now();
		
		Account account2 = new Account() ;
		account2.id = 2;
		account2.email = " phanvinhhien@gmail.com ";
		account2.userName = " Hien ";
		account2.fullName = " Phan Vĩnh Hiển ";
		account2.department = department1;
		account2.position = position4;
		account2.createDate = LocalDate.now();
		
		Account account3 = new Account() ;
		account3.id = 3;
		account3.email = " luuquangthien@gmail.com ";
		account3.userName = " Thien ";
		account3.fullName = "Lưu Quang Thiện ";
		account3.department = department3;
		account3.position = position2;
		account3.createDate = LocalDate.now();
		
		// add data Group
		
		Group group1 = new Group ();
		group1.id = 1;
		group1.name = "Cái Bang";
		group1.account = account1;
		group1.createDate = LocalDate.now();
				
		Group group2 = new Group ();
		group2.id = 2;
		group2.name = "Nga Mi";
		group2.account = account2;
		group2.createDate = LocalDate.now();
				
		Group group3 = new Group ();
		group3.id = 3;
		group3.name = "Thiếu Lâm";
		group3.account = account3;
		group3.createDate = LocalDate.now();
				
		
		
		
		// add data GroupAccount
		
		
		
		
		
		
		

	}

}
