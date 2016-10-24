package Models;

public class SatisModel {
	private int urunId;
	private int userId;
	private String satisTarih;
	private int satisAdet;
	
	public SatisModel(){
		super();
	}
	
	public SatisModel(int urunId,int userId,String satisTarih,int satisAdet){
		super();
		this.urunId=urunId;
		this.userId=userId;
		this.satisTarih=satisTarih;
		this.satisAdet=satisAdet;
	}

	
	public int getUrunId() {
		return urunId;
	}
	public void setUrunId(int urunId) {
		this.urunId = urunId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getSatisTarih() {
		return satisTarih;
	}
	public void setSatisTarih(String satisTarih) {
		this.satisTarih = satisTarih;
	}
	public int getSatisAdet() {
		return satisAdet;
	}
	public void setSatisAdet(int satisAdet) {
		this.satisAdet = satisAdet;
	}
	

}
