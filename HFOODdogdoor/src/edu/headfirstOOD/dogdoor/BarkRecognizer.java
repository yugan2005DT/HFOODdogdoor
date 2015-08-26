package edu.headfirstOOD.dogdoor;

import java.util.Timer;
import java.util.TimerTask;

public class BarkRecognizer {
	private Door door;
	
	public BarkRecognizer(Door door) {
		super();
		this.door = door;
	}

	public void recognize(Bark bark){
		for (Bark allowedBark:door.getAllowedBarks()) {
			if (bark.equals(allowedBark)){
				System.out.println("bark recognized as the allowed bark");
				if (!door.isOpen()) {
					System.out.println("Door is closed now, Opening...");
					door.open();
					Timer timer = new Timer();
					long delay = 3000;
					timer.schedule(new TimerTask() {
						
						@Override
						public void run() {
							if (door.isOpen()){
								System.out.println("Automatically closing the door from barkrecognizer...");
								door.close();
								timer.cancel();
							}
							else {
								System.out.println("The door somehow is already closed, barkrecognizer needs do nothing");
							}
							
						}
					}, delay);
				}
				else {
					System.out.println("The door somehow is already opened, barkrecognizer needs do nothing");
				}
				return;
			}
		}
		
		System.out.println("The bark cannot be identified, barkrecognizer will do nothing");
		return;
	}

}
