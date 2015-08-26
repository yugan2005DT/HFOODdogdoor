package edu.headfirstOOD.dogdoor;

public class DogDoorSimulator {

	public static void main(String[] args) {
		
		Door door = new Door();
		door.saveAllowedBark(new Bark("rowlf"));
		door.saveAllowedBark(new Bark("rooowlf"));
		door.saveAllowedBark(new Bark("rawlf"));
		door.saveAllowedBark(new Bark("woof"));
		
		BarkRecognizer recognizer = new BarkRecognizer(door);
		Remote remote = new Remote(door);
		
		System.out.println("Bruce starts barking");
		recognizer.recognize(new Bark("rowlf"));
		
		System.out.println("\nBruce has gone outside...");
		
		try {
			Thread.sleep(10000);
		}
		catch (InterruptedException e){
			
		}
		
		System.out.println("\nBruce's all done...");
		System.out.println("...but he's stuck outside");
		
		Bark smallDogBark = new Bark("yip");
		System.out.println("A small dog starts barking");
		recognizer.recognize(smallDogBark);
		
		try {
			Thread.sleep(5000);
			
		}
		catch (InterruptedException e){
			
		}
		
		System.out.println("Bruce starts barking...");
		recognizer.recognize(new Bark("rooowlf"));
		
		System.out.println("\nBruce's back inside...");
		
//		System.out.println("\n I am going to press the remote button for fun...");
//		remote.buttonPressed();

	}

}
