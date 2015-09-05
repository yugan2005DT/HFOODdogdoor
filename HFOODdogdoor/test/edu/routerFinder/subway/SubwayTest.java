package edu.routerFinder.subway;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class SubwayTest {
	private Subway subway;
	private Station s1, s2, s3, s4;
	private Connection c1, c2, c3, c4;
	
	@Before
	public void init(){
		subway= new Subway();
		s1 = new Station("MTV");
		s2 = new Station("SFO");
		s3 = new Station("Palo Alto");
		s4 = new Station("Berkeley");
		c1 = new Connection(s1, s2);
		c2 = new Connection(s2, s3);
		c3 = new Connection(s3, s4);
	}

	@Test
	public void addNewStation() {
		subway.addStation(s1);
		subway.addStation(s2);
		Set<Station> actualStationsInSubway = new HashSet<>();
		actualStationsInSubway.add(s2);
		actualStationsInSubway.add(s1);
		assertThat(subway.getStations(), equalTo(actualStationsInSubway));	
	}
	
	@Test
	public void addDuplicatedStation(){
	}

}
