package PageTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.BasePage;
import PageObjects.PageCart;
import PageObjects.PageObjects;
import PageObjects.PageobjectSML;

public class TestCart {
	
	BasePage bp;
	PageObjects hp;
	PageobjectSML hpsml;
	PageCart pc;
	
	public TestCart() {
		
		bp=new BasePage();
		hp=new PageObjects();
		hpsml=new PageobjectSML();
		pc = new PageCart();
	}
			
    	@Test
    	public void VerifyCart() {
    		hp.clickwomen();
    		hpsml.Mousehover();
    		hpsml.AddtoCart();
			hpsml.Ptc();
			
			Assert.assertTrue(pc.ProductDet().getText().contains("1 Product"));
			
		}
		
		
	}


