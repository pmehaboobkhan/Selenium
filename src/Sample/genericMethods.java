package Sample;
import org.openqa.selenium.*;

public class genericMethods {

	WebDriver driver;
	
	public genericMethods(WebDriver driver){
		this.driver=driver;		
	}
	
	public WebElement getElement(String locator, String type){
		type=type.toLowerCase();
		if(type.equals("id")){
			System.out.println("Element found with ID" + type);
			return this.driver.findElement(By.id(locator));		
		}
		
		else if (type.equals("xpath")) {
			
			
		}
			
		
	}
}
