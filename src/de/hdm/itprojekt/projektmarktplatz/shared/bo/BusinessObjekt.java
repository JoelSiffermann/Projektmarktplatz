package de.hdm.itprojekt.projektmarktplatz.shared.bo;

public class BusinessObjekt {

	private static final long serialVersionUID = 1L;

	private int id;
	
	public BusinessObjekt (int id){
		this.id = id;
	}
	public boolean equals(Object obj) {
		  return (this == obj);
		}
	//nochmals überprüfen !
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
