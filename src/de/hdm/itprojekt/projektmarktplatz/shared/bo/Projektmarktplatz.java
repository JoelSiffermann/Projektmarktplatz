package de.hdm.itprojekt.projektmarktplatz.shared.bo;

public class Projektmarktplatz extends BusinessObjekt{
	
	private static final long serialVersionUID = 1L;

	private String bezeichnung;
	
	public Projektmarktplatz (String bezeichnung){
		this.bezeichnung = bezeichnung;
	}
	public String getBezeichnung (){
		return bezeichnung;
	}
	public void setBezeichnung (String string){
		bezeichnung = string;
	}
}
