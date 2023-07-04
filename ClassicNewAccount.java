package salesforceclassic.salesforce;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class ClassicNewAccount {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		driver.findElement(By.id("Login")).click();
		WebElement a = driver.findElement(By.xpath("//span[text()='View profile']"));
		driver.executeScript("arguments[0].click();", a);
		WebElement b = driver.findElement(By.xpath("//a[text()='Switch to Salesforce Classic']"));
		driver.executeScript("arguments[0].click();", b);
		WebElement z = driver.findElement(By.xpath("//img[@title='All Tabs']"));
		driver.executeScript("arguments[0].click();", z);
		driver.findElement(By.xpath("//div[@class='createNewModule sidebarModule']")).click();
		WebElement c = driver.findElement(By.xpath("//a[@class='accountMru menuButtonMenuLink']"));
		driver.executeScript("arguments[0].click();", c);
		WebElement y = driver.findElement(By.xpath("//input[@name='acc2']"));
		y.sendKeys("BootCamp_Puppeteer_Iswarya");
		  
	    driver.findElement(By.xpath("//textarea[@id='acc17street']")).sendKeys("Surya nagar street");
	    
	    driver.findElement(By.xpath("//input[@name='acc17city']")).sendKeys("Chennai");
	   
	    driver.findElement(By.xpath("//input[@name='acc17state']")).sendKeys("Tamilnadu");
	   
	    driver.findElement(By.xpath("//input[@name='acc17zip']")).sendKeys("600100");
	    
	    driver.findElement(By.xpath("(//input[@name='acc17country'])[1]")).sendKeys("India");
	    
	    WebElement z1 = driver.findElement(By.xpath("//a[text()='Copy Billing Address to Shipping Address']"));
		driver.executeScript("arguments[0].click();", z1);
		
	  
		
		WebElement d = driver.findElement(By.xpath("((//span[@class='dateInput dateOnlyInput'])[1])/input"));
		driver.executeScript("arguments[0].click();", d);
		d.clear();
		d.sendKeys("7/17/2023");
		 
	    WebElement v = driver.findElement(By.xpath("(//input[@title='Save'])[1]"));
	    driver.executeScript("arguments[0].click();", v);
	    
	    String actual_Result=driver.findElement(By.xpath("//div[@id='acc18_ileinner']")).getText();
	    String actual_Result1=driver.findElement(By.xpath("//div[@id='acc18_ileinner']")).getText();
	    
		String expected_Result=actual_Result;
		Assert.assertEquals(expected_Result,actual_Result1);
		System.out.println(actual_Result1);
	    
	    String actual_Result11=driver.findElement(By.xpath("(//a[@class='accountMru'])[1]")).getText();
		String expected_Result11=actual_Result11;
		Assert.assertEquals(actual_Result11,expected_Result11);
		System.out.println(actual_Result11);
	
		WebElement s = driver.findElement(By.xpath("//a[@class='switch-to-lightning']"));
		driver.executeScript("arguments[0].click();", s);



	}

}
