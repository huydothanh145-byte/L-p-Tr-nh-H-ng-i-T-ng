package Tuan3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham {

	private String MaHang;
	private String TenHang;
	private double DonGia;
	private LocalDate NgaySanXuat;
	private LocalDate NgayHetHan;

	public String getMaHang() {
		return MaHang;
	}

	public String getTenHang() {
		return TenHang;
	}

	public void setTenHang(String tenHang) {
		if (tenHang == null || tenHang.trim().isEmpty()) {
			TenHang = "xxx";
		} else {
			TenHang = tenHang;
		}
	}

	public double getDonGia() {
		return DonGia;
	}

	public void setDonGia(double donGia) {
		if (donGia >= 0) {
			DonGia = donGia;
		} else {
			DonGia = 0;
		}
	}

	public LocalDate getNgaySanXuat() {
		return NgaySanXuat;
	}

	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		if (ngaySanXuat != null && ngaySanXuat.isBefore(LocalDate.now())) {
			NgaySanXuat = ngaySanXuat;
		} else {
			NgaySanXuat = LocalDate.now();
		}
	}

	public LocalDate getNgayHetHan() {
		return NgayHetHan;
	}

	public void setNgayHetHan(LocalDate ngayHetHan) {
		if (ngayHetHan != null && ngayHetHan.isAfter(NgaySanXuat)) {
			NgayHetHan = ngayHetHan;
		} else {
			NgayHetHan = NgaySanXuat;
		}
	}

	public HangThucPham(String maHang, String tenHang, double donGia,
			LocalDate ngaySanXuat, LocalDate ngayHetHan) {

		if (maHang == null || maHang.trim().isEmpty()) {
			throw new IllegalArgumentException("Ma hang khong duoc trong");
		}

		MaHang = maHang;
		setTenHang(tenHang);
		setDonGia(donGia);
		setNgaySanXuat(ngaySanXuat);
		setNgayHetHan(ngayHetHan);
	}

	public HangThucPham(String maHang) {

		if (maHang == null || maHang.trim().isEmpty()) {
			throw new IllegalArgumentException("Ma hang khong duoc trong");
		}

		MaHang = maHang;
		TenHang = "xxx";
		DonGia = 0;
		NgaySanXuat = LocalDate.now();
		NgayHetHan = NgaySanXuat;
	}

	public boolean daHetHan() {
		return LocalDate.now().isAfter(NgayHetHan);
	}

	@Override
	public String toString() {

		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		return "HangThucPham [MaHang=" + MaHang
				+ ", TenHang = " + TenHang
				+ ", DonGia = " + String.format("%,.0f", DonGia)
				+ ", NgaySanXuat = " + NgaySanXuat.format(f)
				+ ", NgayHetHan = " + NgayHetHan.format(f)
				+ ", HetHan = " + (daHetHan() ? "Da het han" : "Chua het han")
				+ "]";
	}
}