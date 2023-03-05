package seleniumProject;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownwithSelect {
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
       driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		Thread.sleep(3000); // adding extra wait  let the element load properly on page
		WebElement ddElement=  driver.findElement(By.xpath("//select[@id='first']")); // id was not working
		Select select = new Select(ddElement); // it is param const : it wil created with some value
		select.selectByIndex(3);
		Thread.sleep(2000);
		select.selectByValue("Microsoft"); // yes bing in not a value 
		Thread.sleep(2000);
		select.selectByVisibleText("Iphone");
		
		
		
		List <WebElement> listoptions=select.getOptions();
		for (WebElement webElement : listoptions) {
			
			System.out.println(webElement.getText()); // taking the text of every element present there inside the slect option
		}
		
		WebElement ddElement1=  driver.findElement(By.xpath("//select[@id='animals']"));
		Select select1 = new Select(ddElement1);
		select1.selectByIndex(3);
		Thread.sleep(2000);
		select1.selectByValue("Baby Cat");
		Thread.sleep(2000);
		select.selectByVisibleText("Avatar");
		List <WebElement> listoptions1=select1.getOptions();
		for (WebElement webElement : listoptions1) {
			
			System.out.println(webElement.getText()); // taking the text of every element present there inside the slect option
		} 
		
		
		WebElement ddElement2=  driver.findElement(By.xpath("//select[@id='second']"));
		Select select2 = new Select(ddElement2);
		select2.selectByIndex(1);
		Thread.sleep(2000);
		select2.deselectByIndex(1);

		Thread.sleep(3000);
		driver.close();
	}

}
