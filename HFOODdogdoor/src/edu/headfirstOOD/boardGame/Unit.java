package edu.headfirstOOD.boardGame;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Unit {
	
	private String type;
	private int id;
	private String name;
	private List<Weapon> weapons;
	
	private Map<String, Object> properties;
	
	public Unit(){
		properties = new HashMap<String, Object>();
	}
	
	public Unit(String type){
		this();
		this.type = type;
	}
	
	public Unit(String type, int id, String name){
		this(type);
		this.id=id;
		this.name=name;
	}
	

	public String getType() throws NullTypePropertyException{
		if (type==null || type.equals("")) throw new NullTypePropertyException("Type hasn't be set yet");
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Map<String, Object> getProperties() {
		return properties;
	}

	public void setProperties(Map<String, Object> properties) {
		this.properties = properties;
	}
	
	public void setProperty(String propertyName, Object property){
		properties.put(propertyName, property);
	}
	
	public Object getProperty(String propertyName){
		if (properties.get(propertyName) == null){
			throw new NullMapPropertyException("This property is not set yet!");
		}
		return properties.get(propertyName);
	}
	
	public void setId(int id){
		this.id = id;
	}

	public int getId() {
		return id;
	}
	
	public void setName(String name){
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setWeapon(List<Weapon> weapons) {
		this.weapons=weapons;
		
	}

	public Object getWeapon() {
		return weapons;
	}


}
