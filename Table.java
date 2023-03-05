package seleniumProject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://datatables.net/examples/basic_init/zero_configuration.html"); // it will open  the page
		Thread.sleep(3000);
		
		
	    driver.findElement(By.xpath("//option[@value='50']")).click();
	 // action : get the text  present in the table data to verify 
	 		WebElement elementDriver = driver.findElement(By.xpath("//input[@type='search']"));
	 	    String nameString=	elementDriver.getText();
	 		Assert.assertEquals("rohini",nameString);
	 		elementDriver.sendKeys("Ashton Cox");
	 	      // press ENTER
	 		elementDriver.sendKeys(Keys.RETURN);

	}

}
