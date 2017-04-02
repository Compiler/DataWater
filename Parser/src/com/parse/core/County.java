package com.parse.core;

public class County {

	public enum type{
		year,
		murder,
		rape,
		robbery,
		aggrevatedAssault,
		violentCrimeTotal,
		burglary,
		larcenyTheft,
		motorVehicleTheft,
		nonViolentCrimeTotal,
		totalCrimeIndex,
		arson,
		domesticViolence,
		biasIncidentReport
		
	};
	private String name;
	private Integer info[];
	
	public County(String name){
		info = new Integer[14];
		this.name = name;
		
		
	}
	private int index = 0;
	public void add(int value){
		info[index++] = value;
	}
	
	public int get(int something){return info[something];}
	
	@Override
	public String toString(){
		String stream = info[0] + ": " + name + ":\n";
		stream+= "Murder: " + info[1] + ", Rape: " + info[2];
		return stream;
	}
}
