package auto;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.*;
import org.openqa.selenium.WebDriver;

import com.codeborne.selenide.Configuration;


public class publicmethod {
	public  static WebDriver newdriver(){
		String url="https://shujuguan.shujuguan.cn";

		String driverpath="F:\\java-projects\\auto\\lib\\chromedriver.exe";
		String browser="chrome";
		String browserpara="--disable-infobars";
		 //System.setProperty("webdriver.chrome.driver", "F:\\Workspaces\\MyEclipse 10\\auto\\lib\\chromedriver.exe");	
		 //Configuration.chromeSwitches="--disable-infobars";	 
	     //Configuration.browser = "chrome"; 

		  if (browser.equals("chrome"))
		  {
			System.setProperty("webdriver.chrome.driver", driverpath);	
			Configuration.chromeSwitches=browserpara;	 
			Configuration.browser = browser; 
		  }

	      Configuration.timeout=5000;
	      open(url);

	      return getWebDriver();
	}
}
