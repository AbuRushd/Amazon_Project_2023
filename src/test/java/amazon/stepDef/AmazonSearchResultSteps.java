package amazon.stepDef;

import amazon.pageAction.AmazonSearchResultsActions;
import cucumber.api.java.en.Then;

public class AmazonSearchResultSteps {
	
	AmazonSearchResultsActions AmazonSearchResultsActionsobj =  new AmazonSearchResultsActions ();

	@Then("^Item list should have only shoes related products$")
	public void item_list_should_have_only_shoes_related_products() throws Throwable {
		AmazonSearchResultsActionsobj.foundTheResult();
	}
}
