package homePageTest;

import org.testng.annotations.Test;

import genericUtility.BaseClass;

public class DemoTestScript extends BaseClass {
	
	@Test(priority = 1)
	public void verifyHomePageTest() {
		System.out.println("Homepage has been verified");
	}
	
	
}
