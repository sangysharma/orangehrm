package testRun;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageFactory.DashboardPageFactory;
import pageFactory.HomePageFactory;
import utils.DriverManager;
import utils.SeleniumHelper;

public class PracticeTest {
	
	/*When a class object gets created, all the variables get initialised.
	 * 
	 */
	
	@Test 
	public void ourFirstTest() {
		
		DriverManager dm = new DriverManager();
		dm.openBrowser("Chrome");
		SeleniumHelper sh = new SeleniumHelper();
		HomePageFactory homepage  = new HomePageFactory(DriverManager.getDriver());
		DashboardPageFactory dashboard = new  DashboardPageFactory(DriverManager.getDriver());
		SoftAssert sa = new SoftAssert();
		sh.goToURL("https://opensource-demo.orangehrmlive.com/");
		//sh.highlightElement(homepage.usernameTextBox);
		//sh.unhighlightElement(homepage.usernameTextBox);
		String window1 = sh.getCurrentWindowHandle();
		System.out.println(window1);
		homepage.enterUserName("Admin");
		//sh.highlightElement(homepage.passwordTextBox);
		homepage.enterPassword("admin123");
		
		//hpf.usernameTextBox.sendKeys("Admin");
		//hpf.passwordTextBox.sendKeys("admin123");
		//hpf.logInButton.click();
		
		//homepage.enterUserName("Admin");
		//homepage.enterPassword("admin123");
		homepage.clickLoginButton();
		sh.actions().contextClick().perform();
	//	sh.takeScreenshot();
		//dashboard.clickPim();
	//	dashboard.selectEmployeeStatus(3);
		sh.sleep(2);
		/*sh.openUrlNewWindow("https://opensource-demo.orangehrmlive.com/");
		sh.sleep(1);
		sh.goToURL("https://www.google.com/");
		//sh.switchWindow();
		sh.switchToNextWindow();
		sh.goToURL("https://www.google.com/");
		String window2 = sh.getCurrentWindowHandle();
		System.out.println(window2);
		//String actual = dashboard.getTextDashBoardTitle();
	//	String expected = "DashBoard";
	//	sa.assertEquals(actual, expected);
	//	sa.assertAll();
		
	/*	WebElement header = sh.getElement("//div[@id = 'logInPanelHeading']");
		String title = header.getText();
		System.out.println(title);
		String title2 = sh.waitForElement(header).getText();
		String title3 = sh.waitForElementFluent(header).getText();
	//	System.out.println(header);
		System.out.println(title2);
		System.out.println(title3);
		System.out.println(sh.ifWebElementExists(header));
		

		/*sh.navigateToURL("https://www.google.com/");
		sh.navigateBack();
		sh.navigateForward();
		sh.refreshPage();
		System.out.println(sh.getTitle());
		*/
		
		sh.sleep(2);
		dm.quitBrowser();
		
	}
	
	@Test
	public void test2() {
		
		SeleniumHelper sh = new SeleniumHelper();
		String cell1 = sh.getDataFromExcelSheet("Documents/Jira.xlsx", "Sheet1", 2, 4);
		System.out.println(cell1);
		
		
	}
}
