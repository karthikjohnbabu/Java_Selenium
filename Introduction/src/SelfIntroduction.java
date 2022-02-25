
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelfIntroduction {

	public static void main(String[] args) {
		
		//Invoking Browser.
		//Chrome- ChromeDriver-> Extends-> Methods like close and get
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		//WebDriver methods + Class methods of chrome.
		//The Driver object will have the knowledge of only the 
		//Chrome driver implementation and not the personal class methods. 
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://rahulshettyacademy.com/#/index");
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
	}

}

