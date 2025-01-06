package day0106db;

public class ShopDto {
	
	private int idx;
	private String sampum;
	private int su;
	private int danga;
	
	public ShopDto() {
		// TODO Auto-generated constructor stub
	}

	public ShopDto(String sampum, int su, int danga) {
		super();
		this.sampum = sampum;
		this.su = su;
		this.danga = danga;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getSampum() {
		return sampum;
	}

	public void setSampum(String sampum) {
		this.sampum = sampum;
	}

	public int getSu() {
		return su;
	}

	public void setSu(int su) {
		this.su = su;
	}

	public int getDanga() {
		return danga;
	}

	public void setDanga(int danga) {
		this.danga = danga;
	}
	
	
	
	
	
}
