package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Lenovo/Downloads/alertTest%20(1).html");
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
		//2nd
		driver.navigate().to("file:///C:/Users/Lenovo/Downloads/confirmTest%20(1).html");
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		

	}

}
