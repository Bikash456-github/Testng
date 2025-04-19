package TestNg;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class iframeyoutube_2025{
public static void main(String[] args) {
	ChromeDriver driver= new ChromeDriver();
	//FirefoxDriver driver= new FirefoxDriver();
	driver.get("https://www.Amazon.in");
	driver.manage().window().maximize();
	Select m1=	new Select(driver.findElement(By.id("searchDropdownBox")));
	m1.selectByValue("search-alias=electronics");
WebElement e1=	driver.findElement(By.id("twotabsearchtextbox"));
e1.sendKeys("Apple iPhone 13 (128GB) - Starlight"+Keys.ENTER);
WebElement e2=	driver.findElement(By.xpath("//a[@class=\"a-link-normal s-no-outline\"][1]"));
e2.click();
Set<String>s1=driver.getWindowHandles();
Iterator<String> i1= s1.iterator();
String parentid =i1.next();
String childid=i1.next();
System.out.println(parentid);
driver.switchTo().window(childid);
WebElement e3=	driver.findElement(By.id("buy-now-button"));
e3.click();
WebElement email=	driver.findElement(By.xpath("//input[@name='email']"));
email.sendKeys("Bikashdhungana651@gmail.com");
WebElement continue1=	driver.findElement(By.id("continue"));
continue1.click();
WebElement pass=	driver.findElement(By.id("ap_password"));
pass.sendKeys("Sarmilaamerica123$");
WebElement signin=	driver.findElement(By.id("signInSubmit"));
signin.click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//WebElement payment= driver.findElement(By.xpath("input[@value='SelectableAddCreditCard']\")"));


WebElement payment =driver.findElement(By.xpath("//input[@name='ppw-instrumentRowSelection']"));
payment.click();
WebElement carddetails= driver.findElement(By.xpath("//*[@id=\"pp-DJZk9y-105\"]"));//
carddetails.click();
}}
/*
WebElement cardnumber= driver.findElement(By.name("addCreditCardNumber"));
cardnumber.sendKeys("459156060789099");

WebElement iframe=	driver.findElement(By.name("ApxSecureIframe-pp-xmTlD0-8"));

driver.switchTo().frame(iframe);

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

WebElement e15 = driver.findElement(By.name("addCreditCardNumber"));
e15.sendKeys("657487647567465783");

WebElement month = driver.findElement(By.name("ppw-expirationDate_month"));	
Select date = new Select (month);
date.selectByValue("3");

WebElement e18 = driver.findElement(By.name("ppw-expirationDate_year"));
Select year = new Select (e18);
year.selectByValue("2027");

WebElement Addyourcard = driver.findElement(By.name("ppw-widgetEvent:AddCreditCardEvent"));
Addyourcard.click();

driver.switchTo().defaultContent(); // give control back to parent window

WebElement iframe1 =driver.findElement(By.name("apx-secure-field-addCreditCardVerificationNumber"));
  driver.switchTo().frame(iframe1); //iframe1 giving control to frame

WebDriverWait w21 = new WebDriverWait(driver, Duration.ofSeconds(10)); //explicit wait 
w21.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframe1));

		

WebElement e20 = driver.findElement(By.xpath("//input[@id='field']"));               //xpath("//input[@class='card-cvv']"));
e20.sendKeys("");
driver.switchTo().defaultContent();
}}

*/

