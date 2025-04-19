package TestNg;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;
public class assignment59_Fethtoexcellsheet_differentway {
	
public static void main(String[] args) throws EncryptedDocumentException, Exception {
	

FileInputStream f1=new FileInputStream("/Users/bikash456/eclipse-workspace/maven_Package/testdata/ExcelBikash 2025.xlsx");
Workbook w1=WorkbookFactory.create(f1);
//Sheet  s1=workbook.getSheet("Bikash");//Access the fist sheet	
//Now you can read cell data etc.
//3: got to the actual sheet 
Sheet s1=    w1.getSheet("Bikash");
Row r1=s1.getRow(1);
Cell c1=r1.getCell(0);
String un=c1.getStringCellValue();
System.out.println(un);
Row r2=s1.getRow(1);
Cell c2=r2.getCell(1);
String pass=c2.getStringCellValue();
System.out.println(pass);

ChromeDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/ap/signin?_encoding=UTF8&openid.assoc_handle=amazon_checkout_in&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fcheckoutportal%2Fenter-checkout.html%3Fie%3DUTF8%26asin%3DB0DHGLCH6Y%26buyNow%3D1%26cartCustomerID%3D0%26fromSignIn%3D1%26isGift%3D0%26offeringID%3DhHgbvZnchtrnzReyQTB05wOFGJ7U8iUjcw9x2w94QJ%25252FoIS6YYRhSbXEqCYd2sSYWlc4WZlZe1CldRW1u9fIAri7BpPEbmx22cOZltRYSZrJX%25252FvegQ7Vw89FMyszSqi6g9qKHpVIP4IaDoqT5qUBE5xjRYDItZjeJiOlQBs%25252BSkJEzQf%25252FEEaLu7U1NTg34xrkG%26purchaseInputs%3DHASH%25280x7f90547eb8b0%2529%26quantity%3D1%26sessionID%3D261-7648063-8375469&pageId=amazon_checkout_in&showRmrMe=0&siteState=IMBMsgs.&suppressSignInRadioButtons=0");
driver.manage().window().maximize();
WebElement un1 = driver.findElement(By.id("ap_email"));
un1.sendKeys(un);
WebElement continuee = driver.findElement(By.id("continue"));
continuee.click();

WebElement pass1 = driver.findElement(By.id("ap_password"));
pass1.sendKeys(pass);

WebElement signin = driver.findElement(By.id("signInSubmit"));
signin.click();








}}


