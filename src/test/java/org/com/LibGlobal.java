package org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	WebDriver driver = null;

	public void chromedriver() {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();

	}
	
	public void loadurl() {
		driver.get("");
	}		
	
	public String currenturl() {
     String url = driver.getCurrentUrl();
     return url;
	}
	
	public String gettext(WebElement element) {
    String data = element.getText();
    return data;
	}
	
	public WebElement findElementById(String attributeValue) {
    WebElement element = driver.findElement(By.id(attributeValue));
    return element;
	}
	
	public WebElement findElementByName(String attributeValue) {
		WebElement element = driver.findElement(By.name(attributeValue));
		return element ;
		
	}
	
     
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
