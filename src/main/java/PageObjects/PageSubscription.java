package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageSubscription extends BasePage {
	
	@FindBy(id="newsletter-input")
	private WebElement Newsletter;
	
	@FindBy(xpath="//button[@name='submitNewsletter']")
	private WebElement SubmitBtn;
	
	public PageSubscription() {
		PageFactory.initElements(driver, this);
	
	}
	
	//public void SendEmail() {
		//Newsletter.sendKeys("qwerty12345@gmail.com");
	//}
	
	public void SendEmail(String email) {
		setText(Newsletter, email);
	}
	
	public void  SubmitButton() {
		SubmitBtn.click();
		}

}
