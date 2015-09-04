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

	public void add(Station s1) {
		stations.add(s1);
	}

	public Set<Station> getStations() {
		return stations;
	}

}
