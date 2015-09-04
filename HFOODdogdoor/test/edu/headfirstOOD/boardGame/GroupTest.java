package edu.headfirstOOD.boardGame;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class GroupTest {
	
	private Unit unit1, unit2, unit3, unit4;
	private Group group1;
	
	@Before
	public void init(){
		unit1 = new Unit("Infantry", 1, "army1");
		unit2 = new Unit("Infantry", 2, "army2");
		unit3 = new Unit("Infantry", 2, "army3");
		unit4 = new Unit("Airforce");
		group1 = new Group();
	}

	@Test
	public void addUnitToGroup() {
		group1.addUnit(unit1);
		List<Unit> units = new ArrayList<>();
		units.add(unit2);
		units.add(unit3);
		group1.addUnits(units);
		
		List<Unit> group1Units = new ArrayList<>();
		group1Units.add(unit1);
		group1Units.add(unit2);
		group1Units.add(unit3);
		
		assertThat(group1.getUnits(), equalTo(group1Units));
		
	}

}
