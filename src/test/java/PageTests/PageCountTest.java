package PageTests;

import org.testng.annotations.Test;

import PageObjects.BasePage;
import PageObjects.PageCount;
import PageObjects.PageObjects;

public class PageCountTest {
	BasePage bp;
	PageCount pc;
	PageObjects po;
	
	
	public PageCountTest() {
		bp= new BasePage();
		pc = new PageCount();
		po =new PageObjects();
	}
	@Test
	public void verifyPageCount() {
		po.clickwomen();
		System.out.println(pc.imgCount());
		System.out.println(pc.prdcount1());		
		
		
	}

}
