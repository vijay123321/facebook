package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageCart extends BasePage{

	@FindBy(id="summary_products_quantity")
	private WebElement ProductDet;
	
	public PageCart() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement ProductDet() {
		return ProductDet;
	}
	
	
	
	
	
}
