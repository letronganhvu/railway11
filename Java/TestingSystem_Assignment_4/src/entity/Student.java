package entity;

public class Student {
	private int id;
	private String name;
	private String homeTown;
	private float diemHocLuc;

	public Student(String name, String homeTown) {
		// this trỏ trực tiếp đến đối tượng của Student
		super();
		this.name = name;
		this.homeTown = homeTown;
		diemHocLuc = 0f;
	}

	public float getDiemHocLuc() {
		return diemHocLuc;
	}

	public void setDiemHocLuc(float diemHocLuc) {
		this.diemHocLuc = diemHocLuc;
	}

	public void congDiemHocLuc(float congdiemHocLuc) {
		this.diemHocLuc = this.diemHocLuc + congdiemHocLuc;
	}

	@Override
	public String toString() {
		String hocluc = "";
		if (diemHocLuc < 4) {
			hocluc = "Yếu";

		} else if (diemHocLuc >= 4 && diemHocLuc < 6) {
			hocluc = "Trung Bình";
		} else if (diemHocLuc >= 6 && diemHocLuc < 8) {
			hocluc = "Khá";
		} else {
			hocluc = "Giỏi";
		}
		return "Student [id=" + id + ", name=" + name + ", homeTown=" + homeTown + ", diem Hoc Luc=" + hocluc + "]";
	}

}
