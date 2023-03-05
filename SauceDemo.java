package seleniumProject;

import org.apache.xalan.templates.ElemText;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.Saucedemo.com");
		//driver.get("file:///C:/Users/Lenovo/Downloads/FirstAssignment.html");
		//String urlString= driver.getCurrentUrl();
		//System.out.println(urlString);
		//WebElement element=driver.findElement(By.tagName("h1"));
		//String string=element.getText();
		//System.out.println(string);
		driver.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
		
		//if(urlString.equals("https://www.saucedemo.com/inventory.html"))
		{
			//System.out.println("test case pass");
		}
		/*WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
  		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
  		WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
  	
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();*/
		//driver.close();
	}

}
