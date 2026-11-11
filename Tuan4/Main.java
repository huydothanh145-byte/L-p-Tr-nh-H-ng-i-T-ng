package Tuan5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong cong nhan: ");
        int n = sc.nextInt();
        sc.nextLine();

        DanhSachCongNhan ds = new DanhSachCongNhan(n);

        for (int i = 0; i < n; i++) {

            System.out.println("\nNhap cong nhan thu " + (i + 1));

            System.out.print("Ma cong nhan: ");
            String ma = sc.nextLine();

            System.out.print("Ho: ");
            String ho = sc.nextLine();

            System.out.print("Ten: ");
            String ten = sc.nextLine();

            System.out.print("So san pham: ");
            int soSP = sc.nextInt();
            sc.nextLine();

            CongNhan cn = new CongNhan(ma, ho, ten, soSP);

            ds.ThemCongNhan(cn);
        }

        System.out.println("\n=== DANH SACH CONG NHAN ===");
        ds.XuatDanhSach();

        System.out.println("\n=== SO LUONG CONG NHAN ===");
        System.out.println(ds.SoLuongCN());

        System.out.println("\n=== CONG NHAN TREN 200 SAN PHAM ===");
        ds.CNLamTren200();

        System.out.println("\n=== SAP XEP GIAM DAN ===");
        ds.SapXepGiam();
        ds.XuatDanhSach();

        sc.close();
    }
}