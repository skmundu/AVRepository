package com.semantic.excelstudies;

import java.io.*;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.Test;

public class ExcelReader {

	
	static XSSFWorkbook wbfis;
	static XSSFWorkbook wbfos;
	static XSSFSheet sh;
	static XSSFRow row;
	static FileInputStream fis;
	static FileOutputStream fos;
	static File file;
	
	
	public static void main(String[] args) throws IOException {
		
		file =new File("E:\\SeleniumFiles\\NewDataDriverProject\\antivirus\\src\\main\\java\\com\\semantic\\excelstudies\\DataFile.xlsx");
		fis=new FileInputStream(file);
		

		wbfis=new XSSFWorkbook(fis);
		
		
		sh=wbfis.getSheetAt(0);
		
		int rowCount=sh.getLastRowNum()-sh.getFirstRowNum();
		
		for(int i=1;i<=rowCount;i++)
		{
			System.out.println(sh.getRow(i).getCell(0).getStringCellValue());
			row=sh.getRow(i);
			updateResult(sh.getRow(i).getCell(0).getStringCellValue().length());
			
			
		}
		
		fos= new FileOutputStream(file);
		wbfis.write(fos);
				
		
	
	}

	
	public static void updateResult(int len)
	{
		
		CellStyle style=wbfis.createCellStyle();
		
		if(len<5)
		{
		style.setFillForegroundColor(IndexedColors.RED.getIndex());
		row.createCell(2).setCellValue("Failed");
		}
		else
		{
			style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
			//row.createCell(columnIndex)
			row.createCell(2).setCellValue("Passed");
		}
		
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		XSSFCell cell1=row.getCell(2);
		
		cell1.setCellStyle(style);
		
	}
	
	
}
