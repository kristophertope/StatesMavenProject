package model;

public class StateBusinessLogic {

	public boolean isRegionValid(State state) {
		
		return state.getRegion().equals("Northeast") ||
			   state.getRegion().equals("Southeast") ||
			   state.getRegion().equals("Midwest") ||
			   state.getRegion().equals("Southwest") ||
			   state.getRegion().equals("West");
	}
	
	public String statePopCategory(State state){
		int smallLimit = 3000000;
		int mediumLimit = 10000000;
		
		if (state.getPopulation() <= smallLimit) return "small";
		if (state.getPopulation() <= mediumLimit) return "medium";
		return "large";
	}
	
}
