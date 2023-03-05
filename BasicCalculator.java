package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicCalculator {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testsheepnz.github.io/BasicCalculator.html");
		
		WebElement no1 = driver.findElement(By.id("number1Field"));
        no1.sendKeys("4");
        WebElement no2 = driver.findElement(By.id("number2Field"));
        no2.sendKeys("5");
        WebElement dd2=driver.findElement(By.xpath("//option[normalize-space()='Multiply']"));
		dd2.click();
	     WebElement dd1=driver.findElement(By.cssSelector("#calculateButton"));
		 dd1.click();
		 driver.navigate().refresh();
		 Thread.sleep(1000);
		 //WebElement dd3=driver.findElement(By.xpath("//input[@id='clearButton'])"));
		 
		// WebElement dd4=driver.findElement(By.xpath("//input[@id='integerSelect']"));
		// dd4.click();
		// WebElement dd3=driver.findElement(By.cssSelector("#clearButton"));
		// dd3.click();
		
		 //for add
		 WebElement no3 = driver.findElement(By.id("number1Field"));
	        no3.sendKeys("7");
	        WebElement no4 = driver.findElement(By.id("number2Field"));
	        no4.sendKeys("3");
		 WebElement dd6=driver.findElement(By.xpath("//option[normalize-space()='Add']"));
			dd6.click();
		     WebElement dd7=driver.findElement(By.cssSelector("#calculateButton"));
			 dd7.click();
			 driver.navigate().refresh();
			 Thread.sleep(1000);
			 
			 
			 //for subtraction
			 WebElement no5 = driver.findElement(By.id("number1Field"));
		        no5.sendKeys("7");
		        WebElement no6 = driver.findElement(By.id("number2Field"));
		        no6.sendKeys("2");
			 WebElement dd8=driver.findElement(By.xpath("//option[normalize-space()='Subtract']"));
				dd8.click();
			     WebElement dd9=driver.findElement(By.cssSelector("#calculateButton"));
				 dd9.click();
				 driver.navigate().refresh();
				 Thread.sleep(1000);
				 //for concatnation....
				 WebElement no7 = driver.findElement(By.id("number1Field"));
			        no7.sendKeys("7");
			        WebElement no8 = driver.findElement(By.id("number2Field"));
			        no8.sendKeys("2");
				 WebElement dd10=driver.findElement(By.xpath("//option[normalize-space()='Concatenate']"));
					dd10.click();
				     WebElement dd11=driver.findElement(By.cssSelector("#calculateButton"));
					 dd11.click();
				 
				
			
		//  WebElement dd3=driver.findElement(By.cssSelector("#clearButton"));
		 
		 //Thread.sleep(1000);
		 //driver.close();
		 
		
	}

}
