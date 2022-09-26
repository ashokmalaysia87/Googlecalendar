package googlecale;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class logincal {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("ashok");
	 String projpath;
		WebDriver driver;
		JavascriptExecutor js;	
	 projpath = System.getProperty("user.dir");
	   System.setProperty("webdriver.chrome.driver", projpath+"/src/test/resources/drivers/chromedriver.exe");
	   driver = new ChromeDriver();
	   System.out.println(projpath+"/src/test/resources/drivers/chromedriver.exe");
	   
	   
	   driver.navigate().to("https://calendar.google.com/calendar/u/0/r?pli=1");
	   driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("smal0044@student.monash.edu");
	   driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
	   driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	   driver.findElement(By.xpath(" //*[@id=\"okta-signin-username\"]")).sendKeys("smal0044@student.monash.edu");
	   driver.findElement(By.xpath(" //*[@id=\"okta-signin-password\"]")).sendKeys("M@ll3p@dd!");
	   driver.findElement(By.xpath("//*[@id=\"okta-signin-submit\"]")).click();
	   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	   driver.findElement(By.xpath("//*[@id=\"form63\"]/div[2]/input")).click(); 
	
	}

}
