package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign9 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames");
		WebElement a1= driver.findElement(By.xpath("//body//input"));
       a1.sendKeys("Rohini");
       driver.findElement(By.xpath("//iframe[@id='frame3']")).click();
       WebElement a2=driver.findElement(By.xpath("//option[@value='avatar']"));
       a2.click();
		
	}

}
