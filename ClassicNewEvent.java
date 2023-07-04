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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ClassicNewEvent {

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
		WebElement c = driver.findElement(By.xpath("//a[@class='menuButtonMenuLink firstMenuItem eventMru']"));
		driver.executeScript("arguments[0].click();", c);
		WebElement g = driver.findElement(By.xpath("//a[@title='Combo (New Window)']"));
		driver.executeScript("arguments[0].click();", g);
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> lstname=new ArrayList<String>(windowHandles);
		driver.switchTo().window(lstname.get(1));
		Thread.sleep(1000);
		WebElement h = driver.findElement(By.xpath("//div[@class='choicesBox tertiaryPalette brandSecondaryBrd']"));
		driver.executeScript("arguments[0].click();", h);
		WebElement i = driver.findElement(By.xpath("//a[text()='Call']"));
		driver.executeScript("arguments[0].click();", i);
		driver.switchTo().window(lstname.get(0));
		WebElement d = driver.findElement(By.xpath("((//span[@class='dateInput dateOnlyInput'])[1])/input"));
		driver.executeScript("arguments[0].click();", d);
		d.clear();
		d.sendKeys("6/17/2023");
		WebElement e = driver.findElement(By.xpath("((//span[@class='dateInput dateOnlyInput'])[2])/input"));
		driver.executeScript("arguments[0].click();", e);
		e.clear();
		e.sendKeys("6/18/2023");
		WebElement f = driver.findElement(By.xpath("//a[@title='Name Lookup (New Window)']"));
		driver.executeScript("arguments[0].click();", f);
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> lstname1=new ArrayList<String>(windowHandles1);
		driver.switchTo().window(lstname1.get(1));
		Thread.sleep(1000);
		WebElement l = driver.findElement(By.xpath("//frame[@title='Search']"));
		driver.switchTo().frame(l);
		WebElement j = driver.findElement(By.xpath("//input[@type='text']"));
		j.sendKeys("Iswarya Uppliappan");
		j.sendKeys(Keys.ENTER);
		driver.switchTo().defaultContent();
		WebElement n = driver.findElement(By.xpath("//frame[@title='Results']"));
		driver.switchTo().frame(n);
		WebElement y = driver.findElement(By.xpath("(//body[@class='hasMotif lookupTab  LookupResultsFrame'])/form"));
		y.click();
		WebElement o = driver.findElement(By.xpath("//a[@class=' dataCell ']"));
		driver.executeScript("arguments[0].click();", o);
		Thread.sleep(2000);
		driver.switchTo().window(lstname.get(0));
		
		 JavascriptExecutor js1=(JavascriptExecutor)driver;
			js1.executeScript("window.scrollBy(0,500)");
			Thread.sleep(2000);
		WebElement k = driver.findElement(By.xpath("//input[@name='attachFile']"));
		driver.executeScript("arguments[0].scrollIntoView(true)", k);
		driver.executeScript("arguments[0].click();", k);
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> lstname2=new ArrayList<String>(windowHandles2);
		driver.switchTo().window(lstname2.get(1));
		Thread.sleep(1000);
		WebElement k1 = driver.findElement(By.xpath("//input[@name='file']"));
		driver.executeScript("arguments[0].click();", k1);
		k1.sendKeys("C:\\Users\\keert\\Downloads\\XPath Cheat Sheet v1.1.pdf");
		Thread.sleep(1000);
		WebElement k2 = driver.findElement(By.xpath("//input[@name='Attach']"));
		k2.click();
		WebElement e1 = driver.findElement(By.xpath("//input[@name='cancel']"));
		driver.executeScript("arguments[0].click();", e1);
		driver.switchTo().window(lstname.get(0));
		 String actual_Result=driver.findElement(By.xpath("//div[@id='RelatedActivityAttachmentList_body']")).getText();
			String expected_Result=actual_Result;
			Assert.assertEquals(actual_Result,expected_Result);
			System.out.println(actual_Result);
			WebElement a1 = driver.findElement(By.xpath("(//input[@name='save'])[2]"));
			driver.executeScript("arguments[0].click();", a1);
			 String actual_Result1=driver.findElement(By.xpath("(//div[@class='eventBlock'])[1]")).getText();
				String expected_Result1=actual_Result1;
				Assert.assertEquals(actual_Result1,expected_Result1);
				System.out.println(actual_Result1);
				driver.close();
				
	}

}
