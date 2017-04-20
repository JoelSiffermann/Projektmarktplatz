package de.hdm.itprojekt.projektmarktplatz.shared.bo;

public class Team extends Organisationseinheit{

	private static final long serialVersionUID = 1L;
	
	private int groesse;
	private String arbeitsfeld;
	
	public Team (int groesse, String arbeitsfeld){
		this.groesse = groesse;
		this.arbeitsfeld = arbeitsfeld;
	}
	public Team (){
		
	}
	public int getGroesse(){
		return groesse;
	}
	public String getArbeitsfeld(){
		return arbeitsfeld;
	}
	public void setGroesse(int integer){
		groesse = integer;
	}
	public void setArbeitsfeld(String string){
		arbeitsfeld = string;
	}
	
}
