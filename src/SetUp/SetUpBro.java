package SetUp;

import org.testng.annotations.Test;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class SetUpBro {
	
protected	static WebDriver driver;

  @BeforeClass
  @Parameters("browser")
  public void beforeClass(String browser) {
	  if(browser.equalsIgnoreCase("chrome"))
	  {
	  System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\selenium_chrm_path\\chromedriver.exe");
	  driver=new ChromeDriver();
	 
	  }
	  else if(browser.equalsIgnoreCase("IE"))
	  {
		  System.setProperty("webdriver.ie.driver", "E:\\SELENIUM\\selenium_ie_path\\IEDriverServer.exe");
		  driver=new InternetExplorerDriver();
		  
	  }
		  
	  
  }

}
