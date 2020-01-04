package PageTests;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.BasePage;
import PageObjects.PageSubMsg;
import PageObjects.PageSubscription;

public class TestSubscription {
	
	PageSubscription ps;
	BasePage bp;
	PageSubMsg psm;
	
	public TestSubscription() {
		bp=new BasePage();
		ps=new PageSubscription();
		psm=new PageSubMsg();
		}
	
	int random= new Random().nextInt(500);
    String email="qwe"+random+"@gmail.com";
	
	@Test
	public void verifySubscription() {
		//ps.SendEmail();
		ps.SendEmail(email);
		ps.SubmitButton();
		Assert.assertTrue(psm.SuccessMsg().getText().contains("You have successfully subscribed to this newsletter"));
		bp.quitDriver();
		
	}

}
