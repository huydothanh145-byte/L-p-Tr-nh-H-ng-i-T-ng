package qlSV;

import java.time.LocalDate;

public class SinhVienTuXa extends SinhVien{
	private String nenTang;

	public SinhVienTuXa(String maSV, String hoTen, LocalDate ngaySinh, String lop, int soTinChi, MonHoc monHoc,
			String nenTang) {
		super(maSV, hoTen, ngaySinh, lop, soTinChi, monHoc);
		this.nenTang = nenTang;
	}

	public String getNenTang() { return nenTang; }
	public void setNenTang(String nenTang) {
		this.nenTang = nenTang;
	}
	
	//override loai
	@Override
	public String getLoai() {
		return "Tu xa";
	}

	//override thanh tien - 10%
	@Override
	public double thanhTien() {
		return super.thanhTien() * 0.9;
	}
	
	@Override
	public String toString() {
		return super.soString() + " " + getThongTinRieng();
	}
	
}
