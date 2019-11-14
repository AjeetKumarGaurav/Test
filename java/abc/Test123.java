package abc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test123 {
	WebDriver driver;
	
	@Test
	public void test1()
	{
System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Java-Jars2019\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
	}

}
