package hello;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelReading {
	
	public static void main(String[] args) throws FileNotFoundException {
	File path = new File("C:\\Users\\Avinash Hande\\Documents\\practice.xlsx");
	FileInputStream load= new FileInputStream(path);
	XSSFWorkbook workbook= new XSSFWorkbook();
	XSSFSheet sheet=workbook.getSheetAt(0);
	String value=sheet.getRow(0).getCell(0).getStringCellValue();
	System.out.println(value);
	
	}

}
