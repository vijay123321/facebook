package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects extends BasePage {
	
	@FindBy(xpath="//li//a[@title]")
	private WebElement Womentitle;
	
	@FindBy(xpath="(//li//a[@title='Dresses'])[2]")
	private WebElement Dressestitle;
	
	@FindBy(xpath="(//li//a[@title='T-shirts'])[2]")
	private WebElement Tshirttitle;
	
	public PageObjects() {
		PageFactory.initElements(driver, this);
	}
	public WebElement getWomentitle(){
		return Womentitle;
	}
	public WebElement getDresstitle(){
		return Dressestitle;
	}
	public WebElement getTshirttitle(){
		return Tshirttitle;
	}
	public void clickwomen() {
	 Womentitle.click();
	// return Womentitle;
	}
	public void clickdress() {
		 Dressestitle.click();
		}
	public void clicktshirt() {
		 Tshirttitle.click();
		}
	
}
