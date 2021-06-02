import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Locale;

public class Exercise3 {

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

		// add data GroupAccount
		GroupAccount grAcc1 = new GroupAccount();
		grAcc1.group = group1;
		GroupAccount grAcc2 = new GroupAccount();
		grAcc2.group = group2;
		GroupAccount grAcc3 = new GroupAccount();
		grAcc3.group = group3;

		// add data TypeQuestion
		TypeQuestion type1 = new TypeQuestion();
		type1.id = 1;
		type1.name = "ESSAY";

		TypeQuestion type2 = new TypeQuestion();
		type2.id = 2;
		type2.name = "MULTIPLE_CHOICE";

		// add data CategoryQuestion
		CategoryQuestion category1 = new CategoryQuestion();
		category1.id = 1;
		category1.name = " Java ";

		CategoryQuestion category2 = new CategoryQuestion();
		category2.id = 2;
		category2.name = " Postman ";

		CategoryQuestion category3 = new CategoryQuestion();
		category3.id = 3;
		category3.name = " Ruby ";

		// add data Question

		Question question1 = new Question();
		question1.id = 1;
		question1.content = " Cau hoi ve Postman ";
		question1.categoryQuestion = category2;
		question1.typeQuestion = type2;
		question1.account = account1;
		question1.createDate = LocalDate.now();

		Question question2 = new Question();
		question2.id = 2;
		question2.content = " Cau hoi ve Ruby ";
		question2.categoryQuestion = category3;
		question2.typeQuestion = type1;
		question2.account = account2;
		question2.createDate = LocalDate.now();

		Question question3 = new Question();
		question3.id = 3;
		question3.content = " Cau hoi ve Java ";
		question3.categoryQuestion = category1;
		question3.typeQuestion = type2;
		question3.account = account3;
		question3.createDate = LocalDate.now();

		// add data Answer

		Answer answer1 = new Answer();
		answer1.id = 1;
		answer1.content = " tra loi ve Java ";
		answer1.question = question3;
		answer1.isCorrect = true;

		Answer answer2 = new Answer();
		answer2.id = 2;
		answer2.content = " tra loi ve Postman ";
		answer2.question = question1;
		answer2.isCorrect = false;

		Answer answer3 = new Answer();
		answer3.id = 1;
		answer3.content = " tra loi ve Ruby ";
		answer3.question = question2;
		answer3.isCorrect = true;

		// add data Exam
		Exam exam1 = new Exam();
		exam1.id = 1;
		exam1.code = "A101";
		exam1.title = "de thi Java";
		exam1.categoryQuestion = category1;
		exam1.duration = 60;
		exam1.account = account1;
		exam1.createDate = LocalDate.now();

		Exam exam2 = new Exam();
		exam2.id = 2;
		exam2.code = "A102";
		exam2.title = "de thi Postman";
		exam2.categoryQuestion = category2;
		exam2.duration = 120;
		exam2.account = account2;
		exam2.createDate = LocalDate.now();

		Exam exam3 = new Exam();
		exam3.id = 3;
		exam3.code = "A103";
		exam3.title = "de thi Ruby";
		exam3.categoryQuestion = category3;
		exam3.duration = 90;
		exam3.account = account3;
		exam3.createDate = LocalDate.now();

		// add data ExamQuestion
		ExamQuestion examQuestion1 = new ExamQuestion();
		examQuestion1.exam = exam1;
		examQuestion1.questions = new Question[] { question1, question2 };

		ExamQuestion examQuestion2 = new ExamQuestion();
		examQuestion2.exam = exam2;
		examQuestion2.questions = new Question[] { question2, question3 };

		ExamQuestion examQuestion3 = new ExamQuestion();
		examQuestion3.exam = exam3;
		examQuestion3.questions = new Question[] { question1, question3 };

//		Exercise 3 (Optional): Date Format
//		Question 1: 
//		In ra thông tin Exam thứ 1 và property create date sẽ được format theo định 
//		dạng vietnamese

		Locale locale = new Locale("vi", "VN");
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
		String date = dateFormat.format(exam1.createDate);
		System.out.println(date);
//		Question 2: 
//		In ra thông tin: Exam đã tạo ngày nào theo định dạng 
//		Năm – tháng – ngày – giờ – phút – giây

		String pattern = "yyyy-MM-dd-HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		Exam[] exams = { exam1, exam2 };
		for (Exam exam : exams) {
			date = simpleDateFormat.format(exam.createDate);
			System.out.println(exam.code + ": " + date);
//		Question 3: 
//		Chỉ in ra năm của create date property trong Question 24
			String pattern1 = "yyyy";
			simpleDateFormat = new SimpleDateFormat(pattern1);
			for (Exam exam11 : exams) {
				date = simpleDateFormat.format(exam11.createDate);
				System.out.println(exam11.code + ": " + date);
			}
//		Question 4: 
//		Chỉ in ra tháng và năm của create date property trong Question 2
			String pattern11 = "yyyy-MM";
			simpleDateFormat = new SimpleDateFormat(pattern11);
			for (Exam exam11 : exams) {
				date = simpleDateFormat.format(exam11.createDate);
				System.out.println(exam11.code + ": " + date);
			}
//		Question 5: 
//		Chỉ in ra "MM-DD" của create date trong Question 2
			String pattern111 = "MM-dd";

			simpleDateFormat = new SimpleDateFormat(pattern111);
			for (Exam exam11 : exams) {
				date = simpleDateFormat.format(exam11.createDate);
				System.out.println(exam11.code + ": " + date);
			}
		}

	}
}
