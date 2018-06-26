package com.excelfiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_write {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file = new FileInputStream("C:\\Users\\srika\\Desktop\\Selenium course\\WebApplicationTesting\\src\\com\\excelfiles\\TestFile.xlsx");
		XSSFWorkbook work = new XSSFWorkbook(file);
		//XSSFSheet sheet = work.createSheet("Sheet2");
		XSSFSheet sheet= work.getSheet("Sheet1");
		Row r=sheet.createRow(3);
		Cell c= r.createCell(2);
		c.setCellValue("Lovely");
		FileOutputStream file1 = new FileOutputStream("C:\\Users\\srika\\Desktop\\Selenium course\\WebApplicationTesting\\src\\com\\excelfiles\\TestFile.xlsx");
		work.write(file1);
		
		
		

	}

}
