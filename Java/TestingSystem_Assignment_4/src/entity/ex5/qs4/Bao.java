package entity.ex5.qs4;

import java.time.LocalDate;

public class Bao extends TaiLieu {
	LocalDate ngayPhatHanh;

	public LocalDate getNgayPhatHanh() {
		return ngayPhatHanh;
	}

	public void setNgayPhatHanh(LocalDate ngayPhatHanh) {
		this.ngayPhatHanh = ngayPhatHanh;
	}

	public Bao(String maTaiLieu, String tenNXB, int soPhatHanh, LocalDate ngayPhatHanh) {
		super(maTaiLieu, tenNXB, soPhatHanh);
		this.ngayPhatHanh = ngayPhatHanh;
	}

	public Bao() {
		super();
	}

	@Override
	public String toString() {
		return "Bao [ngayPhatHanh=" + ngayPhatHanh + ", maTaiLieu=" + maTaiLieu + ", tenNXB=" + tenNXB
				+ ", soBanPhatHanh=" + soBanPhatHanh + "]";
	}


	
}
