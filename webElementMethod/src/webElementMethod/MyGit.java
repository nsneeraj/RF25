package webElementMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyGit {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
}
	@Test
		public void display() {
		
		WebDriver driver = new ChromeDriver();
		driver.quit();
	}

}
