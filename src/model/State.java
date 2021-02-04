package model;

public class State {

	private String name;
	private String region;
	private int population;
	
	public State() {
		// TODO Auto-generated constructor stub
	}

	public State(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = Character.toUpperCase(region.charAt(0)) + region.substring(1).toLowerCase();
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	
}
