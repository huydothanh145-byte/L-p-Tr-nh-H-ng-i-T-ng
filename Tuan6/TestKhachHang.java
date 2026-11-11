package DoThanhHuy_25684371;

import java.time.LocalDate;

public class TestKhachHang {
	public static void main(String[] args) {
		KhachHangVietNam kh1 = new KhachHangVietNam(
				"VN01",
				"Nguyen Van A",
				LocalDate.of(2026, 10, 1),
				150,
				3000,
				100,
				"Sinh hoat"
				);
	    KhachHangNuocNgoai kh2 = new KhachHangNuocNgoai(
                "NN01",
                "John Smith",
                LocalDate.of(2026, 10, 2),
                200,
                3000,
                "My"
                );
    System.out.println("Ma KH: " + kh1.getMaKhachHang());
    System.out.println("Ho ten: " + kh1.getHoTen());
    System.out.println("Thanh tien VN: " + kh1.thanhTien());

    System.out.println("Ma KH: " + kh2.getMaKhachHang());
    System.out.println("Ho ten: " + kh2.getHoTen());
    System.out.println("Thanh tien NN: " + kh2.thanhTien());      
	}
}
