package package2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class driverSetup {

	WebDriver driver=null;
	public WebDriver setup(String browser) {
		System.out.println(browser);
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\java_softwares\\workspaces java\\chromedriver_win32 (1)\\chromedriver.exe");
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--disable-notifiations");
			driver=new ChromeDriver(opt);
			driver.get("https://www.google.com");
			
		}
		else {
			if(browser.equalsIgnoreCase("internetexplorer")) {
				System.setProperty("webdriver.ie.driver", "D:\\java_softwares\\chromedriver.exe");
				driver=new InternetExplorerDriver();
				
				
			}
		}
		return driver;
		
	}
	
	
	
}
