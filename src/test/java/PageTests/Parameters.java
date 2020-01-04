package PageTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Parameters {
	WebDriver driver;
	@BeforeMethod
	public void launch() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\perumal kavitha\\Downloads\\Chrome 79\\chromedriver.exe");
	driver=new  ChromeDriver();
//driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test(vijay000)
	@org.testng.annotations.Parameters({"UserName","PassWord"})
	public void verifyLogin(String UserName,String PassWord) {
		driver.findElement(By.id("txtUsername")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(PassWord);
		driver.findElement(By.id("btnLogin")).click();

}
}