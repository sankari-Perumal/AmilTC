package TC;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginTC {
	public static WebDriver driver;
	@Test
	public void loginTC() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://pmt.amilfreight.com/signin");
		driver.findElement(By.xpath("//*[@id='txtusername']")).sendKeys("superuser");
		driver.findElement(By.xpath("//*[@id='txtpassword']")).sendKeys("Admin@1234");
		driver.findElement(By.xpath("//*[@id='btnSignIn']")).click();
		Thread.sleep(3000);
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Shipment Dashboard | Amil Freight"));
	
	
	}
	
	
	
	

}
