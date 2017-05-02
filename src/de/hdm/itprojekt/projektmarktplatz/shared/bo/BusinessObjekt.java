package de.hdm.itprojekt.projektmarktplatz.shared.bo;
import java.io.Serializable;

public class BusinessObjekt implements Serializable{
	

	private static final long serialVersionUID = 1L;

	private int id = 0;
	
	public boolean equals(Object obj) {
		  return (this == obj);
		}
	//nochmals überprüfen !!!!!!
	public String toString(){
		return this.getClass().getName()+"#"+this.id;
		
	}
	public int getId(){
		return id;
	}
	public void setId(int id){
		id = id;
	}
	
	
}
