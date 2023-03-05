package seleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;


public class RadioButton {
	public static void main(String[] args) throws InterruptedException {
	 // Set the path to the chrome driver executable
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");

    // Create a new instance of the Chrome driver
    WebDriver driver = new ChromeDriver();

    // Navigate to the registration page
    driver.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");

	WebElement ieElement = driver.findElement(By.xpath("//input[@value='Mozilla']"));
	WebElement ieElement1 = driver.findElement(By.xpath("//input[@value='Opera']"));
	WebElement i = driver.findElement(By.xpath("//input[@value='red']"));
	i.click();
	WebElement i1 = driver.findElement(By.xpath("//input[@value='yellow']"));
	i1.click();
	WebElement i5 = driver.findElement(By.xpath("//input[@value='blue']"));
	i5.click();
	WebElement i2 = driver.findElement(By.xpath("//input[@value='orange']"));
	i2.click();
	WebElement i3 = driver.findElement(By.xpath("//input[@value='green']"));
	i3.click();
	WebElement i4 = driver.findElement(By.xpath("//input[@value='purple']"));
	i4.click(); 
	boolean  res= ieElement.isSelected();
	boolean  res1= ieElement1.isSelected();
	//System.out.println(res);
	if(!res) // if value is false means element not selected  
	{
	ieElement.click();
	}
	if(!res1) // if value is false means element not selected  
	{
	ieElement1.click();
	} 
	 List< WebElement> atags=      driver.findElements(By.tagName("input")); // return  multiple elements
	   
	 if(atags.size() != 0)
	 {
		 System.out.println(atags.size() + " Elements found by TagName as input \n");
	   for (WebElement ele : atags) {
		
		// System.out.println( ele.getText()+"1");
		   
		 System.out.println(ele.getAttribute("placeholder"));
		 System.out.println(ele.getText());
   	}
	 }
	
	Thread.sleep(3000);
	driver.close();
	}
}
