 package test;

 import org.junit.runner.JUnitCore;
 import org.junit.runner.Result;
 import org.junit.runner.notification.Failure;
 
/**
 * Kristopher Tope - kmtope@dmacc.edu
 * 202102 CIS175 22624
 * Feb 3, 2021
 */

public class TestRunner {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(AllTests.class);
		
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println(result.wasSuccessful());
		
		
	}

}
