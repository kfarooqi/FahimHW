package com.noorteck.selenium.day7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class TestCase1 {

	WebDriver driver;
	
	public void setUp() {
	String key = "webdriver.chrome.driver";
	String path = "C:\\\\Users\\\\Abdul Karim Farooqi\\\\Desktop\\\\B7-Selenium\\\\chromedriver.exe";
	System.setProperty(key, path);
	driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
}
	
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	
	// Right Click
	
	public void rightClick() {
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		WebElement el = driver.findElement(By.xpath("//span[contains(@class, 'context-menu-one btn btn-neutral')]"));
		String expText = "right click me";
		Actions action = new Actions(driver);
		action.contextClick(el).build().perform();
		String actText = driver.findElement(By.xpath("//span[contains(@class, 'context-menu-one btn btn-neutral')]")).getText();
		Assert.assertEquals(expText, actText);
		
		System.out.println("Exp: " + expText);
		System.out.println("Act: " + actText);
		
		Assert.assertEquals(actText, expText, "Right Click Test Failed");
		
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println("OK " + alertText);
		
		
	}
	
	// Double Click
	
	public void doubleClick() {
		
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		WebElement el = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		Actions action = new Actions(driver);

		action.doubleClick(el).build().perform();
		
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println("OK " + alertText);

	}
	
	// drag and drop
	public void dragAndDrop1() throws InterruptedException {
	 driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	 driver.switchTo().frame(0);
	 
	 WebElement Oslo = driver.findElement(By.xpath("//div[@id = 'box1']"));
	 WebElement Washington = driver.findElement(By.xpath("//div[@id = 'box3']"));
	 WebElement Copenhagen = driver.findElement(By.xpath("//div[@id = 'box4']"));
	 WebElement Seoul = driver.findElement(By.xpath("//div[@id = 'box5']"));
	 WebElement Rome = driver.findElement(By.xpath("//div[@id = 'box6']"));
	 WebElement Madrid = driver.findElement(By.xpath("//div[@id = 'box7']"));
	 WebElement Stockholm = driver.findElement(By.xpath("//div[@id = 'box2']"));
	 
	 WebElement Italy = driver.findElement(By.xpath("//div[@id = 'box106']"));
	 WebElement Norway = driver.findElement(By.xpath("//div[@id = 'box101']"));
	 WebElement SouthKorea = driver.findElement(By.xpath("//div[@id = 'box105']"));
	 WebElement US = driver.findElement(By.xpath("//div[@id = 'box103']"));
	 WebElement Spain = driver.findElement(By.xpath("//div[@id = 'box107']"));
	 WebElement Denmark = driver.findElement(By.xpath("//div[@id = 'box104']"));
	 WebElement Sweden = driver.findElement(By.xpath("//div[@id = 'box102']"));
	 
	 Actions action = new Actions(driver);
	 
	 action.dragAndDrop(Rome, Italy).build().perform();
	 Thread.sleep(1000);
	 action.dragAndDrop(Oslo, Norway).build().perform();
	 Thread.sleep(1000);
	 action.dragAndDrop(Washington, US).build().perform();
	 Thread.sleep(1000);
	 action.dragAndDrop(Copenhagen, Denmark).build().perform();
	 Thread.sleep(1000);
	 action.dragAndDrop(Seoul, SouthKorea).build().perform();
	 Thread.sleep(1000);
	 action.dragAndDrop(Madrid, Spain).build().perform();
	 Thread.sleep(1000);
	 action.dragAndDrop(Stockholm, Sweden).build().perform();
	 Thread.sleep(1000);
	 
	 System.out.println("Done....");
	 
 }

}


