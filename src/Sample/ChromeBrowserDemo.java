package Sample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String baseURL = "https://letskodeit.teachable.com/p/practice";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:/Users/a86233/Desktop/Selenium/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);
	}

}
