package DoThanhHuy_25684371;

import java.time.LocalDate;

abstract class KhachHang {
	protected String maKhachHang;
	protected String hoTen;
	protected LocalDate ngayLapHoaDon;
	protected double soKW;
	protected double donGia;
	
	public KhachHang(String ma, String ten, LocalDate ngay, double soKW, double donGia) {
		this.maKhachHang = ma;
		this.hoTen = ten;
		this.ngayLapHoaDon = ngay;
		this.soKW = soKW;
		this.donGia = donGia;
	}
	
	public abstract double thanhTien();
	public LocalDate getNgayLapHoaDon() { return ngayLapHoaDon; }
	public String getMaKhachHang() { return maKhachHang; }
	public String getHoTen() { return hoTen; }

	@Override
	public String toString() {
		return "KhachHang [maKhachHang=" + maKhachHang + ", hoTen=" + hoTen + ", ngayLapHoaDon=" + ngayLapHoaDon
				+ ", soKW=" + soKW + ", donGia=" + donGia + "]";
	}

	protected abstract void setGia(double gia);
}
