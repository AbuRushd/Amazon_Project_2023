package amazon.pageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import amazon.Utilities.SetupDrivers;
import amazon.pageElements.AmazonHomePageLocators;

public class AmazonHomePageActions {

	AmazonHomePageLocators AmazonHomePageLocatorsobj;
	
	public AmazonHomePageActions () {
		
		AmazonHomePageLocatorsobj = new AmazonHomePageLocators();
		PageFactory.initElements(SetupDrivers.driver, AmazonHomePageLocatorsobj);
	}
	public void openHomePage() {
		SetupDrivers.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	public void searchForShoes() {
		AmazonHomePageLocatorsobj.searchtxbx.sendKeys("Shoes");
	}
	public void findTheShoes() {
		AmazonHomePageLocatorsobj.searchBtn.click();
	}
}
