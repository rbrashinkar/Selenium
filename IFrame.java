package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		 // it will open  the page
		
		
		// case 1: element inside a single frame
		driver.findElement(By.xpath("//a[normalize-space()='Single Iframe']")).click();
		driver.switchTo().frame("singleframe");
		WebElement element=driver.findElement(By.xpath("//input[@type='text']"));
		element.sendKeys("hello");
		Thread.sleep(3000);
		element.clear();
		
		driver.switchTo().defaultContent();
		
		// case2: 
		driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
		WebElement outElement=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outElement);
		WebElement innerElement=driver.findElement(By.cssSelector("iframe[src='SingleFrame.html']"));
		driver.switchTo().frame(innerElement);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("frameinsideframe");
		
		
		/// case 3: come back back to default and type "SINGLE FRAME" in
		//driver.switchTo(). parentFrame();
		 driver.switchTo().defaultContent();
		 
		WebElement element1=driver.findElement(By.xpath("//input[@type='text']"));
		element1.sendKeys("Single frame");
		Thread.sleep(3000);
		element1.clear();
		

	}

}
