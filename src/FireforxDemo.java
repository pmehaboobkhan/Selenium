import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebDriver;;
public class FireforxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:/Users/a86233/Desktop/Selenium/geckodriver.exe");
		driver = new FirefoxDriver();
		String baseURL="http://www.google.com";
				
				driver.get(baseURL);
		

	}

}
