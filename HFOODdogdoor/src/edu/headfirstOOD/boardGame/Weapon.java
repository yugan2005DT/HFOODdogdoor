package edu.headfirstOOD.boardGame;

public class Weapon {
	private String weaponType;
	private int id;
	
	public Weapon(){
		
	}
	
	public Weapon(String weaponType){
		this();
		this.weaponType=weaponType;
	}
	public Weapon(String weaponType, int id) {
		super();
		this.weaponType = weaponType;
		this.id = id;
	}
	

}
