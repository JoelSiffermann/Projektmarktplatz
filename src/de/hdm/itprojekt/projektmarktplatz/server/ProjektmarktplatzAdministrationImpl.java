package de.hdm.itprojekt.projektmarktplatz.server;


import java.util.ArrayList;
import java.util.Vector;

import de.hdm.itprojekt.projektmarktplatz.client.Projektmarktplatz;
import de.hdm.itprojekt.projektmarktplatz.server.db.*;
import de.hdm.itprojekt.projektmarktplatz.shared.*;

import de.hdm.itprojekt.projektmarktplatz.shared.bo.Beteiligung;
import de.hdm.itprojekt.projektmarktplatz.shared.bo.Partnerprofil;


import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import java.util.Date;

	/** in Anlehnung an Bankprojekt
	 * Autor Peter Thies & Christian Rathke
	 */
	/**Das RemoteServiceServlet ist eine Subklasse eines gewöhnlichen HTTP-Servlet und kümmert sich später automatisch 
	 * um das Serialisieren und Deserialisieren der Parameter und Rückgabewerte. Zu beachten ist, 
	 * dass sowohl die Methodenparameter als auch der Rückgabewert serialisierbar sein muss.
	 * @throws IllegalArgumentException
	 */
     @SuppressWarnings("serial")
public class ProjektmarktplatzAdministrationImpl extends RemoteServiceServlet
	implements ProjektmarktplatzAdministration
{
	
	public ProjektmarktplatzAdministrationImpl() throws IllegalArgumentException {
	  }
	
	public void init() throws IllegalArgumentException {
		
		 	this.eMapper = EigenschaftMapper.eigenschaftMapper();
		 	
		    this.pmMapper = ProjektmarktplatzMapper.projektmarktplatzMapper();
		    
		    this.bMapper = BewertungMapper.bewertungMapper();
		    
		    this.bwMapper = BewerbungMapper.bewerbungMapper();
		    
		    this.aMapper = AusschreibungMapper.ausschreibungMapper();
		    
		    this.prjMapper = ProjektMapper.projektMapper();
		    
		    this.prbtMapper = ProjektbeteilitungMapper.projektbeteilitungMapper();
		    
		    this.orgMapper = OrganisationseinheitMapper.organisationseinheitMapper();
		    
		    this.prtrMapper = PartnerprofilMapper.partnerprofilMapper();
		  
		  }
	
	
	
	//MUSS ÜBERARBEITET WERDEN!
	public static final int DEFAULT = 0;
	
	/*Referenz auf Eigenschaft*/
	private EigenschaftMapper eMapper = null;
	
	/*Referenz auf Projektmarktplatz*/
	private ProjektmarktplatzMapper pmMapper = null;
	
	/*Referenz auf Bewertung*/
	private BewertungMapper bMapper = null;
	
	/*Referenz auf Bewerbung*/
	private BewerbungMapper bwMapper = null;
	
	/*Referenz auf Ausschreibung*/
	private AusschreibungMapper aMapper = null;
	
	/*Referenz auf Projekt*/
	private ProjektMapper prjMapper = null;
	
	/*Referenz auf Projektbeteiligung*/
	private ProjektbeteilitungMapper prbtMapper = null;
	
	
	/*Referenz auf Organisationseinheit*/
	private OrganisationseinheitMapper orgMapper = null;
	
	/*Referenz auf Partnerprofil*/
	private PartnerprofilMapper prtrMapper = null;
	

	
	@Override
	public Beteiligung erstelleProjektbeteiligung(String email, int personentage, String bewertung, 
			 int projektid, Date startdatum, Date enddatum) throws IllegalArgumentException{
		Beteiligung prbt = new Beteiligung();
	     
//	     prbt.setEmail(email);
//	     prbt.setPersonentage(personentage);
//	     prbt.setBewertung(bewertung);
//	     prbt.setProjektid(projektid);
		
	     prbt.setStart(startdatum);
	     prbt.setEnde(enddatum);
	     

	     /*
	      * Setzen einer vorläufigen Kundennr. Der insert-Aufruf liefert dann ein
	      * Objekt, dessen Nummer mit der Datenbank konsistent ist.
	      */
	     prbt.setId(1);

	     // Objekt in der DB speichern.
	     return this.prbtMapper.einfuegen(prbt);
	}


	public Projektmarktplatz erstelleProjektmarktplatz (String bezeichnung) throws IllegalArgumentException {
	de.hdm.itprojekt.projektmarktplatz.shared.bo.Projektmarktplatz c = new de.hdm.itprojekt.projektmarktplatz.shared.bo.Projektmarktplatz(bezeichnung);
	c.setBezeichnung("test");
	return null;

	
	public void speichernProjektbeteiligung(Beteiligung b) throws IllegalArgumentException {
    prbtMapper.speichern(b);
	}
	
	
	public void loeschenProjektbeteiligung(Beteiligung b) throws IllegalArgumentException {
	    this.prbtMapper.loeschen(b);
	  }
	
	
	
	@Override
	public Partnerprofil erstellePartnerprofil(String name, String inhalt,
			  Date aenderungsdatum, Date erstelldatum) throws IllegalArgumentException{
		Partnerprofil prtr = new Partnerprofil();
	     

		// prtr.setName(name);
		 
	     prtr.setAenderungsdatum(aenderungsdatum);
	     prtr.setErstelldatum(erstelldatum);
	     

	     /*
	      * Setzen einer vorläufigen Kundennr. Der insert-Aufruf liefert dann ein
	      * Objekt, dessen Nummer mit der Datenbank konsistent ist.
	      */
	     prtr.setId(1);

	     // Objekt in der DB speichern.
	     return this.prtrMapper.einfuegen(prtr);
	}

	
	public void speichernPartnerprofil(Partnerprofil p) throws IllegalArgumentException {
    prtrMapper.speichern(p);
	}
	
	
	public void loeschenPartnerprofil(Partnerprofil p) throws IllegalArgumentException {
	    this.prtrMapper.loeschen(p);
	  }
	
	
	public ArrayList<Bewertung> getBewertungByBewerbung() throws IllegalArgumentException {
	    
		return null; 
	  }
	

}
}