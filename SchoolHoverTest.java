package Aspire;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SchoolHoverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();

	        // Navigating to the specified URL
	        driver.get("https://schooledn.py.gov.in/admission/hsc.html");

	        // Creating an Actions object for performing mouse actions
	        Actions actions = new Actions(driver);

	        WebElement admission = driver.findElement(By.xpath("//A[@href='#'][text()='Admission']/self::A"));

	          
	        WebElement school = driver.findElement(By.xpath("//A[@href='../admission/school.html'][text()='School']/self::A"));

	    
	        actions.click(admission).perform();
	     
	        actions.moveToElement(school).perform();

	        actions.click(school).perform();

	}

}