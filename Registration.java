package seleniumProject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Registration {

    public static void main(String[] args) throws InterruptedException {

        // Set the path to the chrome driver executable
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Navigate to the registration page
        driver.get("https://magento.softwaretestingboard.com/customer/account/create/");

        // Enter registration information
        WebElement firstname = driver.findElement(By.id("firstname"));
        firstname.sendKeys("Rohini");

        WebElement lastname = driver.findElement(By.id("lastname"));
        lastname.sendKeys("Rashinkar");

        WebElement email = driver.findElement(By.id("email_address"));
        email.sendKeys("rashinkarrohini2112@gmail.com");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Password@123");

        WebElement confirm = driver.findElement(By.id("password-confirmation"));
        confirm.sendKeys("Password@123");

        // Submit the registration form
        WebElement submitButton = driver.findElement(By.xpath("//button[@title='Create an Account']//span[contains(text(),'Create an Account')]"));
        submitButton.click();

        // Wait for registration confirmation page to load
        WebElement confirmationMessage = driver.findElement(By.cssSelector(".page-title > h1"));
        if (confirmationMessage.getText().equals("Thank you for registering with Main Website Store.")) {
            System.out.println("Registration successful!");
        } else {
            System.out.println("Registration failed.");
        }

 		
		//Thread.sleep(2000);
		//driver.close(); // Close the browser
       
    }


}