package Sample;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:/Users/a86233/Desktop/Selenium/geckodriver.exe");
		String baseURL= "https://letskodeit.teachable.com/p/practice";
		DesiredCapabilities caps= DesiredCapabilities.firefox();
		caps.setBrowserName("firefox");
		caps.setPlatform(Platform.MAC);
		
		driver = new FirefoxDriver(caps);
		driver.manage().window().maximize();
		driver.get(baseURL);
			
		
	}



}
