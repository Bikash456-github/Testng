package TestNg;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Iframe_Finall_Amezon_AutoSuggestion2 {
@Test
	public static void main(String[] args)throws InterruptedException {
	
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.Amazon.in");
		//driver.manage().window().maximize(

WebElement search=	driver.findElement(By.id("twotabsearchtextbox"));
search.sendKeys("Reebok Mens Advent Tr Track and Field Shoe"+Keys.ENTER);
WebElement e2=	driver.findElement(By.xpath("//a[@class=\"a-link-normal s-no-outline\"][1]"));
e2.click();
Set<String>s1=driver.getWindowHandles();
Iterator<String> i1= s1.iterator();
String parentid =i1.next();//parent winodw id
String childid=i1.next();//any child id
System.out.println(parentid);
System.out.println(childid);
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
WebElement Creditcard=driver.findElement(By.name("ppw-instrumentRowSelection"));
Creditcard.click();
WebElement Carddetail=driver.findElement(By.linkText("Enter card details"));
Carddetail.click();


WebElement Handleiframe=driver.findElement(By.name("ApxSecureIframe"));

driver.switchTo().frame(Handleiframe);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebElement Cardnumber =driver.findElement(By.linkText("Enter card details"));
Cardnumber.sendKeys("4591562307594099");











/*
WebElement payment=driver.findElement(By.name("ppw-instrumentRowSelection"));
payment.click();
WebElement carddetails= driver.findElement(By.linkText("Enter card details"));
carddetails.click();
WebElement iframe=	driver.findElement(By.name("ApxSecureIframe"));
driver.switchTo().frame(iframe);
WebElement cardnumber= driver.findElement(By.name("addCreditCardNumber"));
cardnumber.sendKeys("4591560307891099");
driver.switchTo().defaultContent();
driver.switchTo().defaultContent();
WebElement iframe=	driver.findElement(By.name("ApxSecureIframe"));
driver.switchTo().frame(iframe);
WebElement cardnumber= driver.findElement(By.name("addCreditCardNumber"));
cardnumber.sendKeys("4591562307594099");
driver.switchTo().defaultContent();
WebElement iframe =driver.findElement(By.name("ApxSecureIframe"));
		        driver.switchTo().frame(iframe); //iframe giving control to frame
		        
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		        
		        WebElement e15 = driver.findElement(By.name("addCreditCardNumber"));
		        e15.sendKeys("");
		    
		        WebElement e17 = driver.findElement(By.name("ppw-expirationDate_month"));	
		        Select date = new Select (e17);
		        date.selectByValue("");
	
		        WebElement e18 = driver.findElement(By.name("ppw-expirationDate_year"));
		        Select year = new Select (e18);
		        year.selectByValue("");
		        
		        WebElement e19 = driver.findElement(By.name("ppw-widgetEvent:AddCreditCardEvent"));
		        e19.click();
		        
		        driver.switchTo().defaultContent(); // give control back to parent window
		        
		        WebElement iframe1 =driver.findElement(By.name("apx-secure-field-addCreditCardVerificationNumber"));
		//        driver.switchTo().frame(iframe1); //iframe1 giving control to frame
		
		        WebDriverWait w21 = new WebDriverWait(driver, Duration.ofSeconds(10)); //explicit wait 
		        w21.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframe1));
		        
		       		
		   
		        WebElement e20 = driver.findElement(By.xpath("//input[@id='field']"));               //xpath("//input[@class='card-cvv']"));
		        e20.sendKeys("");
		        driver.switchTo().defaultContent();
*/






		
		
		
		
	}

}
