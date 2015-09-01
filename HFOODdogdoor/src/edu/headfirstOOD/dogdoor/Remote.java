package edu.headfirstOOD.dogdoor;

import java.util.Timer;
import java.util.TimerTask;

public class Remote {
	Door door;
	
	public Remote(Door door){
		this.door=door;
	}
	
	public void buttonPressed(){
		System.out.println("Remote button pressed...");
		if (door.isOpen()) {
			System.out.println("Door is open before button pressed, now closing...");
			door.close();
		}
		else {
			System.out.println("Door is closed before button pressed, now opening...");
			door.open();
			Timer timer = new Timer();
			long delay = 5000;
			timer.schedule(new TimerTask() {
				@Override
				public void run() {
					if (door.isOpen()){
						System.out.println("Door is still open after "+delay/1000+" seconds. Autoclosing...");
						door.close();
					}
					timer.cancel();
				}
			}, delay);
		}		
	}
}
