package xcelreadandwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	// "C:\Users\Avinash Hande\Documents\practice.xlsx"
	public static void main(String[] args) throws IOException {
		File path = new File("C:\\Users\\Avinash Hande\\Documents\\practice.xlsx");
		FileInputStream load = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(load);
		XSSFSheet sheet = workbook.getSheetAt(0);
        
		FileOutputStream input = new FileOutputStream(path);
		sheet.createRow(0).createCell(0).setCellValue("sushh");
		workbook.write(input);
	}

}
