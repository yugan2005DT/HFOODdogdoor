package edu.routerFinder.subway;

public class StationNotInConnectionException extends RuntimeException {
	
	public StationNotInConnectionException(String message){
		super(message);
	}

}
