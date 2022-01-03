package com.our.pr01;

public class MainPrac01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nation nation = new Nation();
		
		nation.setName("korea");
		nation.setArea(30000);
		nation.setPopulation(5000);
		
		System.out.println(nation.getName());
		System.out.println(nation.getArea());
		System.out.println(nation.getPopulation());
		
		nation.nameChange("maxico");
		nation.areaChange(6000);
		nation.populationChange(10000);
		
		System.out.println(nation.name +"\n"+ nation.area +"\n"+ nation.population);
	}

}
