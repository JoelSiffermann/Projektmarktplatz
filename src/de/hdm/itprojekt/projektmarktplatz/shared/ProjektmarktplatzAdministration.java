package de.hdm.itprojekt.projektmarktplatz.shared;

import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

//import de.hdm.itprojekt.projektmarktplatz.server.Partnerprofil;
//import de.hdm.itprojekt.projektmarktplatz.server.Beteiligung;
import de.hdm.itprojekt.projektmarktplatz.shared.bo.*;



@RemoteServiceRelativePath("projektmarktplatz")

public interface ProjektmarktplatzAdministration  extends RemoteService {
	
	 public void init() throws IllegalArgumentException;

//Beteiligung
	 
	 Beteiligung erstelleProjektbeteiligung(String email, int personentage, String bewertung, int projektid,
			Date startdatum, Date enddatum) throws IllegalArgumentException;
	
	public void speichernProjektbeteiligung(Beteiligung prbt) throws IllegalArgumentException;
	
	public void loeschenProjektbeteiligung(Beteiligung prbt) throws IllegalArgumentException;
	
//Partnerprofil
	Partnerprofil erstellePartnerprofil(String name, String inhalt,
			  Date aenderungsdatum, Date erstelldatum) throws IllegalArgumentException;
	
	
	
	public void speichernPartnerprofil(Partnerprofil prtr) throws IllegalArgumentException;
	
	public void loeschenPartnerprofil(Partnerprofil prtr) throws IllegalArgumentException;
	 
	//getBewertungByBewerbung()
	
	 public Vector<Bewertung> getBewertungByBewerbung() throws IllegalArgumentException;
	 
	 //getBewertungByAusschreibung()
	 
	 
	
}
