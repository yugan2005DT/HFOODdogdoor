package edu.routerFinder.subway;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class StationTest {
	private Station s1, s2;
	
	@Before
	public void init(){
		s1 = new Station("MTV");
		s2 = new Station("SFO");
	}

	@Test
	public void twoStationBeEqualWithTheSameName() {
		s2.setName(s1.getName());
		assertTrue(s1.equals(s2));
	}
	
	@Test
	public void twoStationBeEqualWithNameCaseDifference(){
		s2.setName("mtv");
		assertTrue(s1.equals(s2));
	}
	
	@Test(expected=StationNameNullException.class)
	public void stationNameNullThrowException(){
		new Station(null);
	}
	
	@Test(expected=StationNameEmptyException.class)
	public void stationNameEmptyThrowException(){
		new Station("");
	}
	
	@Test(expected=StationNameEmptyException.class)
	public void changeStationNameEmptyThrowException(){
		s1.setName("");
	}

}
