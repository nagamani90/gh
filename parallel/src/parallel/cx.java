package parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class cx {
	String baseURL="https://www.flipkart.com/?affid=vcommission&affExtParam1=50714";
	WebDriver driver;
	@Parameters({"browser"})
	@BeforeTest
	public void openbrowser(String browser) {
		if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\arte241_nagamani\\Desktop\\jars\\geckodriver.exe");
			driver=new FirefoxDriver();
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\arte241_nagamani\\Desktop\\jars\\geckodriver.exe");
				driver=new ChromeDriver();
				if(browser.equalsIgnoreCase("ie"));
				System.setProperty("webdriver.ie.driver","C:\\Users\\arte241_nagamani\\Desktop\\jars\\IEDriverServer.exe");
				driver=new in
				driver
			}
		}
	}
	
	

}
