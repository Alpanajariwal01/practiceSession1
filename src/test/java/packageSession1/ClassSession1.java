package packageSession1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ClassSession1 {

	public static void main(String[] args) throws InterruptedException {
		// openbrowser
		WebDriver driver = new ChromeDriver();
		//openURL
		driver.get("https://practicetestautomation.com/practice-test-login/");
		//login
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		Thread.sleep(10000);
		//Close browser
		driver.quit();
	
	}

}
