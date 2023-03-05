package seleniumProject;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class SwichWin {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[normalize-space()='Open New Tabbed Windows']")).click();
		driver.findElement(By.xpath("//a[@href='http://www.selenium.dev']//button[@class='btn btn-info'][normalize-space()='click']")).click();
		
		
		// case1 : 
		// it will get the id of current window
		String nameofWindowString  = driver.getWindowHandle();
		System.out.println(nameofWindowString);
		System.out.println(driver.switchTo().window(nameofWindowString).getTitle()); // once we use switch to we can get title
		
		// case2:  opening a tab
		/*Set<String> multipewindowSet= driver.getWindowHandles();
		
		for (String win : multipewindowSet) {
			System.out.println(win);
			String  nameString= driver.switchTo().window(win).getTitle();
			if(nameString.equals("Selenium"))
			{
				driver.findElement(By.xpath("//span[normalize-space()='Documentation']")).click();
			}
		}*/
		
		
		
		// case 3: open a new  seaparate new window
	   // driver.findElement(By.xpath("//a[normalize-space()='Open New Seperate Windows']")).click();
	   // driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
	    //case 4:open a new window
	    driver.findElement(By.xpath("//a[normalize-space()='Open Seperate Multiple Windows']")).click();
	    driver.findElement(By.xpath("//button[@onclick='multiwindow()']")).click();
		Thread.sleep(5000);
		driver.quit();
		}
	}
