package PageTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.BasePage;
import PageObjects.PageObjects;
import PageObjects.PageobjectSML;

public class TestSML {
	BasePage bp;
	PageObjects hp;
	PageobjectSML hpsml;
	
	public TestSML() {
		
		bp=new BasePage();
		hp=new PageObjects();
		hpsml=new PageobjectSML();
		
		}
	@Test
	public void VerifySsize() {
		hp.clickwomen();
		Assert.assertTrue(hpsml.getSsize().isDisplayed());
		Assert.assertTrue(hpsml.getMsize().isDisplayed());
		Assert.assertTrue(hpsml.getLsize().isDisplayed());
		
	}

	
}
