package Pomproject.Pomproject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PsignupTest {
	
  @Test
  public void registerButton() throws InterruptedException {
         System.setProperty("webdriver.chrome.driver","C:/Users/vaishnavi.reddy/Downloads/chromedriver_win32/chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         
         PlandingTest landingpage2 = new PlandingTest(driver);
         landingpage2.goTo();
         Thread.sleep(1000);
         landingpage2.registerButton("Vaishnavi","Reddy","vaishnavi@gmail.com","vaishu18" ,"06/08/2001","8989674534","Welcome to Qualitest");
     
    }
}

