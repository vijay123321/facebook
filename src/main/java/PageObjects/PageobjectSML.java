package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageobjectSML extends BasePage{
	
	@FindBy(xpath="//label[@for='layered_id_attribute_group_1']//a")
	private WebElement Ssize;
	
	@FindBy(xpath="//label[@for='layered_id_attribute_group_2']//a")
	private WebElement Msize;
	
	@FindBy(xpath="//label[@for='layered_id_attribute_group_3']//a")
	private WebElement Lsize;
	
	@FindBy(xpath="(//div//img[@width='250'])[1]")
	private WebElement Mousehover;
	
	@FindBy(xpath="//a[@title='Add to cart']//span")
	private WebElement Cartbtn;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']//span")
	private WebElement Ptc;
	
	public PageobjectSML() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement  getSsize() {
		return Ssize;
	}
	public WebElement  getMsize() {
			return Msize;
	}
	public WebElement  getLsize() {
				return Lsize;
	}
	
	public WebElement Mousehover() {
		moveMouse(Mousehover);
		return Mousehover;
	}

public WebElement AddtoCart() {
		Cartbtn.click();
		return Cartbtn;
	}
	
	public void Ptc() {
		Ptc.click();
	}
	
	
	
	

}
