package entity;
import java.time.LocalDate;
import java.util.Arrays;

public class Account {
//	public int id; dùng để có thể gán các giá trị khác package là public
	int id;
	String email;
	String userName;
	String fullName;
	Department department;
	Position position;
	LocalDate createDate;
	Group[] groups;
	// Dùng get set để gán giá trị khác package là private không công khai
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	public Position getPosition() {
		return position;
	}


	public void setPosition(Position position) {
		this.position = position;
	}


	public LocalDate getCreateDate() {
		return createDate;
	}


	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}


	public Group[] getGroups() {
		return groups;
	}


	public void setGroups(Group[] groups) {
		this.groups = groups;
	}


	public Account() {
	
	}
	
	
	public Account(int id, String email, String userName, String fullName) {
		super();
		// Có tác dụng: nhảy tới hàm khởi tạo của đối tượng cha của Account nếu có
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
	}
	


	public Account(int id, String email, String userName, String fullName, Position position) {
		super();
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
		this.position = position;
		this.createDate = LocalDate.now();
	}


	public Account(int id, String email, String userName, String fullName, Position position, LocalDate createDate) {
		super();
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
		this.position = position;
		this.createDate = createDate;
	}


	@Override
	public String toString() {
		return "Account [email=" + email + ", userName=" + userName + ", fullName=" + fullName + ", createDate="
				+ createDate + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fullName == null) ? 0 : fullName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (fullName == null) {
			if (other.fullName != null)
				return false;
		} else if (!fullName.equals(other.fullName))
			return false;
		return true;
	}


	
}
