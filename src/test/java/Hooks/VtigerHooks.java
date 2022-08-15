package Hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VtigerHooks {
	WebDriver driver;
	@Before
	public void lunachBrowser() {
		System.out.println("browser lanuch");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://localhost:8888");
	}
  @After
  public void closeTheBrowser() {
	  System.out.println("browserclosed");
	  driver.quit();
  }
}
