package TestNg;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class  Assignment21shoescartcomplete {
@Test
public void  login_to_Facbook() throws InterruptedException
{
ChromeDriver driver= new ChromeDriver();
driver.get("https://www.Amazon.in");
//driver.manage().window().maximize();

WebElement search=	driver.findElement(By.id("twotabsearchtextbox"));
search.sendKeys("shoes"+Keys.ENTER);

WebElement e2=	driver.findElement(By.xpath("//a[@class=\"a-link-normal s-no-outline\"][1]"));
e2.click();

Set<String>s1=driver.getWindowHandles();
Iterator<String> i1= s1.iterator();
String parentid =i1.next();
String childid=i1.next();
driver.switchTo().window(childid);

WebElement buynow=driver.findElement(By.id("buy-now-button"));
buynow.click();

WebElement email=driver.findElement(By.id("ap_email"));
email.sendKeys("Bikashdhungana651@gmail.com");
email.click();

WebElement emailclick=driver.findElement(By.id("continue"));
emailclick.click();

WebElement passclick=driver.findElement(By.id("ap_password"));
passclick.sendKeys("Sarmilaamerica123$");
passclick.click();

WebElement emailclick2=driver.findElement(By.id("signInSubmit"));
emailclick2.click();




	
	
	
	
	
	
	
	
	
	
	

	
	
	
}




}


