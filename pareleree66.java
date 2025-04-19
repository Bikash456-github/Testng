package TestNg;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.safari.SafariDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;

	public class pareleree66 {
	    WebDriver driver;

	    @Test
	    @Parameters("browser")
	    public void Launchamazon(String nameofbrowser) {
	        // Browser initialization
	        if (nameofbrowser.equalsIgnoreCase("chrome")) {
	            System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); 
	            ChromeOptions options = new ChromeOptions();
	            options.addArguments("--remote-allow-origins=*");
	            driver = new ChromeDriver(options);
	        } else if (nameofbrowser.equalsIgnoreCase("safari")) {
	            driver = new SafariDriver();
	        } else {
	            throw new IllegalArgumentException("Browser " + nameofbrowser + " is not supported.");
	        }

	        // Browser configurations
	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
	        driver.get("https://www.ebay.com/");

	        // Interacting with the web elements
	        WebElement e1 = driver.findElement(By.cssSelector("input#gh-ac"));
	        e1.sendKeys("i phone 16" + Keys.ENTER);
	    }

	    @AfterTest
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}


