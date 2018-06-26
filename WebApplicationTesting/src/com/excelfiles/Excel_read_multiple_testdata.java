package com.excelfiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_read_multiple_testdata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file = new FileInputStream("C:\\Users\\srika\\Desktop\\TestFile.xlsx");
		XSSFWorkbook work = new XSSFWorkbook(file);
		XSSFSheet sheet = work.getSheet("Sheet1");
		int Rownumber =sheet.getLastRowNum();
		for( int i =0 ;i<=Rownumber;i++)
		{
		Row rw=	sheet.getRow(i);
		int Cellcount = rw.getLastCellNum();
		for(int x= 0;x<Cellcount;x++)
		{
			Cell y = rw.getCell(x);
			String data = y.getStringCellValue();
			System.out.print(data+"   ");
		}
		System.out.println();
		}
		

	}

}
