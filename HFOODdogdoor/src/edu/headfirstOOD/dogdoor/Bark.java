package edu.headfirstOOD.dogdoor;

public class Bark {
	private String barkSound;
	
	public Bark(String barkSound) {
		super();
		this.barkSound = barkSound;
	}
	
	public boolean equals(Bark otherBark){
		if (otherBark.barkSound.equals(this.barkSound)) return true;
		else return false;
	}


	public String getBarkSound() {
		return barkSound;
	}

}
