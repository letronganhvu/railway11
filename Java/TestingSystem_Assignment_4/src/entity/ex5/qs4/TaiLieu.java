package entity.ex5.qs4;

public class TaiLieu {
	String maTaiLieu;
	String tenNXB;
	int soBanPhatHanh;
	
	
	public String getMaTaiLieu() {
		return maTaiLieu;
	}
	public void setMaTaiLieu(String maTaiLieu) {
		this.maTaiLieu = maTaiLieu;
	}
	public String getTenNXB() {
		return tenNXB;
	}
	public void setTenNXB(String tenNXB) {
		this.tenNXB = tenNXB;
	}
	public int getsoBanPhatHanh() {
		return soBanPhatHanh;
	}
	public void setsoBanPhatHanh(int soBanPhatHanh) {
		this.soBanPhatHanh = soBanPhatHanh;
	}
	public TaiLieu(String maTaiLieu, String tenNXB, int soBanPhatHanh) {
		super();
		this.maTaiLieu = maTaiLieu;
		this.tenNXB = tenNXB;
		this.soBanPhatHanh = soBanPhatHanh;
	}
	public TaiLieu() {
		super();
	}
	@Override
	public String toString() {
		return "TaiLieu [maTaiLieu=" + maTaiLieu + ", tenNXB=" + tenNXB + ", soBanPhatHanh=" + soBanPhatHanh + "]";
	}
	
	
}
