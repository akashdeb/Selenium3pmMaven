package POMRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Constructor: @FindBy load
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//Identify elements
	@FindBy(id = "username")
	private WebElement usernameTextField;
	
	@FindBy(name = "pwd")
	private WebElement passwordTextField;
	
	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement loginButton;
	
	//private member access
	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	//Business Logic - Repetitive task in a page
	public void loginAction(String username, String password) {
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();
	}
			
}
