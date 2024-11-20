
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args)  throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\browserdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	
		
		driver.get("https://dev01-na01-starfurniture.demandware.net/on/demandware.store/Sites-STAR-Site/default/Home-Show");
		 
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://staging-na01-starfurniture.demandware.net/s/STAR/login?rurl=1");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	  driver.findElement(By.xpath("//input[@id = 'login-form-email']")).sendKeys("VChaudhary@starfurniture.com");
       driver.findElement(By.xpath("//input[@id = 'login-form-password']")).sendKeys("Vishal@8181");
       driver.findElement(By.xpath("(//button[@type = 'submit'])[3]")).click();
		
		String exp_title ="Sites-STAR-Site | Salesforce Commerce Cloud | 6.1.0";
		String act_title= driver.getTitle();

		
		if (exp_title.equals(act_title)==true)
		{	
			System.out.println("Test is passed");
		}
		
		else
		{
			System.out.println("Test is failed");
		}
		
	
	}
	
	


}
