package entity;
import java.time.LocalDate;

public class Group {
	private int id;
	private String name;
	private Account creator;
	private LocalDate createDate;
	private Account[] accounts;
	private String[] userNames;
	
	public Group() {
	}

	public Group(String name, Account creator, LocalDate createDate, Account[] accounts) {
		super();
		this.name = name;
		this.creator = creator;
		this.createDate = createDate;
		this.accounts = accounts;
	}

	public Group(String name, Account creator, LocalDate createDate, String[] userNames) {
		super();
		this.name = name;
		this.creator = creator;
		this.createDate = createDate;
		if (userNames != null && userNames.length > 0) {
		//	khởi tạo mảng accounts gồm  (userNames.length phần tử )
			Account[] accounts = new Account[userNames.length];
		//	mỗi 1 usernames tương ứng khởi tạo 1 account
			for (int i = 0; i < userNames.length; i++) {
				accounts[i] = new Account(0, userNames[i],"","");
			}
			this.accounts = accounts;
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getCreator() {
		return creator;
	}

	public void setCreator(Account creator) {
		this.creator = creator;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public Account[] getAccounts() {
		return accounts;
	}

	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}

	public String[] getUserNames() {
		return userNames;
	}

	public void setUserNames(String[] userNames) {
		this.userNames = userNames;
	}
	
	
	
	
	

}


