package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageSubMsg extends BasePage {
	
	@FindBy(xpath="//p[@class='alert alert-success']")
	private WebElement SubscriptionMsg;
	
	public PageSubMsg() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement SuccessMsg() {
		return SubscriptionMsg;
	}
	

}
