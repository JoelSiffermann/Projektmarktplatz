package de.hdm.itprojekt.projektmarktplatz.server;

import java.util.ArrayList;
import java.util.Vector;

import de.hdm.itprojekt.projektmarktplatz.server.db.*;
import de.hdm.itprojekt.projektmarktplatz.shared.*;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
@SuppressWarnings("serial")

	/** in Anlehnung an Bankprojekt
	 * Autor Peter Thies & Christian Rathke
	 */
	/**Das RemoteServiceServlet ist eine Subklasse eines gewöhnlichen HTTP-Servlet und kümmert sich später automatisch 
	 * um das Serialisieren und Deserialisieren der Parameter und Rückgabewerte. Zu beachten ist, 
	 * dass sowohl die Methodenparameter als auch der Rückgabewert serialisierbar sein muss.
	 * @throws IllegalArgumentException
	 */

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
	

	
	
}
