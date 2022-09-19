package Pomproject.Pomproject;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class TsignupTest {
		static {
			System.setProperty("webdriver.chrome.driver","C:/Users/vaishnavi.reddy/Downloads/chromedriver_win32/chromedriver.exe");
		}
	WebDriver driver;
		
	@Test	
	   public void launchBrowser() throws InterruptedException {
	    driver =  new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		driver.findElement(By.className("my-sm-0")).click();
		driver.findElement(By.linkText("Sign up")).click();
	    driver.findElement(By.id("myName")).sendKeys("Vaishnavi");	
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Reddy");
		driver.findElement(By.cssSelector("input[placeholder='Enter Email']")).sendKeys("vaishnavi@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("vaishnavi18");
		driver.findElement(By.cssSelector("input[type='date']")).sendKeys("08/09/2001");
	    driver.findElement(By.cssSelector("div[class='col-md-3'] input[name='gender']")).click();
		driver.findElement(By.cssSelector("input[placeholder='91XXXXXXXXXX']")).sendKeys("7624898249");
		driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']")).sendKeys("I love singing.");
		driver.findElement(By.className("btn-info")).click();	
	}
	
	
	

}
