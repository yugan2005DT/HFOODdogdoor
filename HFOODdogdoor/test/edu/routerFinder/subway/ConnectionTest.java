package edu.routerFinder.subway;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ConnectionTest {
	private Station s1, s2, s3;
	private Connection c1, c2;
	
	@Before
	public void init(){
		s1 = new Station("MTV");
		s2 = new Station("SFO");
		s3 = new Station("Palo Alto");
		c1 = new Connection(s1, s2);
		c2 = new Connection(s2, s3);
	}

	@Test
	public void connectionEqualRegardlessStationOrder() {
		c2 = new Connection(s2, s1);
		assertTrue(c1.equals(c2));
	}
	
	@Test
	public void getTheOtherStationOfAConnection(){
		assertTrue(s1.equals(c1.getOtherStation(s2)));
	}
	
	@Test(expected=ConnectionStationNullException.class)
	public void stationInConnectionNullThrowException() {
		new Connection(s1, null, "ALineName");
	}
	
	@Test(expected=ConnectionStationTheSameException.class)
	public void setTwoStationTheSameInConnectionThrowException(){
		c1.setStation(s1,s1);
	}
	


}
