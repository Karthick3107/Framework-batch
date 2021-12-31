package org.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.SystemUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenDate {
public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
	File f=new File("C:\\Users\\Karthick\\eclipse-workspace\\Maven\\Excel\\Table.xlsx");
	FileInputStream stream1 = new FileInputStream(f);
	Workbook wbook = new XSSFWorkbook(stream1);
	Sheet sh = wbook.getSheet("Sheet1");
	for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {
		Row row = sh.getRow(i);
		
		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
			Cell cell = row.getCell(j);			
	int type1 = cell.getCellType();
	if (type1==1) {
		
		String date1 = cell.getStringCellValue();
		System.out.println(date1);
		
	}
		if (type1==0) {
	  if (DateUtil.isCellDateFormatted(cell)) {
	//	 Date date1 = cell.getDateCellValue();
   String date1 = new SimpleDateFormat("dd/MMM/yy").format(cell.getDateCellValue());
		 System.out.println(date1);
		  
	  }
	  else {
		
		  double d = cell.getNumericCellValue();
		  long l = (long)d;
		  String data2 = String.valueOf(l);
		  System.out.println(data2);
	}
		}
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
	}
}
	
	
}
