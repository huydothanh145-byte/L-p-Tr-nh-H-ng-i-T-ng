package Tuan5;

    public class DanhSachCongNhan{
    	private CongNhan[] ds;
    	private int soLuong;
    	
    //tao n phan tu	
    public DanhSachCongNhan(int n)	 {
    	ds = new CongNhan[n];
    	soLuong = 0;
    }
    
    //them cong nhan
    public boolean ThemCongNhan(CongNhan cn) {
    	if(soLuong < ds.length) {
    		ds[soLuong] = cn;
    		soLuong++;
    		return true;
    	}
    	return false;
    }
    
    //xuat danh sach
    public void XuatDanhSach() {
    	for(int i = 0; i < soLuong; i++) {
    		System.out.println(ds[i]);
    	}
    }
    
    //tinh so luong cn
    public int SoLuongCN() {
    	return soLuong;
    }
    
    //xuat thong tin cn lam tren 200 SP
    public void CNLamTren200() {
    	for(int i = 0; i< soLuong; i++) {
    		if(ds[i].getmSoSP() > 200) {
    			System.out.println(ds[i]);
    		}
    	}
    }
    
    //sap xep CN theo so SP giam dan
    public void SapXepGiam() {
    	for(int i = 0; i < soLuong; i++) {
    		for(int j = i + 1; j < soLuong;j ++) {
    			if(ds[i].getmSoSP() < ds[j].getmSoSP()) {
    				CongNhan temp = ds[i];
    				ds[i] = ds[j];
    				ds[j] = temp;
    			}
    		}
    	}
    }
    
    

}
