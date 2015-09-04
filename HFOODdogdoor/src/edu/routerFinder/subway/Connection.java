package edu.routerFinder.subway;

public class Connection {
	private Station s1, s2;

	public Connection(Station s1, Station s2) {
		this.s1=s1;
		this.s2=s2;
	}
	
	public Station getStation(){
		return s1;
	}
	
	public Station getOtherStation(Station station) throws StationNotInConnectionException {
		if (station!=s1 && station!=s2){
			throw new StationNotInConnectionException("Station given is in the Connection");
		}
		if (station == s1) return s2;
		return s1;
	}
	
	public boolean equals(Connection c){
		Station station = c.getStation();
		if (s1!=station){
			if (s1!=c.getOtherStation(station)) return false;
			else if (s2 !=station) return false;
		}
		else if (s2!=c.getOtherStation(station)) return false;
		return true;
	}

}
