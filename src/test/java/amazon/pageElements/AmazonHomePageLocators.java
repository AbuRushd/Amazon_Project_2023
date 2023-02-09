package amazon.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonHomePageLocators {

	@FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
	public WebElement searchtxbx;
	
	@FindBy(xpath="//*[@id=\"nav-search-submit-button\"]")
	public WebElement searchBtn;
}
