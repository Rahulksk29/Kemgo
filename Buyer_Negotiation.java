package kemgo_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Buyer_Negotiation {

	public static void main(String[] args) {
		// Step1. Login as seller and copy the Offer product name
		 
		
		System.setProperty("webdriver.gecko.driver","E:\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	    System.out.println("Hello");
	    System.setProperty("webdriver.firefox.bin", "C:\\Users\\Rahul\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
	    WebDriver driver= new FirefoxDriver();
	    driver.manage().window().maximize();
	   	driver.get("http://kemgov2.cladev.com");
	   	System.out.println("hello world-----1");
		driver.findElement(By.id("email")).sendKeys("beta.clavax@gmail.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("password")).sendKeys("Rahul@12");  //Enter Password
		driver.findElement(By.name("login")).click();  //Click on login button
		driver.findElement(By.xpath("/html/body/div[1]/div/header/div[2]/nav/div/ul[2]/li[5]/a")).click();  //Click on MyProducts
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/section/div/div[1]/div[2]/h5/a/span")).click();   //Click on Create and Manage Offers
		driver.findElement(By.xpath("//*[@id=\"5926\"]")).click(); //Click on the created offer by the seller
		WebElement locOfOrder = driver.findElement(By.xpath("//*[@id=\"sell_posting\"]/div[2]/div[2]/div[1]/div/div[1]/ul/li[2]/span"));
		Actions act = new Actions(driver);
		act.moveToElement(locOfOrder).doubleClick().build().perform();
		System.out.println("hello world-----2");
		String myOrderText = driver.findElement(By.xpath("//*[@id=\"sell_posting\"]/div[2]/div[2]/div[1]/div/div[1]/ul/li[2]/span")).getText(); //Copy the product name 
		System.out.println("hello world-----3");
		driver.findElement(By.xpath("//*[@id=\"kemgo-main\"]/header/div[1]/div/div/div[2]/div[1]/a")).click(); 
		driver.findElement(By.xpath("//*[@id=\"dropdown2\"]/li[7]/a")).click();
		
		// Step2. Login as buyer and then search the product name in Market screen.
		
		driver.findElement(By.id("email")).sendKeys("beta3.clavax@gmail.com");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		driver.findElement(By.id("password")).sendKeys("Rahul@12");  //Enter Password
		driver.findElement(By.name("login")).click();  //Click on login button
		System.out.println("hello world-----4");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}	
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"modeuser\"]/div/ul/li[2]/div/label/span"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);             										 // Change to buyer
		System.out.println("hello world-----5");
		driver.findElement(By.xpath("//*[@id=\"kemgo-main\"]/header/div[2]/nav/div/ul[2]/li[2]/a")).click();   //Click on Market button
		driver.findElement(By.xpath("//*[@id=\"s2id_searchsell\"]/a/span[1]")).click();
		System.out.println("hello world-----6");
		driver.findElement (By.xpath("//*[@id=\"select2-drop\"]/div/input")).sendKeys(myOrderText);  //Paste the copied product name
		System.out.println("hello world-----7");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}	
		driver.findElement (By.xpath("//*[@id=\"select2-drop\"]/ul/li[2]")).click();
		System.out.println("hello world-----8");
		driver.findElement (By.id("search_bar")).click();
		driver.findElement (By.xpath("//*[@id=\"5459\"]/div[2]/div[4]/a")).click();   //Click on view details
		
		
		
	}

}
