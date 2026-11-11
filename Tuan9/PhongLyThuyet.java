package DoThanhHuy25684371;

public class PhongLyThuyet extends PhongHoc{
	public PhongLyThuyet(String maPhong, String dayNha, float dienTich, int soBongDen) {
		super(maPhong, dayNha, dienTich, soBongDen);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean datChuan() {
		return dienTich / soBongDen >=10 
				&& coMayChieu;
	}
	
	private boolean coMayChieu;

	public PhongLyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen, boolean coMayChieu) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.coMayChieu = coMayChieu;
	}

	public boolean isCoMayChieu() {
		return coMayChieu;
	}

	public void setCoMayChieu(boolean coMayChieu) {
		this.coMayChieu = coMayChieu;
	}

	@Override
	public String toString() {
		return "PhongLyThuyet [coMayChieu=" + coMayChieu + "]";
	}
	
	
}
