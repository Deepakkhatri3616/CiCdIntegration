package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ItemDisplayPage  extends BaseClass{
	public static WebElement element=null;
	public ItemDisplayPage(WebDriver driver) {
		super(driver);
	}
	
	//Click on New link to create New Item.
	public static WebElement lnkNew() {
		try {
			element=driver.findElement(By.xpath("//span[@data-label='New']"));
		}catch(Exception e) {
			throw e;
		}
		return element;
	}
	
	public static WebElement btnSave() {
		try {
			element=driver.findElement(By.xpath("//button[text()='Save']"));
		}catch(Exception e) {
			throw e;
		}
		return element;
	}
	
	public static WebElement errMsgMissingRequiredFields() {
		try {
			element=driver.findElement(By.
					xpath("//h4[contains(text(),'Missing Values Required')]"));
		}catch(Exception e) {
			throw e;
		}
		return element;
	}
	
	public static WebElement lstItemgroup() {
		try {
			element=driver.findElement(By.
					xpath("//li[contains(text(),'Item Group')]"));
		}catch(Exception e) {
			throw e;
		}
		return element;
	}
	
	public static WebElement lstItemCode() {
		try {
			element=driver.findElement(By.
					xpath("//li[contains(text(),'Item Code')]"));
		}catch(Exception e) {
			throw e;
		}
		return element;
	}

}
