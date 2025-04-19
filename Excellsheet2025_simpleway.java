package TestNg;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class Excellsheet2025_simpleway {
public static void main(String[] args) throws EncryptedDocumentException,IOException{
	
	FileInputStream f1 = new FileInputStream("/Users/bikash456/eclipse-workspace/maven_Package/testdata/ExcelBikash 2025.xlsx");
	Workbook w1 = WorkbookFactory.create(f1);
    String un  = w1.getSheet("Bikash").getRow(1).getCell(0).getStringCellValue();
	String pass=w1.getSheet("Bikash").getRow(1).getCell(1).getStringCellValue();

	
	System.out.println(un);
	System.out.println(pass);
}
}
