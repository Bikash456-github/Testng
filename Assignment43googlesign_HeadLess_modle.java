package TestNg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Assignment43googlesign_HeadLess_modle {


	public static void main(String[] args) {
		ChromeOptions c1=new ChromeOptions();
		ChromeDriver driver=new ChromeDriver(c1);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	   // WebElement l1=driver.findElement(By.xpath("//a[span[text()=\"Sign in\"]] "));
		//l1.click();
		WebElement l1=driver.findElement(By.xpath("//a[@class='gb_Ta gb_yd gb_pd gb_gd'] "));
		l1.click();
		
		driver.quit();
		
		/*
		driver.manage().deleteAllCookies();
		Actions action=new Actions(driver);
		WebElement l1=driver.findElement(By.cssSelector("#gb > div > div.gb_Re > a"));
		action.moveToElement(l1);
		action.click();
		action.perform();
			
		List<WebElement> li=driver.findElements(By.tagName("a"));
    System.out.println(li.size());
      for (int i=0;i<li.size();i++)
         {
	WebElement list_li=li.get(i);
	String url=list_li.getAttribute("href");
	System.out.println(url);
         }
	
*/
	}
	}
	