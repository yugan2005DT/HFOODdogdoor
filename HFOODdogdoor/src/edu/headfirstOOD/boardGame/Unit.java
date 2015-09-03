package edu.headfirstOOD.boardGame;

import java.util.HashMap;
import java.util.Map;

public class Unit {
	
	private String unitType;
	private Map<String, Property> properties;
	
	public Unit(String unitType){
		this.unitType = unitType;
		this.properties = new HashMap<String, Property>();
	}
	
	public Unit(String unitType, Map<String, Property> properties){
		this.unitType = unitType;
		this.properties = properties;
	}

	public String getUnitType() {
		return unitType;
	}

	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}

	public Map<String, Property> getProperties() {
		return properties;
	}

	public void setProperties(Map<String, Property> properties) {
		this.properties = properties;
	}
	
	public void addProperty(String propertyName, Property property){
		properties.put(propertyName, property);
	}


}
