package TestNg;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment59_Fethtoexcellsheet_simpleway {

	
	public static void main(String[] args) throws EncryptedDocumentException,IOException{
		//Step 1:let java know where exactually is sheet present
		FileInputStream f1 = new FileInputStream("/Users/bikash456/eclipse-workspace/maven_Package/testdata/ExcelBikash 2025.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);//open the excell sheet
	    String un  = w1.getSheet("Bikash").getRow(1).getCell(0).getStringCellValue();//go to sheet
		String pass=w1.getSheet("Bikash").getRow(1).getCell(1).getStringCellValue();
		
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


		
	
		
		
		
		
		
	}	
	
}
