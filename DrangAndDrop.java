package seleniumProject;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class DrangDrop
{
	WebDriver driver;
	void test()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://demoqa.com/droppable");
			//
			Thread.sleep(3000);
			
			WebElement dragElement= driver.findElement(By.id("draggable"));
			WebElement dropElement= driver.findElement(By.id("droppable"));
			Actions action = new Actions(driver);
			
			action.dragAndDrop(dragElement, dropElement).build().perform();
			
			
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		finally {
			driver.close();
		}
			
	}
}

public class DrangAndDrop {

	public static void main(String[] args) {
		DrangDrop dd=new DrangDrop(); 
		dd.test();
		/*WebDriver driver=new ChromeDriver(); // driver jaake chrome se baat kriye
		
		driver.get("https://demoqa.com/droppable"); // jayiye google open 
		
		Thread.sleep(3000);
		
		WebElement dragElement= driver.findElement(By.id("draggable"));
		WebElement dropElement= driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		
		action.dragAndDrop(dragElement, dropElement).build().perform();
		
		
		action.dragAndDropBy(dragElement, 150, 150).build().perform();
		*/
		
	}

}
