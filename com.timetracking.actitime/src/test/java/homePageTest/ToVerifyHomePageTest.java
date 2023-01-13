package homePageTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import POMRepo.HomePage;
import genericUtility.BaseClass;
import genericUtility.WebDriverUtility;

public class ToVerifyHomePageTest extends BaseClass {

	@Test
	public void verifyHomePageTest() throws EncryptedDocumentException, IOException {
			
		String expectedTitle = eUtils.fetchStringDataFromExcelSheets("Sheet2", 1, 0);	
		HomePage home = new HomePage(driver);
	
		WebDriverUtility wUtils = new WebDriverUtility();
		wUtils.toWaitForTitle(driver, "Enter");
		
		String actualTitle = home.verifyHomePageTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Pass Home page title is verified");
		
	}

}
