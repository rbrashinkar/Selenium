package seleniumProject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {
	public static void main(String[] args) 
	{
        // type of driver             location of drivre
		//System.setProperty("webdriver.chrome.driver", "D:\\training module\\cd\\chromedriver.exe");

      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();  // this will untill we are telling where our downloaded driver is 
      driver.get("https://www.google.com");




}

}
