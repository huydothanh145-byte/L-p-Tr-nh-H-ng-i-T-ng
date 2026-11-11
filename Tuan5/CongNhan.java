package Tuan5;

public class CongNhan {
	private String maCN;
	private String mHo;
	private String mTen;
	private int mSoSP;
	
	public String getMaCN() {
		return maCN;
	}
	public void setMaCN(String maCN) {
		this.maCN = maCN;
	}
	public String getmHo() {
		return mHo;
	}
	public void setmHo(String mHo) {
		this.mHo = mHo;
	}
	public String getmTen() {
		return mTen;
	}
	public void setmTen(String mTen) {
		this.mTen = mTen;
	}
	public int getmSoSP() {
		return mSoSP;
	}
	public void setmSoSP(int mSoSP) {
		this.mSoSP = mSoSP;
	}
	
	public CongNhan(String maCN, String mHo, String mTen, int mSoSP) {
		super();
		this.maCN = maCN;
		this.mHo = mHo;
		this.mTen = mTen;
		this.mSoSP = mSoSP;
	}
	
	public CongNhan(){
		maCN = " ";
		mHo = " ";
		mTen = " ";
		mSoSP = 0;
	}
	
	public double TinhLuong() {
		if (mSoSP <= 199) {
			return mSoSP * 0.5;
		} else if(mSoSP >= 200 && mSoSP < 399){
			return mSoSP * 0.55;
		} else if(mSoSP >= 400 && mSoSP < 599) {
			return mSoSP * 0.6;
		} else {
			return mSoSP * 0.65;
		}
	}
	
	 public String toString() {
	        return String.format("%-10s %-15s %-10s %5d",
	                maCN, mHo, mTen, mSoSP);
	    }

}

