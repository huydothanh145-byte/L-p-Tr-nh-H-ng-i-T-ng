package DoThanhHuy25684371;

import java.util.ArrayList;
import java.util.Comparator;

public class QuanLySanPham {
	private ArrayList<SanPham> ds;
	
	public QuanLySanPham() {
		ds = new ArrayList<>();
	}
	

	public ArrayList<SanPham> getDs() {
		return ds;
	}

	public void setDs(ArrayList<SanPham> ds) {
		this.ds = ds;
	}
	
	//a) them san pham
	public boolean themSanPham(SanPham sp) {
		if(tim(sp.getMaSP() != null)) {
			return false;
		}
		ds.add(sp);
		return true;
	}
	
		private boolean tim(boolean b) {
		// TODO Auto-generated method stub
		return false;
	}

		private SanPham tim(SanPham maSP) {
		// TODO Auto-generated method stub
		return null;
	}
	
	//b) xoa san pham
	public boolean xoaSanPham(SanPham maSP) {
		SanPham sp = tim(maSP);
		if(sp == null) {
			return false;
		}
		ds.remove(sp);
		return true;
	}


	
	//c)sua so luong ton
	public boolean suaSoLuongTon(SanPham maSP, String hoTen, int soLuongMoi) {
		SanPham sp = tim(maSP);
		if(sp == null) {
			return false;
		}
		sp.setMaSP(maSP);
		sp.setSoLuong(soLuongMoi);
		return true;
	}

	//d xuat san pham theo loai
	public void xuatSanPhamTheoLoai(String loai) {
		for(SanPham sp : ds) {
			sp.hienThi();
		}
	}
	
	//e)xuat san pham co gia ban cao nhat
	public void xuatSanPhamGiaBanCaoNhat() {
		ds.sort(Comparator.comparing(SanPham :: giaBan,String.CASE_INSENSITIVE_ORDER));
	}
}
