package com.srikanth.springdataJPA;

public class Record {
	
	private String name;
	private String display_name;
	
	public Record(String name, String display_name) {
		super();
		this.name = name;
		this.display_name = display_name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDisplay_name() {
		return display_name;
	}
	public void setDisplay_name(String display_name) {
		this.display_name = display_name;
	}
	
	@Override
	public String toString() {
		return name+","+display_name;
	}
	
	

}
