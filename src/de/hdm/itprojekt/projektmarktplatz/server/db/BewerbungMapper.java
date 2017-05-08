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


public class BewerbungMapper {

	public static BewerbungMapper bewerbungMapper() {
		// TODO Auto-generated method stub
		return null;
	}
	


	public Bewerbung einfuegen(Bewerbung b) {
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
				b.setId(rs.getInt("") + 1);

				stmt = con.createStatement();

				// Jetzt erst erfolgt die tatsächliche Einfügeoperation
				stmt.executeUpdate("");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return b;
	}

	public Bewerbung speichern(Bewerbung b) {
		Connection con = DBConnection.connection();

		try {
			Statement stmt = con.createStatement();

			stmt.executeUpdate("");

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return b;
	}
	
	public void loeschen(Bewerbung b) {
	    Connection con = DBConnection.connection();

	    try {
	      Statement stmt = con.createStatement();

	      stmt.executeUpdate("");
	    }
	    catch (SQLException e) {
	      e.printStackTrace();
	    }
	  }

	public Bewerbung getBewerbungByID(int id) {
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
	        Bewerbung b= new Bewerbung();
	        //TODO: b.attribute hinzufuegen

	        return b;
	      }
	    }
	    catch (SQLException e) {
	      e.printStackTrace();
	      return null;
	    }

	    return null;
	  }


public Bewerbung getBewerbungByAusschreibung(Ausschreibung a) {
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
        Bewerbung b= new Bewerbung();
        //TODO: b.attribute hinzufuegen

        return b;
      }
    }
    catch (SQLException e) {
      e.printStackTrace();
      return null;
    }

    return null;
  }


public Bewerbung getBewerbungByPartnerprofil(Partnerprofil p) {
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
        Bewerbung b= new Bewerbung();
        //TODO: b.attribute hinzufuegen

        return b;
      }
    }
    catch (SQLException e) {
      e.printStackTrace();
      return null;
    }

    return null;
  }


public Vector<Bewerbung> findAll() {
    Connection con = DBConnection.connection();
    // Ergebnisvektor vorbereiten
    Vector<Bewerbung> result = new Vector<Bewerbung>();

    try {
      Statement stmt = con.createStatement();

      ResultSet rs = stmt.executeQuery("");

      // Für jeden Eintrag im Suchergebnis wird nun ein Customer-Objekt
      // erstellt.
      while (rs.next()) {
        Bewerbung b = new Bewerbung();
      

        // Hinzufügen des neuen Objekts zum Ergebnisvektor
        result.addElement(b);
      }
    }
    catch (SQLException e) {
      e.printStackTrace();
    }

    // Ergebnisvektor zurückgeben
    return result;
}

}

