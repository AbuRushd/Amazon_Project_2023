package amazon.Utilities;


import cucumber.api.Scenario;
import cucumber.api.java.After;

public class After_Action {

	@After
	public void afterActions(Scenario Scenario){
		SetupDrivers.tearDownDriver();
		System.out.println(" ------Test Complete, Browser Closed ");
	}
}
