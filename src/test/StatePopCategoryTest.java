package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.State;
import model.StateBusinessLogic;

public class StatePopCategoryTest {
	
	StateBusinessLogic sBL = new StateBusinessLogic();
	State ia = new State("Iowa");
	State ne = new State("Nebraska");
	State ca = new State("California");
	State fl = new State("Florida");

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testStatePopCategory() {
		
		ia.setPopulation(3163561);
		String category = sBL.statePopCategory(ia);
		assertEquals("medium", category);
		
		ne.setPopulation(1937552);
		category = sBL.statePopCategory(ne);
		assertEquals("small", category);
		
		ca.setPopulation(39368078);
		category = sBL.statePopCategory(ca);
		assertEquals("large", category);
	
	}

	@Test
	public void testNameNotNull() {

		assertNotNull(fl.getName());
	
	}
	
}
