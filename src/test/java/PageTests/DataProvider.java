package PageTests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider {
	
	WebDriver driver;
		@BeforeMethod
		public void launch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\perumal kavitha\\Downloads\\Chrome 79\\chromedriver.exe");
		driver=new  ChromeDriver();
	//driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		}
		
	
	@org.testng.annotations.DataProvider(name="VerifyLogin")
	 public Object[][] getData(){
		
			
			Object[][] data=new Object[3][2];
			
			data[0][0]="Admin";
			data[0][1]="admin123";
			
			data[1][0]="Adminm";
			data[1][1]="Admin125";
			
			data[2][0]="Admin";
			data[2][1]="admin123";
			
			return data;
		}
	
	@Test(dataProvider="VerifyLogin")
	public void verifyLogin(String UserName,String PassWord) {
		driver.findElement(By.id("txtUsername")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(PassWord);
		driver.findElement(By.id("btnLogin")).click();
		
	}
	
		
	

	

		}
		
	


