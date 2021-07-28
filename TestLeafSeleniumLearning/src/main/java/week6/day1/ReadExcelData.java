				package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	
//throws IO exception-to deal with external file
	public String[][] readExcel(String fileName) throws IOException {
		
		//to get into the workbook we need to  give the location
		//XSSFWorkbook wb = new XSSFWorkbook("C:\Selenium\Selenium\TestLeafSeleniumLearning\Data\CreateLead.xlsx");
		
		//instead of giving absolute path we can give relative path ./ [./represents route directory]
		//XSSFWorkbook is the class name for .xlsx files. HSSFWorkbook is for .xls file
		//to get into create lead xlsx file
		//XSSFWorkbook wb = new XSSFWorkbook("./Data/CreateLead.xlsx");
		
		//instead of hard cording, we can give generic value so that can open any file we want. the above can be written as
		XSSFWorkbook wb = new XSSFWorkbook("./Data/"+fileName+".xlsx");
		
		//to get into the worksheet
		XSSFSheet ws = wb.getSheet("Sheet1");	
		
		//WE NEED TO PRINT THE VALUE IN SECOND ROW FIRST CELL
		//to get into the row- to get into 2nd row we need to give 1 as index; 
		XSSFRow row = ws.getRow(1);
		
		//in that second row, we need to get into first cell
		XSSFCell cell = row.getCell(0);
		
		//now to print the data in the 2nd row, 1 st cell
		String cellValue = cell.getStringCellValue();
		System.out.println(cellValue);
		System.out.println("-----------------------");
		
		//easy way of getting first cell value in 2nd row- ws.getRow(1).getCell(0).getStringCellValue();
		//if there is an integer value in the cell then we need to use cell.getNumericCellValue();
		//if there is single quote before the number in excel sheet then we can treat this as a string. '1234 we can treat it as string
		
		//to get the number of rows excluding header row .getLastRowNum()-it excludes the first row count automatically
		int rowCount = ws.getLastRowNum();
		System.out.println(rowCount);
		System.out.println("-----------------------");
		
		//to get the cell count
		//to get number of cells in first row
		int cellCount = ws.getRow(0).getLastCellNum();
		System.out.println(cellCount);
		System.out.println("-----------------------");
		
		//to get row count including the first row
		//int rowCount = ws.getPhysicalNumberOfRows();
		
		//to print first cell in each row
		for (int i = 0; i<=rowCount; i++) {
			XSSFRow row1 = ws.getRow(i);
			XSSFCell cell1 = row1.getCell(0);
			String firstColoumn = cell1.getStringCellValue();
		System.out.println(firstColoumn);
			
			}
		
		System.out.println("------------------------------");
		
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < cellCount; j++) {
				String cellValue1 = ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println(cellValue1);
			}
		}
			
		//declare 2 dimensional array to save data from excel and pass it on to create lead6 class to run 
		//String[][] data = new String[2][3];
		
		//we can make two dimensional array dynamic
		
		String[][] data = new String[rowCount][cellCount];
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < cellCount; j++) {
				String cellValue1 = ws.getRow(i).getCell(j).getStringCellValue();
		            data[i-1][j] = cellValue1;
			}
		}	
		
		//to close the workbook
				wb.close();
				return data;

	}

}

