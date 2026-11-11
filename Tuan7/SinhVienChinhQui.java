package qlSV;

import java.time.LocalDate;

public class SinhVienChinhQui extends SinhVien{
	private String hocTrucTiep;

	public SinhVienChinhQui(String maSV, String hoTen, LocalDate ngaySinh, String lop, int soTinChi, MonHoc monHoc,
			String hocTrucTiep) {
		super(maSV, hoTen, ngaySinh, lop, soTinChi, monHoc);
		this.setHocTrucTiep(hocTrucTiep);
	}

	//get va set
	public String getHocTrucTiep() { return hocTrucTiep; }
	public void setHocTrucTiep(String hocTrucTiep) {
		this.hocTrucTiep = hocTrucTiep;
	}
	
	//override tra ve loai
	@Override
	public String getLoai() { return "Chinh quy"; }
	
	//override - thong tin rieng
	@Override
	public String getThongTinRieng() {
		return "Hoc truc tiep tai: " + hocTrucTiep;
	}
	
	//override toString
	@Override
	public String soString() {
		return super.soString() + " | [+] " + getThongTinRieng(); 
	}
}
