package de.hdm.itprojekt.projektmarktplatz.server.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import de.hdm.itprojekt.projektmarktplatz.shared.bo.Ausschreibung;
import de.hdm.itprojekt.projektmarktplatz.shared.bo.Bewerbung;
import de.hdm.itprojekt.projektmarktplatz.shared.bo.Partnerprofil;
import de.hdm.itprojekt.projektmarktplatz.shared.bo.Projekt;
import de.hdm.thies.bankProjekt.server.db.DBConnection;
import de.hdm.thies.bankProjekt.shared.bo.Customer;

public class AusschreibungMapper {

	public static AusschreibungMapper ausschreibungMapper() {
		// TODO Auto-generated method stub
		return null;
	}
	


	public Ausschreibung einfuegen(Ausschreibung a) {
		Connection con = DBConnection.connection();

		try {
			Statement stmt = con.createStatement();

			/*
			 * Zunächst schauen wir nach, welches der momentan höchste
			 * Primärschlüsselwert ist.
			 */
			ResultSet rs = stmt.executeQuery("");

			// Wenn wir etwas zurückerhalten, kann dies nur einzeilig sein
			if (rs.next()) {
				/*
				 * c erhält den bisher maximalen, nun um 1 inkrementierten
				 * Primärschlüssel.
				 */
				a.setId(rs.getInt("") + 1);

				stmt = con.createStatement();

				// Jetzt erst erfolgt die tatsächliche Einfügeoperation
				stmt.executeUpdate("");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return a;
	}

	public Ausschreibung speichern(Ausschreibung a) {
		Connection con = DBConnection.connection();

		try {
			Statement stmt = con.createStatement();

			stmt.executeUpdate("");

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return a;
	}
	
	public void loeschen(Ausschreibung a) {
	    Connection con = DBConnection.connection();

	    try {
	      Statement stmt = con.createStatement();

	      stmt.executeUpdate("");
	    }
	    catch (SQLException e) {
	      e.printStackTrace();
	    }
	  }
	


public Ausschreibung getAusschreibungByPartnerprofil(Partnerprofil p) {
    // DB-Verbindung holen
    Connection con = DBConnection.connection();

    try {
      // Leeres SQL-Statement (JDBC) anlegen
      Statement stmt = con.createStatement();

      // Statement ausfüllen und als Query an die DB schicken
      ResultSet rs = stmt
          .executeQuery("");

      /*
       * Da id Primärschlüssel ist, kann max. nur ein Tupel zurückgegeben
       * werden. Prüfe, ob ein Ergebnis vorliegt.
       */
      if (rs.next()) {
        // Ergebnis-Tupel in Objekt umwandeln
        Ausschreibung a = new Ausschreibung();
        //TODO: b.attribute hinzufuegen

        return a;
      }
    }
    catch (SQLException e) {
      e.printStackTrace();
      return null;
    }

    return null;
  }



public Ausschreibung getAusschreibungByBewerbung(Bewerbung b) {
    // DB-Verbindung holen
    Connection con = DBConnection.connection();

    try {
      // Leeres SQL-Statement (JDBC) anlegen
      Statement stmt = con.createStatement();

      // Statement ausfüllen und als Query an die DB schicken
      ResultSet rs = stmt
          .executeQuery("");

      /*
       * Da id Primärschlüssel ist, kann max. nur ein Tupel zurückgegeben
       * werden. Prüfe, ob ein Ergebnis vorliegt.
       */
      if (rs.next()) {
        // Ergebnis-Tupel in Objekt umwandeln
        Ausschreibung a = new Ausschreibung();
        //TODO: b.attribute hinzufuegen

        return a;
      }
    }
    catch (SQLException e) {
      e.printStackTrace();
      return null;
    }

    return null;
  }



public Vector<Ausschreibung> findByLastName(String name) {
    Connection con = DBConnection.connection();
    Vector<Ausschreibung> result = new Vector<Ausschreibung>();

    try {
      Statement stmt = con.createStatement();

      ResultSet rs = stmt.executeQuery("");

      // Für jeden Eintrag im Suchergebnis wird nun ein Customer-Objekt
      // erstellt.
      while (rs.next()) {
        Ausschreibung a = new Ausschreibung();
        

        // Hinzufügen des neuen Objekts zum Ergebnisvektor
        result.addElement(a);
      }
    }
    catch (SQLException e) {
      e.printStackTrace();
    }

    // Ergebnisvektor zurückgeben
    return result;
  }

}



