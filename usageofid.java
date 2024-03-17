package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfId {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement emailTextField = driver.findElement(By.id("email"));
	emailTextField.sendKeys("Qspders");
	WebElement passwordTextField = driver.findElement(By.id("pass"));
	passwordTextField.sendKeys("123");
	WebElement loginButton = driver.findElement(By.name("login"));
	loginButton.click();
	
	
	
}
} 
