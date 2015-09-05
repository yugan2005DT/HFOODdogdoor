package edu.routerFinder.subway;

public class Station {
	private String name;

	public Station(String name) throws StationNameEmptyException, StationNameNullException {
		if (name==null) throw new StationNameNullException("Station name cannot be null");
		if (name=="") throw new StationNameEmptyException("Station name cannot be empty string");
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws StationNameEmptyException {
		if (name.equals("")) throw new StationNameEmptyException("Can not set station's name to empty");
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
