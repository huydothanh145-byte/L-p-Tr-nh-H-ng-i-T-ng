package DoThanhHuy25684371;

import java.time.LocalDate;

public class SanPhamDienTu extends SanPham {

	public SanPhamDienTu(String maSP, String tenSP, LocalDate ngaySanXuat, float gia, int soLuong) {
		super(maSP, tenSP, ngaySanXuat, gia, soLuong);
		// TODO Auto-generated constructor stub
	}
	
	public int getThoiGianBH() {
		return thoiGianBH;
	}

	public void setThoiGianBH(int thoiGianBH) {
		this.thoiGianBH = thoiGianBH;
	}

	private int thoiGianBH;
	
	public double giaBan() {
		return giaNhap + (giaNhap * 0.9) + (thoiGianBH * 50000);
	}

	@Override
	protected void setMaSP(SanPham maSP2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void setSoLuongMoi(int soLuongMoi) {
		// TODO Auto-generated method stub
		
	}
	
}
