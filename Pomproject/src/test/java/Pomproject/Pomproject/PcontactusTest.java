package Pomproject.Pomproject;
  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PcontactusTest {
  
	@Test
	public void setup() throws InterruptedException{
         System.setProperty("webdriver.chrome.driver","C:/Users/vaishnavi.reddy/Downloads/chromedriver_win32/chromedriver.exe");
         WebDriver driver = new ChromeDriver();

         PlandingTest landingpage3 = new PlandingTest(driver); 
         landingpage3.goTo();
         landingpage3.contactusPage("vaishnavi ", "vaishnavi@gmail.com", "7624898249", "I don't need");
        
  }
    
}
