package com.parse.core;

public class County {
	public static final int YEAR = 0;
	public static final int MURDER = 1;
	public static final int RAPE = 2;
	public static final int ROBBERY = 3;
	public static final int AGGR_ASSAULT= 4;
	public static final int VIOLENT_CRIME_TOTAL= 5;
	public static final int BURGLARY= 6;
	public static final int LARCENY= 7;
	public static final int GTA= 8;
	public static final int NON_VIOLENT_CRIME_TOTAL = 9;
	public static final int ARSON = 10;
	public static final int DOMESTIC_VIOLENCE = 11;
	public static final int BIAS_INCIDENT_REPORTS = 12;
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
