package edu.headfirstOOD.boardGame;

import java.util.LinkedList;
import java.util.List;

public class Tile {
	
	private List<Unit> units;
	
	public Tile(){
		units = new LinkedList<Unit>();
	}

	public void addUnit(Unit unit) {
		units.add(unit);
		
	}

	public List<Unit> getUnits() {
		return units;
	}

	public void removeUnits() {
		units = null;
	}
	
	public void removeUnit(Unit unit){
		units.remove(unit);
	}

	public Terrain getTerrain() {
		// TODO Auto-generated method stub
		return null;
	}

}
