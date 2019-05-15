import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String baseURL = "https://letskodeit.teachable.com/p/practice";
		WebDriver driver;
		System.setProperty("webdriver.ie.driver", "C:/Users/a86233/Desktop/Selenium/IEDriverServer.exe");
		
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);
	}

}
