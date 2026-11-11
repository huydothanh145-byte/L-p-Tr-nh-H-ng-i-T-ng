package DoThanhHuy25684371;

public class PhongMayTinh extends PhongHoc {

	private int soMayTinh;
	
	public int getSoMayTinh() {
		return soMayTinh;
	}

	public void setSoMayTinh(int soMayTinh) {
		this.soMayTinh = soMayTinh;
	}

	public PhongMayTinh(String maPhong, String dayNha, float dienTich, int soBongDen, int soMayTinh) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.soMayTinh = soMayTinh;
	}

	@Override
	public boolean datChuan() {
		return dienTich / soBongDen >= 10
				&& dienTich / soMayTinh >=1.5;
	}

	@Override
	public String toString() {
		return "PhongMayTinh [soMayTinh=" + soMayTinh + "]";
	}

	@Override
	protected void hienThi() {
		// TODO Auto-generated method stub
		
	}
	
	
}
