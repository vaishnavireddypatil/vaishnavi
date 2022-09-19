package Pomproject.Pomproject;

	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class TcontactusTest {
		static {
			System.setProperty("webdriver.chrome.driver","C:/Users/vaishnavi.reddy/Downloads/chromedriver_win32/chromedriver.exe");
		}
	WebDriver driver;
		
	@Test	
	   public void launchBrowser() throws InterruptedException {
	    driver =  new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		driver.findElement(By.linkText("Support")).click();
		driver.findElement(By.linkText("Contact Us")).click();
		String parenthandle = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for(String handel : handles) {
	       if(!handel.equals(parenthandle)) {
	    	   driver.switchTo().window(handel);
	    	   driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Vaishnavi Reddy");
	    	   driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("vaishnavi@gmail.com");
	    	   driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("7624898249");
	    	   driver.findElement(By.xpath("//textarea[@placeholder='Message']")).sendKeys("I don't want");
	    	   driver.findElement(By.className("btn")).click();
	       }
		}
	}
}
