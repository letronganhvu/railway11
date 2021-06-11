package backend;

import java.util.Scanner;

import entity.ex5.QLCB;

public class Exercise5 {
//	Exercise 5: Inheritance
//	Chú ý: áp dụng cả encapsulation cho các question ở dưới
//	Question 1: inheritance
//	Một đơn vị sản xuất gồm có các cán bộ là công nhân, kỹ sư, nhân viên.
//	Mỗi cán bộ cần quản lý các dữ liệu: Họ tên, tuổi, giới tính(name, nữ,
//	khác), địa chỉ.
//	Cấp công nhân sẽ có thêm các thuộc tính riêng: Bậc (1 đến 10).
//	Cấp kỹ sư có thuộc tính riêng: Nghành đào tạo.
//	Các nhân viên có thuộc tính riêng: công việc.
//	Hãy xây dựng các lớp CongNhan, KySu, NhanVien kế thừa từ lớp
//	CanBo.

//	Question 2: Tiếp tục Question 1
//	Xây dựng lớp QLCB(quản lý cán bộ) cài đặt các phương thức thực
//	hiện các chức năng sau:
//	a) Thêm mới cán bộ.
//	b) Tìm kiếm theo họ tên.
//	c) Hiện thị thông tin về danh sách các cán bộ.
//	d) Nhập vào tên của cán bộ và delete cán bộ đó
//	e) Thoát khỏi chương trình.
	public void question2() {
		Scanner sc = new Scanner(System.in);
		QLCB qlcb = new QLCB();

		System.out.println(
				"Mời bạn nhập vào phương thức thực hiện các chức năng sau:\n1.Thêm mới cán bộ\n2.Tìm kiếm theo họ tên\n3.Hiện thị thông tin về danh sách các cán bộ\n4.Nhập vào tên của cán bộ và delete cán bộ đó\n5.Thoát khỏi chương trình");
		while (true) {
			System.out.println("Mời bạn chọn chức năng");
			int choose = sc.nextInt();
			switch (choose) {
			case 1:
				qlcb.addCanBo();
				break;
			case 2:
				qlcb.findHoTen();
				break;
			case 3:
				qlcb.dsCanBo();
				break;
			case 4:
				qlcb.deleteCanBo();
				break;
			case 5:
				return;

			default:
				break;
			}
		}
	}
	
//	Question 3 (Optional): constructor inheritance
//	Tạo class abstract Person gồm các property name và tạo constructor có
//	1 parameter name
//	Tạo class abstract Student kế thừa Person gồm các property id, name
//	và tạo constructor có 2 parameter id, name
//	Tạo class HighSchoolStudent kế thừa Student bao gồm các property id,
//	name, clazz (Lớp đang học), desiredUniversity (trường đại học mong
//	muốn vào) và tạo constructor có 4 parameter id, name, clazz,
//	desiredUniversity.
//	Hãy khởi tạo Object HighSchoolStudent với các giá trị: id = 1, name =
//	"Nam", clazz = "Chuyên Văn", desiredUniversity = "Đại học công
//	nghệ"
}
