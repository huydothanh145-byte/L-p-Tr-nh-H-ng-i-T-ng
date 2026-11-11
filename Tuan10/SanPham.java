package DoThanhHuy25684371;

import java.time.LocalDate;
import java.util.Objects;

public abstract class SanPham {
	protected String maSP;
	protected String tenSP;
	protected LocalDate ngaySanXuat;
	protected float giaNhap;
	protected int soLuong;
	
	public SanPham(String maSP, String tenSP, LocalDate ngaySanXuat, float giaNhap, int soLuong) {
		super();
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.ngaySanXuat = ngaySanXuat;
		this.giaNhap = giaNhap;
		this.soLuong = soLuong;
	}

	public String getMaSP() {
		return maSP;
	}

	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}

	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}

	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}

	public float getGiaNhap() {
		return giaNhap;
	}

	public void setGiaNhap(float giaNhap) {
		this.giaNhap = giaNhap;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	@Override
	public String toString() {
		return "SanPham [maSP=" + maSP + ", tenSP=" + tenSP + ", ngaySanXuat=" + "dd/MM/yyyy" + ngaySanXuat + ", gia=" + giaNhap
				+ "VND" + ", soLuong=" + soLuong + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(maSP);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SanPham other = (SanPham) obj;
		return Objects.equals(maSP, other.maSP);
	}
	
	public void hienThi() {
		
	}

	protected abstract void setMaSP(SanPham maSP2);

	protected abstract void setSoLuongMoi(int soLuongMoi);

	public Object getMaSP1() {
		return null;
	}

}
