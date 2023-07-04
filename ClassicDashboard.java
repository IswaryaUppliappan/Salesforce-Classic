package salesforceclassic.salesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ClassicDashboard {

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
		WebElement z = driver.findElement(By.xpath("//img[@title='All Tabs']"));
		driver.executeScript("arguments[0].click();", z);
		WebElement c = driver.findElement(By.xpath("//a[@class='listRelatedObject dashboardBlock title']"));
		driver.executeScript("arguments[0].click();", c);
		WebElement d = driver.findElement(By.xpath("//a[text()='Go to Dashboard List']"));
		driver.executeScript("arguments[0].click();", d);
		WebElement e = driver.findElement(By.xpath("//input[@title='New Dashboard...']"));
		driver.executeScript("arguments[0].click();", e);
		WebElement f = driver.findElement(By.xpath("(//td[@class='x-toolbar-left'])[2]"));
		driver.executeScript("arguments[0].click();", f);
		WebElement g = driver.findElement(By.xpath("(//em[@class='x-btn-arrow'])[1]"));
		driver.executeScript("arguments[0].click();", g);
		driver.findElement(By.xpath("//span[text()='Wide']")).click();
		WebElement ele = driver.findElement(By.xpath("//img[@title='Pie Chart']"));
		WebElement ele1 = driver.findElement(By.xpath("(//div[@class='x-panel-body x-panel-body-noheader x-panel-body-noborder'])[3]"));
		Actions builder = new Actions(driver);
		Action dragAndDrop = builder.clickAndHold(ele)
		.moveToElement(ele1)
		.release(ele1)
		.build();
		dragAndDrop.perform();
		WebElement h = driver.findElement(By.xpath("//textarea[@name='dash_description']"));
		driver.executeScript("arguments[0].click();", h);
		h.sendKeys("Salesforce classic");
		WebElement i = driver.findElement(By.xpath("//input[@value='Edit Title']"));
		i.sendKeys("Chart");
		WebElement j = driver.findElement(By.xpath("//input[@value='Edit Footer']"));
		j.sendKeys("Footer");
		WebElement el = driver.findElement(By.xpath("//img[@title='Horizontal Bar Chart']"));
		WebElement el1 = driver.findElement(By.xpath("(//div[@class='x-panel-body x-panel-body-noheader x-panel-body-noborder'])[3]"));
		Action dragAndDrop1 = builder.clickAndHold(el)
		.moveToElement(el1)
		.release(el1)
		.build();
		dragAndDrop1.perform();
		WebElement k = driver.findElement(By.xpath("(//input[@value='Edit Title'])[2]"));
		k.sendKeys("Chart1");
		WebElement l = driver.findElement(By.xpath("(//input[@value='Edit Footer'])[2]"));
		l.sendKeys("Footer1");
		driver.findElement(By.xpath("(//button[@title='Remove this column'])[1]")).click();
		WebElement m = driver.findElement(By.xpath("//div[@class='x-window-footer x-panel-btns']"));
		driver.executeScript("arguments[0].click();", m);
		driver.findElement(By.xpath("(//table[@class='x-btn x-btn-noicon'])[4]")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		WebElement x = driver.findElement(By.xpath("//div[@class='x-window-footer x-panel-btns']"));
		driver.executeScript("arguments[0].click();", x);
		WebElement s = driver.findElement(By.xpath("//a[@class='switch-to-lightning']"));
		driver.executeScript("arguments[0].click();", s);
		driver.close();
	}

}
