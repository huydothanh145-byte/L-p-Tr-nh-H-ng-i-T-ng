package Tuan3;

import java.time.LocalDate;

public class TestHangThucPham{
    public static void main(String[] args){
	    HangThucPham h1 = new HangThucPham(
	    "001", "Thit lon", 2000000,
		LocalDate.of(2026, 8, 3),
		LocalDate.of(2026, 9, 5)
        );
	    
	    HangThucPham h2 = new HangThucPham(
	    "002", "Thit bo", 1500000,
		LocalDate.of(2026, 3, 1),
		LocalDate.of(2026, 9, 1)
	    );
	    
	    HangThucPham h3 = new HangThucPham(
	    "003", "Thit ga", 1700000,
	    LocalDate.of(2026, 4, 5),
	    LocalDate.of(2026, 5, 5)
	    );
	    		
	    System.out.println(h1);
	    System.out.println(h2);
	    System.out.println(h3);

	    try {
            HangThucPham h4 = new HangThucPham("");
            System.out.println(h4);
        } catch (IllegalArgumentException e) {
            System.out.println("Loi: " + e.getMessage());
        }


        HangThucPham h5 = new HangThucPham(
            "005", "BanhMi", 10000,
            LocalDate.of(2026, 8, 1),
            LocalDate.of(2026, 9, 1)
        );

        System.out.println(h5);


        HangThucPham h6 = new HangThucPham(
            "006", "Sua", -5000,
            LocalDate.of(2026, 8, 1),
            LocalDate.of(2026, 9, 1)
        );

        System.out.println(h6);


        HangThucPham h7 = new HangThucPham(
            "007", "Banh", 20000,
            LocalDate.of(2027, 8, 1),
            LocalDate.of(2027, 9, 1)
        );

        System.out.println(h7);
    }
}