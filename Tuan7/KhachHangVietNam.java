package DoThanhHuy_25684371;

import java.time.LocalDate;
	
class KhachHangVietNam extends KhachHang {
	private String doiTuong;
	private double dinhMuc;
	
	public KhachHangVietNam(String ma, String ten, LocalDate ngay, double soKW, double donGia, double dinhMuc, String doiTuong) {
		super(ma, ten, ngay, soKW, donGia);
		this.doiTuong = doiTuong;
		this.dinhMuc = dinhMuc;
	}
	public String getDoiTuong() {
		return doiTuong;
	}

	@Override
	public double thanhTien() {
		return soKW <= dinhMuc 
				? soKW * donGia
				: dinhMuc * donGia + (soKW - dinhMuc) * donGia * 2.5;		
	}
	@Override
	protected void setGia(double gia) {
		// TODO Auto-generated method stub
		
	}	
}
