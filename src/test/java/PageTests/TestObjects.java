package PageTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.BasePage;
import PageObjects.PageObjects;

public class TestObjects {
	PageObjects hp;
	BasePage bp;
	
	public TestObjects(){
		
		hp=new PageObjects();
		bp=new BasePage();		
	}
		@Test
		public void verifytitle(){
			Assert.assertTrue(hp.getWomentitle().isDisplayed());
			Assert.assertTrue(hp.getDresstitle().isDisplayed());
			Assert.assertTrue(hp.getTshirttitle().isDisplayed());
	}
	@Test
	public void verifyTabs() {
		hp.clickwomen();
		Assert.assertTrue(hp.getTitlte().contains("Women"));
		hp.clickdress();
		Assert.assertTrue(hp.getTitlte().contains("Dresses"));
		hp.clicktshirt();
		Assert.assertTrue(hp.getTitlte().contains("T-shirts"));
		
	
	}
	

	
		

}
