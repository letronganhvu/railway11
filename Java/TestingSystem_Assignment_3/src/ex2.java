import java.time.LocalDate;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Exercise 2 (Optional): Default value
//		Question 1:
//		Không sử dụng data đã insert từ bài trước, tạo 1 array Account và khởi 
//		tạo 5 phần tử theo cú pháp (sử dụng vòng for để khởi tạo):
//		 Email: "Email 1"
//		 Username: "User name 1"
//		 FullName: "Full name 1"
//		 CreateDate: now
		
		Account[] accauto = new Account[6];
		for (int c = 1; c < accauto.length; c++) {
			Account acc = new Account();
			acc.email = "Email" + c;
			acc.userName = "Username" + c;
			acc.fullName = "Fullname" + c;
			acc.createDate = LocalDate.now();
			accauto[c] = acc;
			
		System.out.println("Thông tin Account " + c + " Email: " + accauto[c].email + " UserName: " + accauto[c].userName + " FullName: " + accauto[c].fullName + " CreateDate: " + accauto[c].createDate);
		}
		
		
		
	}

}
