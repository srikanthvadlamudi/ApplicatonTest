package com.exceloperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readcelldata {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\srika\\Desktop\\TestFile.xlsx");
       XSSFWorkbook workbook = new XSSFWorkbook("file");
	XSSFSheet Sheet = workbook.getSheet("Sheet1");
	Row x = Sheet.getRow(0);
    Cell y = x.getCell(0);
	String data = y.getStringCellValue();
	System.out.println(data);
	}

}
