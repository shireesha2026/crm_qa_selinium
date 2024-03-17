package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NamePriority {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/signup/");
   //WebElement firstNameTextField=driver.findElement(By.name("firstname"));
   //firstNameTextField.sendKeys("selenium");
	   WebElement firstNameTextField=driver.findElement(By.cssSelector("input[ name='reg_email__']"));
	   firstNameTextField.sendKeys("selenium");
   driver.close();
   
}
}
