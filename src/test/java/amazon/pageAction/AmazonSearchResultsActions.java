package amazon.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import amazon.Utilities.SetupDrivers;
import amazon.pageElements.AmazonSearchResultLocators;

public class AmazonSearchResultsActions {

	AmazonSearchResultLocators AmazonSearchResultLocatorsobj;
	
	public AmazonSearchResultsActions () {
		AmazonSearchResultLocatorsobj = new AmazonSearchResultLocators();
		PageFactory.initElements(SetupDrivers.driver, AmazonSearchResultLocatorsobj);
	}
	public void foundTheResult() {
		
		Assert.assertTrue(AmazonSearchResultLocatorsobj.foundResult.isDisplayed());
	}
}
