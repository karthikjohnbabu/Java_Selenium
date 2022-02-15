
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelfIntroduction {

	public static void main(String[] args) {
		//Invoking Browser.
		//Chrome- ChromeDriver-> Extends-> Methods like close and get
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.udemy.com/");
		System.out.println(driver.getTitle());
		driver.close();
		
	}

}
