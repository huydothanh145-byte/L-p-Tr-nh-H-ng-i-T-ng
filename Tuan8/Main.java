
package DoThanhHuy25684371;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static QuanLyPhongHoc ql = new QuanLyPhongHoc();

    public static void main(String[] args) {
        int chon;

        do {
            System.out.println("\n========== MENU QUAN LY PHONG HOC ==========");
            System.out.println("1. Them phong ly thuyet");
            System.out.println("2. Them phong may tinh");
            System.out.println("3. Them phong thi nghiem");
            System.out.println("4. Hien thi danh sach phong hoc");
            System.out.println("5. Tim phong theo ma");
            System.out.println("6. Xoa phong theo ma");
            System.out.println("7. Hien thi phong dat chuan");
            System.out.println("8. Sap xep tang dan theo day nha");
            System.out.println("9. Sap xep giam dan theo dien tich");
            System.out.println("10. Sap xep tang dan theo so bong den");
            System.out.println("11. Cap nhat so may tinh");
            System.out.println("12. Tong so phong hoc");
            System.out.println("13. Liet ke phong may tinh co 60 may");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");

            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    themPhongLyThuyet();
                    break;

                case 2:
                    themPhongMayTinh();
                    break;

                case 3:
                    themPhongThiNghiem();
                    break;

                case 4:
                    ql.hienThiDanhSach();
                    break;

                case 5:
                    timPhong();
                    break;

                case 6:
                    xoaPhong();
                    break;

                case 7:
                    ql.phongDatChuan();
                    break;

                case 8:
                    ql.sapXepDayNha();
                    System.out.println("Da sap xep tang dan theo day nha.");
                    ql.hienThiDanhSach();
                    break;

                case 9:
                    ql.sapXepDienTich();
                    System.out.println("Da sap xep giam dan theo dien tich.");
                    ql.hienThiDanhSach();
                    break;

                case 10:
                    ql.sapXepSoBongDen();
                    System.out.println("Da sap xep tang dan theo so bong den.");
                    ql.hienThiDanhSach();
                    break;

                case 11:
                    capNhatSoMayTinh();
                    break;

                case 12:
                    System.out.println("Tong so phong hoc: " + ql.tongSoPhong());
                    break;

                case 13:
                    ql.phongMayTinh60May();
                    break;

                case 0:
                    System.out.println("Ket thuc chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (chon != 0);
    }

    // Nhap thong tin chung
    public static String nhapMaPhong() {
        System.out.print("Nhap ma phong: ");
        return sc.nextLine();
    }

    public static String nhapDayNha() {
        System.out.print("Nhap day nha: ");
        return sc.nextLine();
    }

    public static float nhapDienTich() {
        System.out.print("Nhap dien tich: ");
        return Float.parseFloat(sc.nextLine());
    }

    public static int nhapSoBongDen() {
        System.out.print("Nhap so bong den: ");
        return Integer.parseInt(sc.nextLine());
    }

    // Them phong ly thuyet
    public static void themPhongLyThuyet() {
        System.out.println("\n--- THEM PHONG LY THUYET ---");

        System.out.print("Nhap ma phong: ");
        String ma = sc.nextLine();

        System.out.print("Nhap day nha: ");
        String day = sc.nextLine();

        System.out.print("Nhap dien tich: ");
        float dt = Float.parseFloat(sc.nextLine());

        System.out.print("Nhap so bong den: ");
        int den = Integer.parseInt(sc.nextLine());

        System.out.print("Co may chieu khong (true/false): ");
        boolean mayChieu = Boolean.parseBoolean(sc.nextLine());

        PhongLyThuyet p = new PhongLyThuyet(
                ma, day, dt, den, mayChieu);

        if (ql.themPhong(p)) {
            System.out.println("Them phong ly thuyet thanh cong!");
        } else {
            System.out.println("Ma phong da ton tai!");
        }
    }

    // Them phong may tinh
    public static void themPhongMayTinh() {
        System.out.println("\n--- THEM PHONG MAY TINH ---");

        System.out.print("Nhap ma phong: ");
        String ma = sc.nextLine();

        System.out.print("Nhap day nha: ");
        String day = sc.nextLine();

        System.out.print("Nhap dien tich: ");
        float dt = Float.parseFloat(sc.nextLine());

        System.out.print("Nhap so bong den: ");
        int den = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap so may tinh: ");
        int soMay = Integer.parseInt(sc.nextLine());

        PhongMayTinh p = new PhongMayTinh(
                ma, day, dt, den, soMay);

        if (ql.themPhong(p)) {
            System.out.println("Them phong may tinh thanh cong!");
        } else {
            System.out.println("Ma phong da ton tai!");
        }
    }

    // Them phong thi nghiem
    public static void themPhongThiNghiem() {
        System.out.println("\n--- THEM PHONG THI NGHIEM ---");

        System.out.print("Nhap ma phong: ");
        String ma = sc.nextLine();

        System.out.print("Nhap day nha: ");
        String day = sc.nextLine();

        System.out.print("Nhap dien tich: ");
        float dt = Float.parseFloat(sc.nextLine());

        System.out.print("Nhap so bong den: ");
        int den = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap chuyen nganh: ");
        String nganh = sc.nextLine();

        System.out.print("Nhap suc chua: ");
        int sucChua = Integer.parseInt(sc.nextLine());

        System.out.print("Co bon rua khong (true/false): ");
        boolean bonRua = Boolean.parseBoolean(sc.nextLine());

        PhongThiNghiem p = new PhongThiNghiem(
                ma, day, dt, den, nganh, sucChua, bonRua);

        if (ql.themPhong(p)) {
            System.out.println("Them phong thi nghiem thanh cong!");
        } else {
            System.out.println("Ma phong da ton tai!");
        }
    }

    // Tim phong theo ma
    public static void timPhong() {
        System.out.print("Nhap ma phong can tim: ");
        String ma = sc.nextLine();

        PhongHoc p = ql.timPhong(ma);

        if (p != null) {
            System.out.println("Tim thay phong hoc:");
            p.hienThi();
        } else {
            System.out.println("Khong tim thay phong hoc!");
        }
    }

    // Xoa phong theo ma
    public static void xoaPhong() {
        System.out.print("Nhap ma phong can xoa: ");
        String ma = sc.nextLine();

        if (ql.xoaPhong(ma)) {
            System.out.println("Xoa phong thanh cong!");
        } else {
            System.out.println("Khong tim thay ma phong!");
        }
    }

    // Cap nhat so may tinh
    public static void capNhatSoMayTinh() {
        System.out.print("Nhap ma phong may tinh: ");
        String ma = sc.nextLine();

        System.out.print("Nhap so may tinh moi: ");
        int soMay = Integer.parseInt(sc.nextLine());

        if (ql.capNhatSoMayTinh(ma, soMay)) {
            System.out.println("Cap nhat so may tinh thanh cong!");
        } else {
            System.out.println(
                    "Khong tim thay phong may tinh hoac so may khong hop le!");
        }
    }
}
