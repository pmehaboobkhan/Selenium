import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitTypes {
	WebDriver driver;
	String baseURL;
	String expURL;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver","C:/Users/a86233/Desktop/Selenium/geckodriver.exe");
		driver=new FirefoxDriver();
		baseURL="https://letskodeit.teachable.com/p/practice";
		expURL = "https://www.expedia.com";
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}


	@Test
	public void test() throws Exception {

		driver.get(baseURL);
		WebElement loginLink= driver.findElement(By.linkText("Login"));
		loginLink.click();
		WebDriverWait wait = new WebDriverWait(driver,3);
		WebElement emailField=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_email")));
		
		
		
		
		driver.findElement(By.id("user_email")).sendKeys("test");
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
		
	}

}
