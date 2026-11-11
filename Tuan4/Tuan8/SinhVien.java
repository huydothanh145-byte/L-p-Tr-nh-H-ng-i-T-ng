package qlSV;

import java.time.LocalDate;

public class SinhVien {
	protected String maSV;
	protected String hoTen;
	protected LocalDate ngaySinh;
	protected String lop;
	protected int soTinChi;
	protected MonHoc monHoc;
	
	public SinhVien(String maSV, String hoTen, LocalDate ngaySinh, String lop, int soTinChi, MonHoc monHoc) {
		super();
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.lop = lop;
		this.soTinChi = soTinChi;
		this.monHoc = monHoc;
	}
	
	//phuong thuc thanh tien
	public double thanhTien() {
		return soTinChi * monHoc.getDonGia();
	}
	
	//phuong thuc lay loai
	public String getLoai() {
		return ("Sinh vien");
	}
	
	//thong tin rieng
	public String getThongTinRieng() {
		return "";
	}
	
	//getter
	public String getMaSV() { return maSV; }
	public String getHoTen() { return hoTen; }
	public LocalDate getNgaySinh() { return ngaySinh; }
	public String getLop() { return lop; }
	public int getSoTinChi() { return soTinChi; }
	public MonHoc getMonHoc() { return monHoc; }
	public String getTenMonHoc() { return monHoc.getTenMon(); }
	public float getDonGia() { return monHoc.getDonGia(); }
	
	public String soString() {
		return String.format(
				"[%s] %s | Lop: %s | NS: %s | Mon: %s (%d tin x %,.0f) | TT: %,.0f VND",
				maSV, hoTen, lop, ngaySinh,
				monHoc.getTenMon(), soTinChi, monHoc.getDonGia(),
				thanhTien()
				);
	}
}
