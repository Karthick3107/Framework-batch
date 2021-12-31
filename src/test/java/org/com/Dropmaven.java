package org.com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropmaven {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement skills = driver.findElement(By.id("Skills"));
		
		Select select = new Select(skills);
		
     List<WebElement> options = select.getOptions();
     
for (WebElement webElement : options) {
	System.out.println(webElement.getText());
	
}		

 File file = new File("C:\\Users\\Karthick\\eclipse-workspace\\Maven\\Excel\\Book11.xlsx");
 
 Workbook workbook = new XSSFWorkbook();
 
 Sheet sheet1 = workbook.createSheet("auto");
//row
 for (int i = 0; i < options.size(); i++) {
	WebElement element = options.get(i);
	String txt = element.getText();
	Row createRow = sheet1.createRow(i);
	
	//cell
	for (int j = 0; j < 1; j++) {
		Cell createCell = createRow.createCell(j);
		
		createCell.setCellValue(txt);
	}
	
}
 FileOutputStream stream = new FileOutputStream(file);
 
   workbook.write(stream);
   
   System.out.println("done");
   

 

	}
	

}
