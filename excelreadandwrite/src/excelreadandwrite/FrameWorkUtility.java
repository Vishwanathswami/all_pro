package excelreadandwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FrameWorkUtility {
	
	public String Excelread(int sheetno,int row,int cell) throws IOException {
		File path= new File("C:\\Users\\Avinash Hande\\Documents\\practice.xlsx");
		FileInputStream load = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(load);
		XSSFSheet sheet = workbook.getSheetAt(sheetno);
	return	sheet.getRow(row).getCell(cell).getStringCellValue();
	}
	
	public void Excelwrite(int row,int cell,int sheetno,String s) throws IOException {
		File path = new File("C:\\Users\\Avinash Hande\\Documents\\practice.xlsx");
		FileInputStream load = new FileInputStream(path);
		XSSFWorkbook workbook =new XSSFWorkbook(load);
		XSSFSheet sheet =workbook.getSheetAt(sheetno);
		
		FileOutputStream input =new FileOutputStream(path);
		sheet.createRow(row).createCell(cell).setCellValue(s);
		workbook.write(input);
		workbook.close();
		
	}
	
	

}
