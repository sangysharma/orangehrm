package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
	
	/* Unconditional - Thread.sleep()
	 * Conditional - Implicit wait, explicit wait and fluent wait for synchronisation.
	 * 1. Implicit wait- only used once throughout the entire run. It is the wait for the DOM. Some amount of time will be assigned. 
	 * 		It is only used for find elements and find element.
	 * 2. Explicit wait- It has more condition, not just time. It will only wait for that specific element,used for element by element cases.
	 * 3. Fluent wait- It is similar to explicit wait. But it has polling time(intervals). For eg: checking every 5 sec 
	 *		 in the duration of the entire wait time.
	 * Q: if the code has both implicit and explicit wait, what will be the total wait time? Whichever is bigger will be chosen. time won´t be combined.
	 */

	private static WebDriver driver = null;
	
	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebDriver openBrowser(String browser) {

		if(browser.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox")){

			driver = new FirefoxDriver();

		}
		else if(browser.equalsIgnoreCase("Edge")) {

			driver = new EdgeDriver();
		}

		else {

			System.out.println("Incorrect Driver Input. Please enter the correct Driver.");
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().deleteAllCookies();
		return driver;

	}

	public void quitBrowser() {

		driver.quit();

	}

	public void closeBrowser() {

		driver.close();

	}


}
