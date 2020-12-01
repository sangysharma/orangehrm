package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.DriverManager;
import utils.SeleniumHelper;

public class HomePageFactory {
	
	SeleniumHelper sh = new SeleniumHelper();

	//page organise model(pom)- to organise everything bases on pages

	public HomePageFactory(WebDriver driver) {

		driver = DriverManager.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='logInPanelHeading']")
	public WebElement logInPanelTitle;		

	@FindBy(xpath = "//input[@id='txtUsername']")
	public WebElement usernameTextBox;	

	@FindBy(xpath = "//input[@id='txtPassword']")
	public WebElement passwordTextBox;	

	@FindBy(xpath = "//input[@id='btnLogin']")
	public WebElement logInButton;	

	public void enterUserName(String username) {
		//usernameTextBox.sendKeys(username);
		sh.waitForElement(usernameTextBox).sendKeys(username);
		
	}

	public void enterPassword(String password) {
		//passwordTextBox.sendKeys(password);
		sh.waitForElement(passwordTextBox).sendKeys(password);


	}
	public void clickLoginButton() {
		//logInButton.click();
		sh.waitForElement(logInButton).click();
	}

}
