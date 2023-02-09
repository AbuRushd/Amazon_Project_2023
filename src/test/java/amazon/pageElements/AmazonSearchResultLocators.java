package amazon.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonSearchResultLocators {
	
	@FindBy(xpath="//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]")
	public WebElement foundResult;

}
