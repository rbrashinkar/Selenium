package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		 // Set the path to the chrome driver executable
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");

	    // Create a new instance of the Chrome driver
	    WebDriver driver = new ChromeDriver();

	    // Navigate to the registration page
	    driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	    WebElement i = driver.findElement(By.xpath("//option[@value='donut']"));
		i.click();
		WebElement i1 = driver.findElement(By.xpath("//option[@value='burger']"));
		i1.click();

}
}
