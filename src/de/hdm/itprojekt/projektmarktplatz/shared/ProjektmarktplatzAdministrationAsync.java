package de.hdm.itprojekt.projektmarktplatz.shared;

import java.util.ArrayList;
import java.util.Vector;

import com.google.gwt.user.client.rpc.AsyncCallback;

import de.hdm.itprojekt.projektmarktplatz.client.Projektmarktplatz;
import de.hdm.itprojekt.projektmarktplatz.shared.bo.*;

public interface ProjektmarktplatzAdministrationAsync {
	
	 void init(AsyncCallback<Void> callback);

	void erstelleProjektmarktplatz(String bezeichnung, AsyncCallback<Projektmarktplatz> callback);

	
}
