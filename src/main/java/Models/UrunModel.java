package Models;

public class UrunModel {

	private int urunId;
	private String urunAd;
	private String urunAciklama;
	private int fiyat ;
	
	public UrunModel(){
		super();
	}
	public UrunModel(int urunId,String urunAd,String urunAciklama,int fiyat){
		this.urunId=urunId;
		this.urunAd=urunAd;
		this.urunAciklama=urunAciklama;
		this.fiyat=fiyat;
		
	}
	
	
	public int getUrunId() {
		return urunId;
	}
	public void setUrunId(int urunId) {
		this.urunId = urunId;
	}
	public String getUrunAd() {
		return urunAd;
	}
	public void setUrunAd(String urunAd) {
		this.urunAd = urunAd;
	}
	public String getUrunAciklama() {
		return urunAciklama;
	}
	public void setUrunAciklama(String urunAciklama) {
		this.urunAciklama = urunAciklama;
	}
	public int getFiyat() {
		return fiyat ;
	}
	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}
	
	
}
