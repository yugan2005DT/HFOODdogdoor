<<<<<<< HEAD
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
=======
package edu.headfirstOOD.boardGame;

import java.util.HashMap;
import java.util.Map;

public class Unit {
	
	private String type;
	private int id;
	private String name;
	private Map<String, Property> properties;
	
	public Unit(){
		properties = new HashMap<String, Property>();
		
	}
	
	

	public Unit(String type, int id, String name) {
		this();
		this.type = type;
		this.id = id;
		this.name = name;		
	}



	public void setType(String string) {
		type=string;
	}

	public String getType() {
		return type;
	}

	public void setProperty(String string, Property i) {
		// TODO Auto-generated method stub
		
	}

	public Property getProperty(String string) {
		if (properties.get(string)!=null){
			return properties.get(string);
		}
		return new noProperty();
	}



	public int getId() {
		return id;
	}



	public String getName() {
		return name;
	}
	
	


}
>>>>>>> refs/remotes/origin/master
