package edu.headfirstOOD.boardGame;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class UnitTest {
	
	private Unit testUnitA;

	@Before
	public void init() {
		testUnitA = new Unit();
	}
	
	@Test
	public void setAndGetTypeProperty() throws NullTypePropertyException{
		testUnitA.setType("infantry");
		assertThat(testUnitA.getType(), equalTo("infantry"));
	}
	
	@Test (expected=NullTypePropertyException.class)
	public void getNullTypeProperty() throws NullTypePropertyException{
		testUnitA.getType();
	}
	
	@Test
	public void setAndGetMapProperty(){
		testUnitA.setProperty("hitPoints", 25);
		assertThat(testUnitA.getProperty("hitPoints"), equalTo(25));
	}
	
	@Test(expected=NullMapPropertyException.class)
	public void getNullMapProperty(){
//		assertThat(testUnitA.getProperty("strength"), equalTo("[no value]"));
		testUnitA.getProperty("strength");
	}
	
	@Test
	public void parameterizedContructor() throws NullTypePropertyException{
		Unit testUnitB = new Unit("carrier", 1, "LiaoNin");
		assertThat(testUnitB.getType(), equalTo("carrier"));
		assertThat(testUnitB.getId(), equalTo(1));
		assertThat(testUnitB.getName(), equalTo("LiaoNin"));
		
	}
	
	@Test
	public void updateMapProperty(){
		testUnitA.setProperty("hitPoints", 25);
		testUnitA.setProperty("hitPoints", 15);
		assertThat(testUnitA.getProperty("hitPoints"), equalTo(15));
	}
	
	@Test
	public void setAndGetWeaponProperty(){
		List<Weapon> weapons = new ArrayList<>();
		Weapon riffle = new Weapon("riffle");
		Weapon knife = new Weapon("knife", 2);
		weapons.add(riffle);
		weapons.add(knife);
		testUnitA.setWeapon(weapons);
		List<Weapon> weaponsTheSame = new ArrayList<>();
		weaponsTheSame.add(riffle);
		weaponsTheSame.add(knife);
		assertThat(testUnitA.getWeapon(), equalTo(weaponsTheSame));
	}

}
