package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class assignment71_Retring_Failed_TestCases {
	@Test(retryAnalyzer=TestNg.assignment71_Retring_Failed_TestCases2.class)
	
public void test() {
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com");
	WebElement search=driver.findElement(By.name("q"));
	search.sendKeys("Nepal"+Keys.ENTER);
	
	
}
}