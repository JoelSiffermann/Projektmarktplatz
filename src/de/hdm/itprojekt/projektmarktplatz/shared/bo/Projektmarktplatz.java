package de.hdm.itprojekt.projektmarktplatz.shared.bo;

<<<<<<< HEAD
public class Projektmarktplatz extends BusinessObjekt{
=======
public class Projektmarktplatz extends BusinessObjekt {
>>>>>>> refs/heads/Master
	
	private static final long serialVersionUID = 1L;

	private String bezeichnung = "";
	
	public Projektmarktplatz (){

	} 
	public Projektmarktplatz (String bezeichnung){
		this.bezeichnung = bezeichnung;
	}
	public String getBezeichnung (){
		return bezeichnung;
	}
	public void setBezeichnung (String string){
		this.bezeichnung = string;
	}
}
