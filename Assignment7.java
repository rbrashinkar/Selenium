package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.Select;

public class Assignment7 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Lenovo/Downloads/Thirteen%20(1).html");
		WebElement name =driver.findElement(By.name("name"));
		name.sendKeys("Rohini");
		WebElement uname =driver.findElement(By.name("userName"));
		uname.sendKeys("Rohi");
		WebElement pass =driver.findElement(By.name("password"));
		pass.sendKeys("Riyansh");
		WebElement rpass =driver.findElement(By.name("re-EnterPassword"));
		rpass.sendKeys("Riyansh");
		WebElement addr=driver.findElement(By.name("address"));
		addr.sendKeys("Pune");
		driver.findElement(By.xpath("//input[@value='female']")).click();
		WebElement ddElement=  driver.findElement(By.xpath("//select[@name='districtName']"));
		Select select = new Select(ddElement); 
		select.selectByIndex(3);
		//driver.findElement(By.xpath("//option[@value='Salem']")).click();
		driver.findElement(By.xpath("//input[@value='wedding']")).click();
		driver.findElement(By.xpath("//input[@value='social']")).click();
		driver.findElement(By.name("register")).click();
		
		Thread.sleep(1000);
		driver.close();

	}

}
