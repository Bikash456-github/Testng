package TestNg;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
@Test
public class Assignment57_AmazonLogin_DDT {
		public static void main(String[] args) throws RuntimeException, IOException{
	
			//step 1:let the java know where the excatly is sheet present
			//FileInputStream f1	=new  FileInputStream ("/Users/bikashdhungana/Desktop/Selenium 2/FirstMavenproject");
			FileInputStream f1=new FileInputStream("/Users/bikashdhungana/Desktop/Selenium/project1/bikash1.xlsx");
		     //2: open the excell sheeet
			Workbook w1= WorkbookFactory.create(f1);
		      //3: got to the actual sheet 
	       Sheet s1=w1.getSheet("login");
	       Row r1=s1.getRow(1);
	        Cell c1=r1.getCell(0);
	       String un=c1.getStringCellValue();
	       System.out.println(un);
	
	
	
	
	
}
	
	
	
	
	
	
	
}
