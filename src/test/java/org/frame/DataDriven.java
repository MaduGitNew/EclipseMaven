package org.frame;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	public static void main(String[] args) throws IOException {
		//access the file
File f=new File("C:\\Users\\HP\\Desktop\\Trinethra java\\datadriven.xlsx");
		
		//to access excel sheet 
		FileInputStream in=new FileInputStream(f);
		
		//access workbook
		Workbook book=new XSSFWorkbook(in);
		
		//access sheet
		Sheet sheet = book.getSheet("Sheet1");
		
		//find no. of rows
		int row = sheet.getPhysicalNumberOfRows();
		System.out.println("Total no. of rows: "+row);
		
		//find no. of cells
		Row r = sheet.getRow(0);
		int cell = r.getPhysicalNumberOfCells();
		System.out.println("Total no. of cells: "+cell);
		
}
}