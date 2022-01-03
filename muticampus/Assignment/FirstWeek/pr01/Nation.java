package com.our.pr01;

public class Nation {
		
	String name;
	int area;
	int population;
	
	public String nameChange(String name) {
		this.name = name;
		return name;
	}
	
	public int areaChange(int area) {
		this.area = area;
		return area;
	}
	
	public int  populationChange(int population) {
		this.population = population;
		return population;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
		
	
		
	
}
