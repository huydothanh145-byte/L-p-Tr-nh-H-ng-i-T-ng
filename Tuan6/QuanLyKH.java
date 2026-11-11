package DoThanhHuy_25684371;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class QuanLyKH implements IQuanLyKH {
    List<KhachHang> ls;

    public QuanLyKH() {
        ls = new ArrayList<KhachHang>(2);
    }

    public Boolean themKH(KhachHang kh) {
        if (ls.contains(kh)) {
            return false;
        } else {
            return ls.add(kh);
        }
    }

    public boolean capNhat(String ma, double gia) {
        for (KhachHang kh : ls) {
            if (kh.getMaKhachHang().equalsIgnoreCase(ma)) {
                kh.setGia(gia);
                return true;
            }
        }
        return true;
    }

    public boolean xoaMa(String ma) {
        for (KhachHang kh : ls) {
            if (kh.getMaKhachHang().equalsIgnoreCase(ma)) {
                ls.remove(kh);
                return true;
            }
        }
        return true;
    }

    public void sapXep() {
        Collections.sort(ls, new Comparator<KhachHang>() {
            @Override
            public int compare(KhachHang o1, KhachHang o2) {
                String X = new String(o1.getMaKhachHang());
                String Y = new String(o2.getMaKhachHang());
                return X.compareToIgnoreCase(Y);
            }
        });
    }
}