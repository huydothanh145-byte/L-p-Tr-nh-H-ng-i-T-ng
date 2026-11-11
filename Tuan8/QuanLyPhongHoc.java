package DoThanhHuy25684371;

import java.util.ArrayList;
import java.util.Comparator;

public class QuanLyPhongHoc {
    private ArrayList<PhongHoc> ds = new ArrayList<>();

    // 1. Them phong hoc, khong trung ma phong
    public boolean themPhong(PhongHoc p) {
        if (timPhong(p.getMaPhong()) != null) {
            return false;
        }
        ds.add(p);
        return true;
    }

    // 2. Tim phong theo ma
    public PhongHoc timPhong(String ma) {
        for (PhongHoc p : ds) {
            if (p.getMaPhong().equalsIgnoreCase(ma)) {
                return p;
            }
        }
        return null;
    }

    // 3. Hien thi toan bo danh sach
    public void hienThiDanhSach() {
        if (ds.isEmpty()) {
            System.out.println("Danh sach rong!");
            return;
        }

        for (PhongHoc p : ds) {
            p.hienThi();
            System.out.println("------------------");
        }
    }

    // 4. Lay danh sach phong dat chuan
    public void phongDatChuan() {
        for (PhongHoc p : ds) {
            if (p.datChuan()) {
                p.hienThi();
                System.out.println("------------------");
            }
        }
    }

    // 5. Sap xep tang dan theo day nha
    public void sapXepDayNha() {
        ds.sort(Comparator.comparing(PhongHoc::getDayNha));
    }

    // 6. Sap xep giam dan theo dien tich
    public void sapXepDienTich() {
        ds.sort(Comparator.comparingDouble(
                PhongHoc::getDienTich).reversed());
    }

    // 7. Sap xep tang dan theo so bong den
    public void sapXepSoBongDen() {
        ds.sort(Comparator.comparingInt(
                p -> p.getSoBongDen()));
    }

    // 8. Cap nhat so may tinh theo ma phong
    public boolean capNhatSoMayTinh(String ma, int soMay) {
        PhongHoc p = timPhong(ma);

        if (p instanceof PhongMayTinh && soMay > 0) {
            ((PhongMayTinh) p).setSoMayTinh(soMay);
            return true;
        }
        return false;
    }

    // 9. Xoa phong theo ma
    public boolean xoaPhong(String ma) {
        PhongHoc p = timPhong(ma);

        if (p == null) {
            return false;
        }

        ds.remove(p);
        return true;
    }

    // 10. Tinh tong so phong hoc
    public int tongSoPhong() {
        return ds.size();
    }

    // 11. Tim phong may tinh co 60 may
    public void phongMayTinh60May() {
        boolean timThay = false;

        for (PhongHoc p : ds) {
            if (p instanceof PhongMayTinh) {
                PhongMayTinh mt = (PhongMayTinh) p;

                if (mt.getSoMayTinh() == 60) {
                    mt.hienThi();
                    timThay = true;
                }
            }
        }

        if (!timThay) {
            System.out.println("Khong co phong may tinh 60 may.");
        }
    }
}