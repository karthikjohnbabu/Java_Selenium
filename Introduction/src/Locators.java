import java.sql.Time;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.id("inputUsername")).sendKeys("karthik");
	driver.findElement(By.name("inputPassword")).sendKeys("hello123");
	driver.findElement(By.className("signInBtn")).click();
	System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	driver.findElement(By.linkText("Forgot your password?")).click();
	driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
	driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("karthikjohnbabu@gmail.com");
    driver.findElement(By.xpath("//form/input[3]")).sendKeys("9738503637");
    Thread.sleep(3000);
    driver.findElement(By.className("reset-pwd-btn")).click();
    System.out.println(driver.findElement(By.cssSelector("form p")).getText());
    driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
    Thread.sleep(1000);
	driver.findElement(By.cssSelector("#inputUsername")).sendKeys("karthik");
	driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
	driver.findElement(By.id("chkboxOne")).click();
	driver.findElement(By.xpath("//button[contains(@class,\"submit signInBtn\")]")).click();
	
	}

}
