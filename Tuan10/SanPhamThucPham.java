package DoThanhHuy25684371;

import java.time.LocalDate;

public class SanPhamThucPham extends SanPham{
	private static final int NULL = 0;
	public SanPhamThucPham(String maSP, String tenSP, LocalDate ngaySanXuat, float giaNhap, int soLuong) {
		super(maSP, tenSP, ngaySanXuat, giaNhap, soLuong);
		// TODO Auto-generated constructor stub
	}
	public int getNgayHetHan() {
		return ngayHetHan;
	}
	public void setNgayHetHan(int ngayHetHan) {
		this.ngayHetHan = ngayHetHan;
	}
	private int ngayHetHan;
	
	public double giaBan() {
		if (ngayHetHan != NULL) {
			return giaNhap + (giaNhap * 0.05);
		} else {
			return 0;
		}
	}
	@Override
	protected void setMaSP(SanPham maSP2) {
	}

	@Override
	protected void setSoLuongMoi(int soLuongMoi) {
		// TODO Auto-generated method stub
		
	}
	
	
}
