package com.Bectron.Flixpert.genericutility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Cell;

public class ExcelUtility {
public String readTheString(String sheetName,int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("src/test/resource/ContentExcel.xlsx");
	Workbook workbook=WorkbookFactory.create(fis);
	Sheet sheet=workbook.getSheet(sheetName);
	Row row=sheet.getRow(rowIndex);
	Cell cell=row.getCell(cellIndex);
	String value=cell.getStringCellValue();
	return value;	
}
public double readThedoubleNumberData(String sheetName,int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("src/test/resource/ContentExcel.xlsx");
	Workbook workbook=WorkbookFactory.create(fis);
	Sheet sheet=workbook.getSheet(sheetName);
	Row row=sheet.getRow(rowIndex);
	Cell cell = row.getCell(cellIndex);
	double value = cell.getNumericCellValue();
	return value;
	
}
public long readTheLongNumericData(String sheetName,int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("src/test/resource/ContentExcel.xlsx");
	Workbook workbook=WorkbookFactory.create(fis);
	Sheet sheet=workbook.getSheet(sheetName);
	Row row=sheet.getRow(rowIndex);
        Cell cell  = row.getCell(cellIndex);
        double value = cell.getNumericCellValue();
        long longvalue=(long)value;
        return longvalue;

}
}

