package Pomproject.Pomproject;

	import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

  public class PlandingTest {
    WebDriver driver;
	       
  public PlandingTest(WebDriver driver)
    {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
	 }
  
  /*public void goTo()
         {
		    driver.get("https://mobileworld.banyanpro.com/");
		 }    */
		
  //Sign Up
	@FindBy(css="button.btn.btn-warning.my-2.my-sm-0")
	  WebElement Signin;
	  
	@FindBy(linkText="Sign up")
	  WebElement Signup;
	  
	@FindBy(className="form-control")
	  WebElement FirstName;
	       
	@FindBy(xpath="//input[@placeholder='Last Name']")
	  WebElement  LastName;  
	    
	@FindBy(css="input[type='Email']")
	  WebElement Emailid;
	       
	@FindBy(xpath="//input[@placeholder='Password']")
	  WebElement passworde;
	       
	@FindBy(css="input[type='date']")
	  WebElement calender;
	       
	@FindBy(css="div[class='col-md-3'] input[name='gender']")
	  WebElement gender;
	  
	@FindBy(css="input[placeholder='91XXXXXXXXXX']")
	  WebElement numberr;
	  
	@FindBy(xpath="//textarea[@placeholder='Short Bio']")
	  WebElement bio;
	  
	@FindBy(className="btn-info")
	  WebElement register;
	
	//Sign In
	
	@FindBy(className="my-sm-0")
	   WebElement signin;         
	   
	@FindBy(css="#username")
	   WebElement username;
	   
	@FindBy(name="password")
	   WebElement password;
	   
	@FindBy(css="label.custom-control-label")
	   WebElement rememberme;
	   
	@FindBy(className="btn-primary")
	   WebElement login;
	
// contact Us 
	
	  @FindBy(linkText="Support")
	    WebElement support;
	    
	    @FindBy(linkText="Contact Us")
	    WebElement contactus;
	   
	    @FindBy(css="input[placeholder='Username']")
	    WebElement user;
	    
	    @FindBy(css="input[placeholder='Email']")
	    WebElement Email;
	    
	    @FindBy(css="input[placeholder='Phone']")
	    WebElement Phone;
	    
	    @FindBy(css="textarea[placeholder='Message']")
	    WebElement message;
	    
	    @FindBy(css="input[type='submit']")
	    WebElement submit;
	
   //action
	    
	    
	    public void goTo()
        {
		    driver.get("https://mobileworld.banyanpro.com/");
		 } 
		   
	public void registerButton(String name,String lname,String email,String password,String date,String number,String text)
	{
	     Signin.click();
	     Signup.click();
	     FirstName.sendKeys(name);
	     LastName.sendKeys(lname);
	     Emailid.sendKeys(email);
	     passworde.sendKeys(password);
	     calender.sendKeys(date);
	     gender.click();
	     numberr.sendKeys(number);
	     bio.sendKeys(text);
	     register.click();
	}

  
  public void signin(String user1,String pass)
	{ 
	    Signin.click();
	    username.sendKeys(user1);
	    password.sendKeys(pass);
	    rememberme.click();
	    login.click();
	}
  
  
 public void contactusPage(String username1, String Email1, String Phone1, String message1) throws InterruptedException
	{
 	   support.click();
 	    contactus.click();
 	    
 	   String parenthandle = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for(String handel : handles) {
	       if(!handel.equals(parenthandle)) {
	    	   driver.switchTo().window(handel);
	    	   driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Vaishnavi Reddy");
	    	   driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("vaishnavi@gmail.com");
	    	   driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("7624898249");
	    	   driver.findElement(By.xpath("//textarea[@placeholder='Message']")).sendKeys("I don't want");
	    	   Thread.sleep(2000);
	    	   driver.findElement(By.className("btn")).click(); 
	       }
		}
 	   /* Set<String> id = driver.getWindowHandles();
        java.util.Iterator<String> it = id.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
        driver.manage().window().maximize();
        
	    user.sendKeys(username1);
	    Email.sendKeys(Email1);
	    Phone.sendKeys(Phone1);
	    message.sendKeys(message1);
	    submit.click();*/
	}
	    
	 
	}
  
  
  