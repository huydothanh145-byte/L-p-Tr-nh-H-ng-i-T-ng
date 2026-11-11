package qlSV;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;

public class ListSinhVien implements IFSinhVien {

    private ArrayList<SinhVien> danhSach;

    public ListSinhVien() {
        this.danhSach = new ArrayList<>();
    }

    public ListSinhVien(ArrayList<SinhVien> ds) {
        this.danhSach = ds;
    }
    //kiểm tra null + kiểm tra trùng mã
    public boolean them(SinhVien sv) {
        if (sv == null) return false;
        if (timTheoMa(sv.getMaSV()) != null) return false;
        return danhSach.add(sv);
    }

    //duyệt tìm theo mã rồi set()
    public boolean sua(String maSV, SinhVien svMoi) {
        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).getMaSV().equals(maSV)) {
                danhSach.set(i, svMoi);
                return true;
            }
        }
        return false;
    }

    //removeIf() xóa phần tử thỏa điều kiện
    public boolean xoa(String maSV) {
        return danhSach.removeIf(
            sv -> sv.getMaSV().equals(maSV)
        );
    }

    //XÓA TẤT CẢ
    public boolean xoaTatCa() {
        if (danhSach.isEmpty()) return false;
        danhSach.clear();
        return true;
    }
    //LẤY TẤT CẢ: trả về bản sao
    public List<SinhVien> layTatCa() {
        return new ArrayList<>(danhSach);
    }

    //TÌM THEO MÃ
    public SinhVien timTheoMa(String maSV) {
        for (SinhVien sv : danhSach) {
            if (sv.getMaSV().equalsIgnoreCase(maSV))
                return sv;
        }
        return null;
    }

    //HÀM TÌM CHUNG
    public List<SinhVien> tim(Predicate<SinhVien> dieuKien) {
        List<SinhVien> kq = new ArrayList<>();

        for (SinhVien sv : danhSach)
            if (dieuKien.test(sv)) kq.add(sv);

        return kq;
    }

    //TÌM THEO TÊN
    public List<SinhVien> timTheoTen(String tuKhoa) {
        List<SinhVien> kq = new ArrayList<>();

        for (SinhVien sv : danhSach)
            if (sv.getHoTen().toLowerCase()
                .contains(tuKhoa.toLowerCase()))
                kq.add(sv);

        return kq;
    }

    //TÌM THEO LỚP
    public List<SinhVien> timTheoLop(String lop) {
        List<SinhVien> kq = new ArrayList<>();

        for (SinhVien sv : danhSach)
            if (sv.getLop().equalsIgnoreCase(lop))
                kq.add(sv);

        return kq;
    }

    //TÌM THEO LOẠI
    public List<SinhVien> timTheoLoai(String loai) {
        List<SinhVien> kq = new ArrayList<>();

        for (SinhVien sv : danhSach)
            if (sv.getLoai().equalsIgnoreCase(loai))
                kq.add(sv);

        return kq;
    }

    //TÌM THEO MÔN
    public List<SinhVien> timTheoMon(MonHoc monHoc) {
        List<SinhVien> kq = new ArrayList<>();

        for (SinhVien sv : danhSach)
            if (sv.getMonHoc() == monHoc)
                kq.add(sv);

        return kq;
    }
    //THỐNG KÊ
    public int tongSoLuong() {
        return danhSach.size();
    }

    public double tongThanhTien() {
        double tong = 0;

        for (SinhVien sv : danhSach)
            tong += sv.thanhTien();

        return tong;
    }

    //SẮP XẾP TẠI CHỖ
    public void sapXep(Comparator<SinhVien> cmp) {
        danhSach.sort(cmp);
    }

    public void sapXepGiamDan(Comparator<SinhVien> cmp) {
        danhSach.sort(cmp.reversed());
    }

    //SẮP XẾP THEO TÊN TĂNG DẦN
    public List<SinhVien> sapXepTheoTen() {
        List<SinhVien> kq = new ArrayList<>(danhSach);

        kq.sort(Comparator.comparing(SinhVien::getHoTen));

        return kq;
    }

    //SẮP XẾP THEO THÀNH TIỀN GIẢM DẦN
    public List<SinhVien> sapXepTheoThanhTienGiamDan() {
        List<SinhVien> kq = new ArrayList<>(danhSach);

        kq.sort(
            Comparator.comparingDouble(SinhVien::thanhTien)
                      .reversed()
        );

        return kq;
    }
    //trả về Map<Key, List<SinhVien>>
    public <K> Map<K, List<SinhVien>> nhomTheo(
            Function<SinhVien, K> layKey) {

        Map<K, List<SinhVien>> kq = new LinkedHashMap<>();

        for (SinhVien sv : danhSach) {
            K key = layKey.apply(sv);

            kq.computeIfAbsent(key, k -> new ArrayList<>())
              .add(sv);
        }

        return kq;
    }

    //ĐẾM THEO NHÓM
    public <K> Map<K, Integer> demTheoNhom(
            Function<SinhVien, K> layKey) {

        Map<K, Integer> kq = new LinkedHashMap<>();

        for (SinhVien sv : danhSach) {
            kq.merge(layKey.apply(sv), 1, Integer::sum);
        }

        return kq;
    }

    //TỔNG THEO NHÓM
    public <K> Map<K, Double> tongTheoNhom(
            Function<SinhVien, K> layKey,
            ToDoubleFunction<SinhVien> layGiaTri) {

        Map<K, Double> kq = new LinkedHashMap<>();

        for (SinhVien sv : danhSach) {
            K key = layKey.apply(sv);
            double val = layGiaTri.applyAsDouble(sv);

            kq.merge(key, val, Double::sum);
        }

        return kq;
    }

    //chỉ giữ nhóm có TỔNG >= minTong
    public <K> Map<K, Double> tongTheoNhom_Having(
            Function<SinhVien, K> layKey,
            ToDoubleFunction<SinhVien> layGiaTri,
            double minTong) {

        Map<K, Double> kq = new LinkedHashMap<>();

        for (Map.Entry<K, Double> e :
                tongTheoNhom(layKey, layGiaTri).entrySet()) {

            if (e.getValue() >= minTong)
                kq.put(e.getKey(), e.getValue());
        }

        return kq;
    }

    //chỉ giữ nhóm có SỐ LƯỢNG >= minDem
    public <K> Map<K, Integer> demTheoNhom_Having(
            Function<SinhVien, K> layKey,
            int minDem) {

        Map<K, Integer> kq = new LinkedHashMap<>();

        for (Map.Entry<K, Integer> e :
                demTheoNhom(layKey).entrySet()) {

            if (e.getValue() >= minDem)
                kq.put(e.getKey(), e.getValue());
        }

        return kq;
    }

	@Override
	public List<SinhVien> sapXepThepTen() {
		// TODO Auto-generated method stub
		return null;
	}
}