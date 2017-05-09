package de.hdm.itprojekt.projektmarktplatz.shared.bo;

public class Unternehmen extends Organisationseinheit{
	
	private static final long serialVersionUID = 1L;

	private String geschaeftsform; 
	private String geschaeftsfeld;
	

	
	public String getGeschaeftsform(){
		return geschaeftsform;
	}
	public String getGeschaeftsfeld(){
		return geschaeftsfeld;
	}
	public void setGeschaeftsform(String string){
		geschaeftsform = string;
	}
	public void setGeschaeftsfeld(String string){
		geschaeftsfeld = string;
	}
	
}
