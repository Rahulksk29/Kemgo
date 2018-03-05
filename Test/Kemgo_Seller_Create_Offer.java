import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Kemgo_Seller_Create_Offer {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","F:\\geckodriver-v0.17.0-win64\\geckodriver.exe");
	    System.out.println("Hello");
	    //System.setProperty("webdriver.firefox.bin", "C:\\Users\\Rahul\\AppData\\Local\\Mozilla Firefox\\firefox.exe");

	    WebDriver driver= new FirefoxDriver();
	    driver.manage().window().maximize();
	   	driver.get("http://kemgov2.cladev.com");
	   	WebDriverWait wait = new WebDriverWait(driver,30);
		System.out.println("hello world-----1");
		driver.findElement(By.id("email")).sendKeys("beta.clavax@gmail.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("password")).sendKeys("Rahul@12");  //Enter Password
		driver.findElement(By.name("login")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		System.out.println("hello world-----2");

		driver.findElement(By.xpath("//*[@id='kemgo-main']/header/div[2]/nav/div/ul[2]/li[5]/a")).click();  //Click on MyProducts
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/section/div/div[1]/div[2]/h5/a/span")).click();   //Click on Create and Manage Offers
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/section/div[1]/div[2]/div[1]/div/a")).click();   //Click on Create a New Offers
		driver.findElement(By.xpath("//[@id=\"s2id_productname\"]/a/span[1]")).click();   //Click on Select a Product
		driver.findElement(By.xpath("//[@id=\"select2-drop\"]/ul/li[6]")).click();   //Select Product from dropdown list
		driver.findElement(By.id("s2id_Formulapriceselect")).click();   //Click on Select Price Model
		driver.findElement(By.xpath("//[@id=\"select2-drop\"]/ul/li[3]")).click();   // Select Price Model from dropdown list
		driver.findElement(By.name("quantity")).sendKeys("500");   // Enter Total Quantity

		driver.findElement(By.name("offer_createdate")).click();    // Click on Offer start date column
		driver.findElement(By.xpath("/html/body/div[6]/div/a[2]/span")).click(); //Click on next month button
		driver.findElement(By.xpath("/html/body/div[6]/table/tbody/tr[2]/td[1]/a")).click(); 
		
		driver.findElement(By.name("offer_expiredate")).click();  //Click on Offer Expiration Date
		driver.findElement(By.xpath("/html/body/div[6]/div/a[2]/span")).click(); //Click on next month button
	    driver.findElement(By.xpath("/html/body/div[6]/table/tbody/tr[2]/td[3]/a")).click(); //Click on date on calander

	    driver.findElement(By.id("earliest_shipdate")).click();  //Click on Offer Earliest Shipment Date
		driver.findElement(By.xpath("//[@id=\"ui-datepicker-div\"]/div/a[2]")).click(); //Click on next month button
	    driver.findElement(By.xpath("//[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[2]/a")).click(); //Click on Earliest date on calander	    
		
	    driver.findElement(By.name("latest_shipdate")).click();  //Click on Latest Date text box
	    driver.findElement(By.xpath("/html/body/div[6]/div/a[2]/span")).click(); //Click on next month button on calander
	    driver.findElement(By.xpath("/html/body/div[6]/table/tbody/tr[3]/td[7]/a")).click();  //Select latest date from calander

	    ((JavascriptExecutor)driver).executeScript("scroll(0,400)"); 
	    driver.findElement(By.id("s2id_autogen4")).click();   //Click on Exclude Country
	    driver.findElement(By.xpath("/html/body/div[11]/ul/li[19]/div")).click();   //Select the Excluded country
	    driver.findElement(By.id("s2id_autogen19")).click();   //Click on Exclude usertype
	    driver.findElement(By.xpath("/html/body/div[12]/ul/li[5]/div")).click();   //Select the Excluded usertype  
	    ((JavascriptExecutor)driver).executeScript("scroll(0,900)");
	    driver.findElement(By.xpath("/html/body/div[1]/div/div/div/section/div/form/div[8]/div/div/div/div[1]/div/a/span[1]")).click();   //Click on Product Location country
		System.out.println("hello world-----3");
		
	    driver.findElement(By.xpath("//[@id=\"select2-drop\"]/div/input")).sendKeys("India"); //Write the product location country
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    driver.findElement(By.xpath("//[@id=\"select2-drop\"]/ul/li[2]")).click(); //Select the product location country
		driver.findElement(By.id("s2id_state")).click();   //Click on Product Location state  
        driver.findElement(By.xpath("//[@id=\"select2-drop\"]/ul/li[2]")).click(); //Select the product location state 
        driver.findElement(By.id("city")).sendKeys("Test"); //Select the product location city
        driver.findElement(By.xpath("//[@id=\"s2id_country1\"]/a/span[1]")).click(); //Click on Sell to
        driver.findElement(By.xpath("//[@id=\"select2-drop\"]/ul/li[2]")).click(); //Select the are whom to Sell to
        driver.findElement(By.xpath("//[@id=\"s2id_incoterm1\"]/a/span[1]")).click(); //Click on Incotern
        driver.findElement(By.xpath("//[@id=\"select2-drop\"]/ul/li[3]")).click(); //Select the Incotern
	    driver.findElement(By.xpath("//[@id=\"s2id_packaging1\"]/a/span[1]")).click(); //Click on Packaging
        driver.findElement(By.xpath("//[@id=\"select2-drop\"]/ul/li[4]")).click(); //Select the Packaging
    	System.out.println("hello world-----4");
        driver.findElement(By.id("price1")).sendKeys("1000"); //Enter price
	    driver.findElement(By.xpath("//[@id=\"s2id_currency1\"]/a/span[1]")).click(); //Click on Currency
        driver.findElement(By.xpath("//[@id=\"select2-drop\"]/ul/li[2]")).click(); //Select the Currency	
	    driver.findElement(By.xpath("//[@id=\"s2id_delipoint1\"]/a/span[1]")).click(); //Click on Delivery Point
        driver.findElement(By.xpath("//[@id=\"select2-drop\"]/ul/li[2]")).click(); //Select the Delivery Point
        System.out.println("hello world-----5");
        driver.findElement(By.xpath("//[@id=\"s2id_mintransit1\"]/a/span[1]")).click(); //Click on Min Transaction
        driver.findElement(By.xpath("//[@id=\"select2-drop\"]/ul/li[5]/div")).click(); //Select the Min Transaction
	    driver.findElement(By.id("s2id_maxtransit1")).click(); //Click on Max Transaction
        driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li[7]")).click(); //Select the Max Transaction	
        ((JavascriptExecutor) driver).executeScript("scroll(0,300)");
        driver.findElement(By.name("add")).click(); //Click on Publish Offer.
        driver.findElement(By.id("yes")).click();
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        driver.findElement(By.id("name")).sendKeys("Rahul's Offer");  //
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        driver.findElement(By.id("buttondroft")).click();
	
	}
}