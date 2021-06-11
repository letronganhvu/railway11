package entity.ex5.qs4;

public class Sach extends TaiLieu{
	String tenTacGia;
	int soTrang;
	
	public Sach(String maTaiLieu, String tenNXB, int soPhatHanh, String tenTacGia, int soTrang) {
		super(maTaiLieu, tenNXB, soPhatHanh);
		this.tenTacGia = tenTacGia;
		this.soTrang = soTrang;
	}

	public String getTenTacGia() {
		return tenTacGia;
	}

	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}

	public int getSoTrang() {
		return soTrang;
	}

	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}

	@Override
	public String toString() {
		return "Sach [tenTacGia=" + tenTacGia + ", soTrang=" + soTrang + ", maTaiLieu=" + maTaiLieu + ", tenNXB="
				+ tenNXB + ", soBanPhatHanh=" + soBanPhatHanh + "]";
	}


	
	
	
}
