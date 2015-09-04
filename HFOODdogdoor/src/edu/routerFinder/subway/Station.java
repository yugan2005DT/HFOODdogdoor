package edu.routerFinder.subway;

public class Station {
	private String name;

	public Station(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public boolean equals(Station station){
		if (name.toLowerCase().equals(station.getName().toLowerCase())) return true;
		return false;
	}
	
	public int hashCode(){
		return name.toLowerCase().hashCode();
	}

}
