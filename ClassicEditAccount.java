package salesforceclassic.salesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class ClassicEditAccount {

	public static void main(String[] args) {
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
		WebElement z = driver.findElement(By.xpath("//a[@title='Accounts Tab']"));
		driver.executeScript("arguments[0].click();", z);
		WebElement y = driver.findElement(By.xpath("//a[text()='BootCamp_Puppeteer_Iswarya']"));
		driver.executeScript("arguments[0].click();", y);
		WebElement p = driver.findElement(By.xpath("(//input[@name='edit'])[1]"));
		driver.executeScript("arguments[0].click();", p);
		  
	    driver.findElement(By.xpath("//textarea[@id='acc18street']")).sendKeys("Surya nagar street");
	    
	    driver.findElement(By.xpath("//input[@name='acc18city']")).sendKeys("Chennai");
	   
	    driver.findElement(By.xpath("//input[@name='acc18state']")).sendKeys("Tamilnadu");
	   
	    driver.findElement(By.xpath("//input[@name='acc18zip']")).sendKeys("600100");
	    
	    driver.findElement(By.xpath("(//input[@name='acc18country'])[1]")).sendKeys("India");
	   
	    WebElement v = driver.findElement(By.xpath("(//input[@title='Save'])[2]"));
	    driver.executeScript("arguments[0].click();", v);
	    
	    String actual_Result=driver.findElement(By.xpath("//div[@id='acc18_ileinner']")).getText();
		String expected_Result=actual_Result;
		Assert.assertEquals(actual_Result,expected_Result);
		System.out.println(actual_Result);
	
		WebElement s = driver.findElement(By.xpath("//a[@class='switch-to-lightning']"));
		driver.executeScript("arguments[0].click();", s);
		driver.close();

	}

}
