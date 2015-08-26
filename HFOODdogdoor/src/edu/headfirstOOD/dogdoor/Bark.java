package edu.headfirstOOD.dogdoor;

public class Bark {
	private String dogName;
	private String barkSound;
	
	public Bark(String dogName, String barkSound) {
		super();
		this.dogName = dogName;
		this.barkSound = barkSound;
	}
	
	public boolean equals(Bark otherBark){
		if (otherBark.dogName == this.dogName) return true;
		else return false;
	}

	public String getDogName() {
		return dogName;
	}

	public String getBarkSound() {
		return barkSound;
	}

}
