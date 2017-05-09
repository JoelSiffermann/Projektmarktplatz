package de.hdm.itprojekt.projektmarktplatz.shared;

import java.util.ArrayList;
import java.util.Vector;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import de.hdm.itprojekt.projektmarktplatz.client.Projektmarktplatz;
import de.hdm.itprojekt.projektmarktplatz.shared.bo.*;

@RemoteServiceRelativePath("projektmarktplatz")

public interface ProjektmarktplatzAdministration  extends RemoteService {
	
	 public void init() throws IllegalArgumentException;
	 
	 public Projektmarktplatz erstelleProjektmarktplatz (String bezeichnung) throws IllegalArgumentException;
	 
	 
	 

}
