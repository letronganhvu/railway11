package entity.ex5.qs4;

public class Tapchi extends TaiLieu{
	int soPhatHanh;
	int thangPhatHanh;
	


	public Tapchi(String maTaiLieu, String tenNXB, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh) {
		super(maTaiLieu, tenNXB, soBanPhatHanh);
		this.soPhatHanh = soPhatHanh;
		this.thangPhatHanh = thangPhatHanh;
	}

	public Tapchi() {
		super();
	}

	public int getSoPhatHanh() {
		return soPhatHanh;
	}

	public void setSoPhatHanh(int soPhatHanh) {
		this.soPhatHanh = soPhatHanh;
	}

	public int getThangPhatHanh() {
		return thangPhatHanh;
	}

	public void setThangPhatHanh(int thangPhatHanh) {
		this.thangPhatHanh = thangPhatHanh;
	}

	@Override
	public String toString() {
		return "Tapchi [soPhatHanh=" + soPhatHanh + ", thangPhatHanh=" + thangPhatHanh + ", maTaiLieu=" + maTaiLieu
				+ ", tenNXB=" + tenNXB + ", soBanPhatHanh=" + soBanPhatHanh + "]";
	}


	
	
}
