package seleniumProject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
public class SearchGoogle {
	
		public static void main(String[] args) throws InterruptedException
		{
	        // type of driver             location of drivre
			//System.setProperty("webdriver.chrome.driver", "D:\\training module\\cd\\chromedriver.exe");

	      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();  // this will untill we are telling where our downloaded driver is 
	      driver.get("https://www.google.com");
	     WebElement searchBox= driver.findElement(By.name("q"));
	     searchBox.click();
	     
	     searchBox.sendKeys("manual testing");  //typing
	     searchBox.sendKeys(Keys.RETURN); //sending the command to enter
	     
	     Thread.sleep(3000);
	     driver.close();




	}

	}


