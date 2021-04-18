package com.bilgeadam.bisiklet;

public class DagBisikleti extends Bisiklet{
	
	

	public DagBisikleti(String marka,String model) {
		this.setMarka(marka);
		this.setModel(model);
		setBirim(1);
		
	}

//	@Override
//	public void pedalAt() {
//		setHiz(getHiz()+(getVites()*birim));
//		
//		
//	}
}
