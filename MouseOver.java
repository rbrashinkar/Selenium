package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class MouseOver {
	public static void main(String[] ag)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.opencart.com/"); //it will open  the page
		
 
		
		/*WebElement basicele = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement nextele = driver.findElement(By.xpath("//a[normalize-space()='PC (0)']"));
		//System.out.println(1);	
		
		// chain of actions are going on  always focus on series of action .. use perform
		//  clicking desktop ... go to pc elem ... click on pc
		// mouse hover desktop  ... go to pc elem ... click
		Actions actions =  new Actions(driver);
		
		actions.moveToElement(basicele).moveToElement(nextele).click().perform(); */
		WebElement basic1 = driver.findElement(By.xpath("//a[normalize-space()='Laptops & Notebooks']"));
		WebElement next1 = driver.findElement(By.xpath("//a[normalize-space()='Macs (0)']"));
		Actions actions1 =  new Actions(driver);
		actions1.moveToElement(basic1).moveToElement(next1).click().perform();
		String actualString =driver.findElement(By.xpath("//h2[normalize-space()='Macs']")).getText();
		Assert.assertEquals("Macs",actualString);
		driver.findElement(By.xpath("//a[normalize-space()='Continue']")).click();
		//to perform Scroll on application using Selenium
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		driver.findElement(By.xpath("//img[@title='MacBook']")).click();
		
		/*
		 * WebElement MacBook=driver.findElement(By.xpath("//img[@title='MacBook']"));
			actions.click(MacBook).build().perform();
		 */
		
		// build .. perform
		
		//System.out.println(2);
	}

}
