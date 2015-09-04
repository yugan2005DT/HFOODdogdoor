package edu.headfirstOOD.boardGame;

import java.util.ArrayList;
import java.util.List;

public class Group {
	private List<Unit> units;
	
	public Group(){
		this.units = new ArrayList<Unit>();
	}

	public void addUnit(Unit unit1) {
		units.add(unit1);
		
	}

	public void addUnits(List<Unit> units) {
		this.units.addAll(units);
		
	}

	public List<Unit> getUnits() {
		return units;
	}

}
