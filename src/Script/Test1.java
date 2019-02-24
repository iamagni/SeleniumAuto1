package Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import SetUp.SetUpBro;

public class Test1 extends SetUpBro{
	
	  @Test(priority=1, description="Open the website",dataProvider="Login")
	  public void openUrl(String user,String last) {
		  
		  driver.get("https://www.edureka.co/blog/object-oriented-programming/?SSAID=1238556");
		  driver.manage().window().maximize();
		  System.out.println(user+last);
	  }
	  
	  @Test(priority=2,description="Navigate to selected Topic")
	  public void navigateToTopic()
	  {
		  WebElement oops=driver.findElement(By.xpath("//a[text()='Object Oriented Programming – Java OOPs Concepts With Examples']"));
		  new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(oops));
		  oops.click();
	  }
@DataProvider(name="Login")
	  public Object[][] passdata()
	  {
		 Object [][]data=new Object[1][2];
		 data[0][0]="saurabh";
		 data[0][1]="agni";
		 return data;
	  }
}
