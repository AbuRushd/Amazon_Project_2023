package amazon.stepDef;

import amazon.pageAction.AmazonHomePageActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class AmazonHomePageSteps {
	
	AmazonHomePageActions AmazonHomePageActionsobj = new AmazonHomePageActions ();

	
	@Given("^Open Amazon Homepage$")
	public void open_Amazon_Homepage() throws Throwable {
		AmazonHomePageActionsobj.openHomePage();
	}

	@When("^Search for Shoes$")
	public void search_for_Shoes() throws Throwable {
		AmazonHomePageActionsobj.searchForShoes();
		AmazonHomePageActionsobj.findTheShoes();
	}
	
}
