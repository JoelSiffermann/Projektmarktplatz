package de.hdm.itprojekt.projektmarktplatz.shared.bo;

public class Person extends Organisationseinheit {

	private static final long serialVersionUID = 1L;
	private String vorname; 
	private String beruf;
	private float erfahrung;
	

	public String getVorname(){
		
		return vorname;
	}
	
	public String getBeruf(){
		
		return beruf;
	}
	
	public float getErfahrung(){
		
		return erfahrung;
	}
	
	public void setVorname(String string){
		
		vorname=string;
	}
	public void setBeruf(String string){
		
		beruf=string;
	}
	public void setErfahrung(float Float){
		
		erfahrung=Float;
	}
}
