package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChangeButtonName {
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://uitestingplayground.com/textinput");
		
		WebElement name = driver.findElement(By.id("newButtonName"));
        name.sendKeys("Rohini");
        WebElement i1 = driver.findElement(By.xpath("//button[@id='updatingButton']"));
    	i1.click();
        Thread.sleep(3000);
		driver.close();
		
	}

}
