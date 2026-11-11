package DoThanhHuy25684371;

public class PhongThiNghiem extends PhongHoc {

	private String chuyenNganh;
	private int sucChua;
	private boolean coBonRua;
	
	public String getChuyenNganh() {
		return chuyenNganh;
	}

	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}

	public int getSucChua() {
		return sucChua;
	}

	public void setSucChua(int sucChua) {
		this.sucChua = sucChua;
	}

	public boolean isCoBonRua() {
		return coBonRua;
	}

	public void setCoBonRua(boolean coBonRua) {
		this.coBonRua = coBonRua;
	}

	
	public PhongThiNghiem(String maPhong, String dayNha, float dienTich, int soBongDen, String chuyenNganh, int sucChua,
			boolean coBonRua) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.chuyenNganh = chuyenNganh;
		this.sucChua = sucChua;
		this.coBonRua = coBonRua;
	}

	
	@Override
	public String toString() {
		return "PhongThiNghiem [chuyenNganh=" + chuyenNganh + ", sucChua=" + sucChua + ", coBonEua=" + coBonRua + "]";
	}

	public PhongThiNghiem(String maPhong, String dayNha, float dienTich, int soBongDen) {
		super(maPhong, dayNha, dienTich, soBongDen);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean datChuan() {
		return dienTich / soBongDen >=10 
				&& coBonRua;	
	}

}
