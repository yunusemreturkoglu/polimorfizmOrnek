package com.bilgeadam.bisiklet;

public abstract class Bisiklet {
	
	private String marka;
	private String model;
	private int vites=1;
	private int hiz;
	private int birim;
	
	public void setBirim(int birim) {
		this.birim = birim;
	}
	public int getBirim() {
		return birim;
	}
	
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getVites() {
		return vites;
	}
	public void setVites(int vites) {
		this.vites = vites;
	}
	public int getHiz() {
		return hiz;
	}
	public void setHiz(int hiz) {
		this.hiz=hiz;
	}
	
	
	public void vitesArttir() {
		setVites(getVites()+1);
		System.out.println("Vites Arttirildi : "+getVites()+". Vites");
	}
	public  void vitesAzalt() {
		setVites(getVites()-1);	
		System.out.println("Vites Azaltildi. "+getVites()+". Vites");
	}

	public void frenYap() {
		setHiz(getHiz()-1);
		System.out.println("Fren Yapildi");
	}
	public void dur() {
		setHiz(0);
		setVites(1);
		System.out.println("Bisiklet Durdu");
	}
//	public abstract void pedalAt();
	
	public void bisikletMenu(){
		System.out.println( "1. Pedal Cevir\n"
					+ "2. Vites Arttir\n"
					+ "3. Vites Azalt\n"
					+ "4. Fren Yap\n"
					+ "5. DUR\n"
					+"X Önceki Menüye Dönmek Icin");
		
	}
	

	public void gosterge(){
		System.out.println("Hiz : "+getHiz()
						+"\nVites : "+getVites());		
		
	}
	
	public void pedalAt() {
		setHiz(getHiz()+(getVites()*birim));
		
		
	}
	

}
