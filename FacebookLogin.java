package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("rashinkarrohini2112@gmail.com");
  		WebElement password=driver.findElement(By.id("pass"));
  		password.sendKeys("Riyansh@1012");
  		WebElement login=driver.findElement(By.name("login"));
  		login.click();
  		//login.sendKeys(Keys.ENTER);
		
		
		
		
		
        //driver.close();
		
		
	}

}
