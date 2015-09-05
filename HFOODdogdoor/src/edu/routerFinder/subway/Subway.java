package edu.routerFinder.subway;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Subway {
	private Set<Station> stations;
	private List<Connection> connections;
	
	public Subway(){
		this.stations = new HashSet<>();
		this.connections = new ArrayList<>();
	}

	public boolean addStation(Station s1) {
		return stations.add(s1);
	}

	public Set<Station> getStations() {
		return stations;
	}
	
	public void addConnection(Connection conn){
		connections.add(conn);
	}
	
	public boolean isConnected(Station s1, Station s2){
		if (!stations.contains(s1) || !stations.contains(s2)) return false;
		
		return false;
	}

}
