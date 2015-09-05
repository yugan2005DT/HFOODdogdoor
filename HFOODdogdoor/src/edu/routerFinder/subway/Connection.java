package edu.routerFinder.subway;

public class Connection {
	private Station s1, s2;
	private String lineName;
	
	public Connection(Station s1, Station s2) throws ConnectionStationNullException, ConnectionStationTheSameException {
		if (s1 == null || s2 == null) throw new ConnectionStationNullException("Station in a Connection cannot be null");
		if (s1.equals(s2)) throw new ConnectionStationTheSameException("The two stations cannot be the same");
		this.s1=s1;
		this.s2=s2;
	}
	
	public Connection(Station s1, Station s2, String lineName){
		this(s1, s2);
		this.lineName=lineName;
	}
	
	public Station getStation(){
		return s1;
	}
	
	public void setStation(Station station1, Station station2) throws ConnectionStationNullException, ConnectionStationTheSameException {
		if (station1==null || station2==null) throw new ConnectionStationNullException("In a connection cannot set a null Station");
		if (station1.equals(station2)) throw new ConnectionStationTheSameException("The two stations cannot be the same");
		s1 = station1;
		s2 = station2;
		

		
	}
	
	public Station getOtherStation(Station station) throws StationNotInConnectionException {
		if (station!=s1 && station!=s2){
			throw new StationNotInConnectionException("Station given is in the Connection");
		}
		if (station == s1) return s2;
		return s1;
	}
	
	public String getLineName() {
		return lineName;
	}

	public void setLineName(String lineName) {
		this.lineName = lineName;
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
