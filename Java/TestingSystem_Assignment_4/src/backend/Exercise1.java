package backend;

import java.time.LocalDate;
import java.util.Locale;

import entity.Account;
import entity.Department;
import entity.Group;
import entity.Position;
import entity.PositionName;

public class Exercise1 {
	public void question1() {
//		Tạo constructor cho department: 
//			a) không có parameters
//			b) Có 1 parameter là nameDepartment và default id của 
//			Department = 0
//			Khởi tạo 1 Object với mỗi constructor ở trên

		Department dep1 = new Department();
		Department dep2 = new Department("Sale");
		System.out.println(dep1);
		System.out.println(dep2);

	}

	public void question2() {
//		Tạo constructor cho Account: 
//			a) Không có parameters
//			b) Có các parameter là id, Email, Username, FirstName, 
//			LastName (với FullName = FirstName + LastName)
//			c) Có các parameter là id, Email, Username, FirstName, 
//			LastName (với FullName = FirstName + LastName) và 
//			Position của User, default createDate = now
//			d) Có các parameter là id, Email, Username, FirstName, 
//			LastName (với FullName = FirstName + LastName) và 
//			Position của User, createDate
//			Khởi tạo 1 Object với mỗi constructor ở trên
		Account acc1 = new Account();
		Account acc2 = new Account(1, "nguyenthuong@gmail.com", "thuong", "nguyen thuong");
		Account acc3 = new Account(3, "levu@gmail.com", "vu", "levu", new Position(1, PositionName.PM));
		Account acc4 = new Account(4, "cuongnm@gmail.com", "cuong", "nguyencuong",
				new Position(2, PositionName.DEVELOPER), LocalDate.of(2021, 6, 6));
		System.out.println(acc1);
		System.out.println(acc2);
		System.out.println(acc3);
		System.out.println(acc4);
	}

	public void question3() {
//		Tạo constructor cho Group: 
//			a) không có parameters
//			b) Có các parameter là GroupName, Creator, array Account[] 
//			accounts, CreateDate
//			c) Có các parameter là GroupName, Creator, array String[]
//			usernames , CreateDate
//			Với mỗi username thì sẽ khởi tạo 1 Account (chỉ có thông tin 
//			username, các thông tin còn lại = null).
//			Khởi tạo 1 Object với mỗi constructor ở trên
		Account creator = new Account(1, "email", "ten", "tendaydu");
		Account account2 = new Account(2, "thuong@gmail.com",  "Nguyễn Van", "thuong");
		Account account3 = new Account(3, "cuong@gmail.com",  "Nguyễn Van", "cuong");
		String[] userNames = { "vu1", "vu2", "vu3" };
		Account[] accounts = { creator, account2, account3 };
		Group gr1 = new Group();
		Group gr2 = new Group("Group2", creator, LocalDate.now(), accounts);
		Group gr3 = new Group("group3", creator, LocalDate.now(), userNames);
		System.out.println(gr1);
		System.out.println(gr2);
		System.out.println(gr3);
	}
}
