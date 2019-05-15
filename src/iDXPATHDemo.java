import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class iDXPATHDemo {

	public static void main(String[] args){
		
		System.setProperty("webdriver.gecko.driver","C:/Users/a86233/Desktop/Selenium/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();		
		String baseURL= "https://demostore.x-cart.com";
		driver.manage().window().maximize();
		driver.get(baseURL);
		
		//driver.findElement(By.id("gs_htif0")).sendKeys("letskodeit");
		//driver.findElement(By.xpath(".//*[@id='_fZl']")).click();
		driver.findElement(By.tagName("span")).click();
				
	}
}
