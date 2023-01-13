package homePageTest;

import org.testng.annotations.Test;

import genericUtility.BaseClass;

public class DemoTestScript2 extends BaseClass {
	
	@Test(priority = 2)
	public void verifyCustomer() {
		System.out.println("Customer has been verified");
	}


}
