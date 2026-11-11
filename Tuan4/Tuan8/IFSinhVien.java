package qlSV;

import java.util.List;

public interface IFSinhVien {
	
	//them xoa sua
	//tra boolean thanh cong(true) that bai(false)
	boolean them(SinhVien sv);
	boolean sua(String maSV, SinhVien svMoi);
	boolean xoa(String maSV);
	boolean xoaTatCa();
	
	//tim kiem
	//tra ve list hoac doi tuong don
	List<SinhVien> layTatCa();
	SinhVien timTheoMa(String maSV);
	List<SinhVien> timTheoTen(String tuKhoa);
	List<SinhVien> timTheoLop(String lop);
	List<SinhVien> timTheoLoai(String loai);
	List<SinhVien> timTheoMon(MonHoc monHoc);
	
	//thong ke
	int tongSoLuong();
	double tongThanhTien();
	
	//sap xep
	List<SinhVien> sapXepThepTen();
	List<SinhVien> sapXepTheoThanhTienGiamDan(); 
}
