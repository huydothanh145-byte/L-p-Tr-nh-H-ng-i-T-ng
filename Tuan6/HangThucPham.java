package DoThanhHuy25684371;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public class HangThucPham {
	private int id;
	private final String maHang; // khong cho phep sua
	private String tenHang;
	private LocalDate ngaySanXuat;
	private LocalDate ngayHetHan;
	private float gia;
	private ChronoLocalDate ngaySX;
	
	private static int demSoLuong = 0;

	//constructor mac dinh
	public HangThucPham() {
		super();
		this.id = ++demSoLuong;
		this.maHang = "MAC_DINH";
		this.tenHang = "Hàng mặc định";
		this.ngaySanXuat = LocalDate.now();
		this.ngayHetHan = LocalDate.now().plusDays(7);
		this.gia = 1.0f;
	}
	
	//constructor co tham so
	public HangThucPham(String maHang, String tenHang, LocalDate ngaySanXuat, LocalDate ngayHetHan, float gia) {
		
		this.id = ++demSoLuong;
		
		if(maHang == null || maHang.trim().isEmpty())
			throw new IllegalArgumentException("Mã hàng không được để trống!");
		if(tenHang == null || tenHang.trim().isEmpty())
			throw new IllegalArgumentException("Tên hàng không được để trống!");
		if(gia <= 0)
			throw new IllegalArgumentException("Giá phải lớn hơn 0!");
		if(!kiemTraNgaySanXuat(ngaySanXuat))	
			throw new IllegalArgumentException("Ngày SX không được là tương lai!");
        if(!kiemTraNgayHetHan(ngaySanXuat, ngayHetHan)) 
			throw new IllegalArgumentException("Ngày HH phải sau ngày SX!");
		
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.ngaySanXuat = ngaySanXuat;
		this.ngayHetHan = ngayHetHan;
		this.gia = gia;
	}

	//kiem tra ngay
	private boolean kiemTraNgaySanXuat(LocalDate ngaySanXuat2) {
		return ngaySX != null && !ngayHetHan.isAfter(LocalDate.now());
				
	}
	
	private boolean kiemTraNgayHetHan(LocalDate ngaySanXuat2, LocalDate ngayHetHan2) {
		return ngaySX != null && ngayHetHan != null && ngayHetHan.isAfter(ngaySX);
	}

	//getter
	public int getId() {
		return id;
	}
	public String getTenHang() {
		return tenHang;
	}
	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}
	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}
	public float getGia() {
		return gia;
	}
	public String getMaHang() {
		return maHang;
	}
	
	//setter
	public void setTenHang(String tenHang) {
		if(tenHang == null || tenHang.trim().isEmpty())
			throw new IllegalArgumentException("Tên hàng không được rỗng!");
		this.tenHang = tenHang;
	}
	
	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		if(!kiemTraNgaySanXuat(ngaySanXuat))
		    throw new IllegalArgumentException("Ngày SX không được tương lai!");
		if(this.ngayHetHan != null && !kiemTraNgayHetHan(ngaySanXuat, this.ngayHetHan))
	        throw new IllegalArgumentException("Ngày SX phải trước ngày HH!");
        this.ngaySanXuat = ngaySanXuat; 
	}
	
	public void setNgayHetHan(LocalDate ngayHetHan) {
		if(this.ngaySanXuat == null)
			throw new IllegalArgumentException("Chưa có ngày SX!");
		if(!kiemTraNgayHetHan(this.ngaySanXuat, ngayHetHan))
			throw new IllegalArgumentException("Ngày hết hạn phải sau ngày SX!");
		this.ngayHetHan = ngayHetHan;
	}

	public void setGia(float gia) {
		if(gia <= 0)
			throw new IllegalArgumentException("Giá phải lớn hơn 0!");
		this.gia = gia;
	}
	
	//kiem tra het han
	public boolean kiemTraHetHan() {
		return LocalDate.now().isAfter(this.ngayHetHan);
	}
	
	public String trangThaiChiTiet() {
		LocalDate homNay = LocalDate.now();
		if(homNay.isBefore(ngaySanXuat)) return "Chưa sản xuất";
		if(homNay.isAfter(ngayHetHan)) return "Hết hạn";
		if(homNay.isEqual(ngayHetHan)) return "Hết hạn hôm nay";
		long con = ngayHetHan.toEpochDay() - homNay.toEpochDay();
		return "Còn " + con + " ngày";
	}
	
	//ngan chan clone
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Không thể sao chép HangThucPham!");
	}
	
	public int compareTo(HangThucPham o) {
		return Integer.compare(this.id, o.id);
	}
	
	public String toString() {
		return String.format(
				"| %-4d | %-10s | %-18s | %-12s | %-12s | %-10.0f |",
				id , maHang, tenHang, ngaySanXuat, ngayHetHan, gia);
	}	
}
