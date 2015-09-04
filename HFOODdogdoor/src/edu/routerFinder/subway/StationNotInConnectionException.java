package edu.routerFinder.subway;

public class StationNotInConnectionException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StationNotInConnectionException(String message){
		super(message);
	}

}
