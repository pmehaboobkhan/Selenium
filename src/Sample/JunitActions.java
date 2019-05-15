package Sample;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class JunitActions {

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
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
	}	
	
	@Test
	public void testLetsKodeit() throws InterruptedException {
		driver.get(baseURL);
		WebElement textBox = driver.findElement(By.id("displayed-text"));
		System.out.println("Text Box displayed: " + textBox.isDisplayed());
		Thread.sleep(2000);
		
		driver.findElement(By.id("hide-textbox")).click();
		Thread.sleep(2000);
		System.out.println("Text Box displayed: " + textBox.isDisplayed());
		Thread.sleep(2000);
		driver.findElement(By.id("show-textbox")).click();
		Thread.sleep(2000);
		System.out.println("Text Box displayed: " + textBox.isDisplayed());
		Thread.sleep(2000);		
		
		
		WebElement elmnt = driver.findElement(By.id("multiple-select-example"));
		Select sl= new Select(elmnt);
		
		Thread.sleep(2000);
		sl.selectByValue("orange");
		Thread.sleep(2000);
		sl.deselectByValue("orange");
		Thread.sleep(2000);
		sl.selectByIndex(2);
		Thread.sleep(2000);
		sl.selectByVisibleText("Apple");
		Thread.sleep(2000);
		List<WebElement> selectedOptions = sl.getAllSelectedOptions();
		for(WebElement option : selectedOptions){
			System.out.println(option.getText());
			
		}
		Thread.sleep(2000);
		sl.deselectAll();
		Thread.sleep(2000);
		
		
		
		
		WebElement element= driver.findElement(By.id("carselect"));
		Select sel= new Select(element);
		sel.selectByValue("benz");
		Thread.sleep(2000);
		sel.selectByVisibleText("BMW");
		Thread.sleep(2000);
		sel.selectByIndex(2);
		Thread.sleep(2000);
		
		List<WebElement> options=sel.getOptions();
		int sizeoflist= options.size()	;	
				
		for (int j=0; j<sizeoflist; j++){
			String optionName= options.get(j).getText();
			System.out.println("OptionNames are " + optionName);
		}
		
		boolean isChecked=false;				
		List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@type='radio']"));
		int size= radioButtons.size();
		System.out.println("Size of the list:" + size);
		for (int i=0; i<size; i++){
			isChecked= radioButtons.get(i).isSelected();
			
			if(!isChecked){
				radioButtons.get(i).click();
				Thread.sleep(2000);
			}			
		}
		
		

	}
	
	@Test
	public void expTest() throws InterruptedException {
		driver.get(expURL);
		WebElement childDropDown = driver.findElement(By.id("package-1-age-select-1-hp-package"));
		System.out.println("Child Dropdown displayed: " + childDropDown.isDisplayed());
		
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}



}
