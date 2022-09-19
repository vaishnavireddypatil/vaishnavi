package Pomproject.Pomproject; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PsigninTest {
@Test


public void setup() throws InterruptedException {
    
        System.setProperty("webdriver.chrome.driver","C:/Users/vaishnavi.reddy/Downloads/chromedriver_win32/chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         
         PlandingTest landingpage = new PlandingTest(driver); 
         landingpage.goTo();
         landingpage.signin("vaishnavi","vaishu18");
         Thread.sleep(2000);
}
}