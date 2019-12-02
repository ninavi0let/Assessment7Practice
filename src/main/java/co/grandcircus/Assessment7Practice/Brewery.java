package co.grandcircus.Assessment7Practice;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Brewery {
	
	private String name;
	private String type;
	
	
	public Brewery() {
		
	}


	public Brewery(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "Brewery [name=" + name + ", type=" + type + "]";
	}
	
	

}
