package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.State;
import model.StateBusinessLogic;

public class StateRegionTest {

	StateBusinessLogic sBL = new StateBusinessLogic();
	State iowa = new State("Iowa");
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIsRegionValid() {
		
		iowa.setRegion("midwest");
		assertTrue(sBL.isRegionValid(iowa));
		
		iowa.setRegion("MiDwEst");
		assertTrue(sBL.isRegionValid(iowa));
		
		iowa.setRegion("iMdwest");
		assertFalse(sBL.isRegionValid(iowa));
		
	}

}
