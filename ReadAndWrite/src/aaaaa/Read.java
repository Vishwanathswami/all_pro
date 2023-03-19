package aaaaa;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {
	// "C:\\Users\\Avinash Hande\\Documents\\practice.xlsx"
	public static void main(String[] args) throws FileNotFoundException   {
	File path=	new File("C:\\Users\\Avinash Hande\\Documents\\practice.xlsx");
	FileInputStream load= new FileInputStream(path);
	XSSFWorkbook workbook = null;
	try {
		workbook = new XSSFWorkbook(load);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
XSSFSheet sheet=	workbook.getSheetAt(0);
FileOutputStream input=new FileOutputStream(path);
sheet.createRow(11).createCell(0).setCellValue("Automation");
try {
	workbook.write(input);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
}
