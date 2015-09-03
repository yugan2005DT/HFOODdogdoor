package edu.headfirstOOD.boardGame;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Before;
import org.junit.Test;

public class UnitTest {
	
	private Unit testUnitA;

	@Before
	public void init() {
		testUnitA = new Unit();
	}
	
	@Test
	public void setAndGetTypeProperty(){
		testUnitA.setType("infantry");
		assertThat(testUnitA.getType(), equalTo("infantry"));
	}
	
	@Test (expected=NullTypePropertyException.class)
	public void getNullTypeProperty(){
		testUnitA.getType();
	}
	
	@Test
	public void setAndGetMapProperty(){
		testUnitA.setProperty("hitPoints", 25);
		assertThat(testUnitA.getProperty("hitPoints"), equalTo(25));
	}
	
	@Test
	public void getNullMapProperty(){
		assertThat(testUnitA.getProperty("strength"), equalTo("[no value]"));
	}
	
	@Test
	public void parameterizedContructor(){
		Unit testUnitB = new Unit("carrier", 1, "LiaoNin");
		assertThat(testUnitB.getType(), equalTo("carrier"));
		assertThat(testUnitB.getId(), equalTo(1));
		assertThat(testUnitB.getName(), equalTo("LiaoNin"));
		
	}
	
	@Test
	public void updateMapProperty(){
		testUnitA.setProperty("hitPoints", 25);
		testUnitA.setProperty("hitPoint", 15);
		assertThat(testUnitA.getProperty("hitPoints"), equalTo(15));
	}

}