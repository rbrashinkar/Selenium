package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Lenovo/Downloads/TenthhAssignment%20(3).html");
		WebElement elementDriver = driver.findElement(By.xpath("//input[@id='StockName']"));
    	elementDriver.sendKeys("caffeine");
	 	      // press ENTER
	 		elementDriver.sendKeys(Keys.RETURN);
		//driver.close();

	}

}
