package edu.headfirstOOD.dogdoor;

import java.util.ArrayList;
import java.util.List;

public class Door {
	
	private boolean isOpen;
	private List<Bark> allowedBarks;
	
	public Door(){
		isOpen = false;
		allowedBarks = new ArrayList<>();		
	}
	
	public void open(){
		isOpen = true;
		System.out.println("Door opened...");
	}
	
	public void close(){
		isOpen = false;
		System.out.println("Door closed...");
	}
	
	public boolean isOpen() {
		return isOpen;
	}

	public List<Bark> getAllowedBarks(){
		System.out.println("Allowed barks for this door are:");
		int i=1;
		for (Bark bark : allowedBarks){
			System.out.println(i+": "+bark.getBarkSound());
			i++;
		}
		return allowedBarks;
		
	}
	
	public void saveAllowedBarks(List<Bark> addBarks){
		allowedBarks.addAll(allowedBarks);
		System.out.println("List of allowed barks have been added to this door...");
	}
	
	public void saveAllowedBark(Bark addBark){
		allowedBarks.add(addBark);
		System.out.println("The allowed bark has been added to this door...");
	}
	

}
