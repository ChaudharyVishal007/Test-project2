import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Place_order_login {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\browserdriver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
    driver.manage().window().maximize();
    driver.get("https://developmentcc.starfurniture.com/mattresses/pillows/aireloom-nimbus-low-profile-pillow-ST%3A706922.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));	
			        
	   
      driver.findElement(By.xpath("//*[@id=\"add-to-cart\"]")).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	driver.findElement  (By.xpath("//*[@id=\"myGroup\"]/li[4]/span/div[3]/div/div[3]/div[2]/div[2]/div/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("VChaudhary@starfurniture.com");
	    driver.findElement(By.xpath("//*[@id=\"checkout-login\"]/fieldset/div[1]/div/div[2]/input")).sendKeys("Vishal@8181");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//*[@id=\"checkout-login\"]/fieldset/div[2]/button")).click(); 

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
		
		WebElement calendar_table = driver.findElement(By.xpath( "//input[@name='shiping_date']"));
		calendar_table.click();
		Actions actions = new Actions(driver);
     	actions.moveToElement(calendar_table).click().perform();

		Thread.sleep(4000);
		
        java.util.List<WebElement> dates = calendar_table .findElements(By.tagName("td"));
   
        Thread.sleep(4000);
        // Iterate through the dates
        for (WebElement date : dates) {
            // Check if the date's color is blue
            if (date.getCssValue("background-color").equals("#1782c5")) {
            
                date.click();
                break;
            }
        }
	
		
		
		
	}

}
