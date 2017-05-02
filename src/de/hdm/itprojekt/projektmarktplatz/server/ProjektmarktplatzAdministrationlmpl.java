package de.hdm.itprojekt.projektmarktplatz.server;

import java.util.ArrayList;
import java.util.Vector;

import de.hdm.itprojekt.projektmarktplatz.server.db.*;
import de.hdm.itprojekt.projektmarktplatz.shared.*;
import de.hdm.itprojekt.projektmarktplatz.shared.bo.*;
import de.hdm.itprojekt.projektmarktplatz.shared.ProjektmarktplatzAdministration.*;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
@SuppressWarnings("serial")

	/** in Anlehnung an Bankprojekt
	 * Autor Peter Thies
	 */
	/**Das RemoteServiceServlet ist eine Subklasse eines gewöhnlichen HTTP-Servlet und kümmert sich später automatisch 
	 * um das Serialisieren und Deserialisieren der Parameter und Rückgabewerte. Zu beachten ist, 
	 * dass sowohl die Methodenparameter als auch der Rückgabewert serialisierbar sein muss.
	 * @throws IllegalArgumentException
	 */

public class ProjektmarktplatzAdministrationlmpl extends RemoteServiceServlet
	implements ProjektmarktplatzAdministration
{
	
	public static final int = 
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
	

	
	  public ProjektmarktplatzAdministrationlmpl() throws IllegalArgumentException {
		  
		  }
	

	
	
}
