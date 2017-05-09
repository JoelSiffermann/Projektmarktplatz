package de.hdm.itprojekt.projektmarktplatz.shared;

import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;

import com.google.gwt.user.client.rpc.AsyncCallback;

import de.hdm.itprojekt.projektmarktplatz.shared.bo.*;




public interface ProjektmarktplatzAdministrationAsync {
	
	 void init(AsyncCallback<Void> callback);

	//Projektbeteiligung
	 void erstelleProjektbeteiligung(String email, int personentage, String bewertung, int projektid, Date startdatum,
			Date enddatum, AsyncCallback<Beteiligung> callback);

	void speichernProjektbeteiligung(Beteiligung prbt, AsyncCallback<Void> callback); 
	
	void loeschenProjektbeteiligung(Beteiligung prbt, AsyncCallback<Void> callback);
	
 //Partnerprofil
	
	void erstellePartnerprofil(String name, String inhalt, Date aenderungsdatum, Date erstelldatum, AsyncCallback<Partnerprofil> callback);
	
	void speichernPartnerprofil(Partnerprofil prtr, AsyncCallback<Void> callback);
	
	void loeschenPartnerprofil(Partnerprofil prtr, AsyncCallback<Void> callback);
	

	
	void getBewertungByBewerbung(AsyncCallback<Vector<Bewertung>> callback);

}
