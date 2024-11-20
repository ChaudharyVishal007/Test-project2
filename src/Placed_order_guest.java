import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Placed_order_guest {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\browserdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
		   driver.manage().window().maximize();
		   driver.get("https://developmentcc.starfurniture.com/living-rooms/sofas/leland-leather-sofa-ST%3A506049.html");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));	
					        
			  
		   driver.findElement(By.xpath("//*[@id=\"add-to-cart\"]")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement  (By.xpath("//*[@id=\"myGroup\"]/li[4]/span/div[3]/div/div[3]/div[2]/div[2]/div/a")).click();
		
		      Thread.sleep(2000);
  		       WebElement BTN_checkout = driver.findElement(By.xpath("//a[@class='btn btn-secondary']"));
		        BTN_checkout.click();
		
		       WebElement guest_email = driver.findElement(By.xpath("//*[@id=\"email-guest\"]"));
		        guest_email.sendKeys(" vchaudhary@starfurniture.com");
		  
		        Thread.sleep(3000);
		        
               WebElement continue_guest = driver.findElement(By.xpath("//*//*[@id=\"guest-customer\"]/fieldset/div[2]/button"));
		        continue_guest.click(); 
		
	
	
		      
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 
                  WebElement first_name = driver.findElement(By.xpath("//input[@id='shippingFirstNamedefault']"));
			      first_name.sendKeys("Vishal");
				
				WebElement last_name = driver.findElement(By.xpath("//input[@id='shippingLastNamedefault']"));
				last_name.sendKeys("QA");
				
				WebElement Address_1 = driver.findElement(By.xpath("//input[@id='shippingAddressOnedefault']"));
				Address_1.sendKeys("18107 North  Freeway");
				
				WebElement Address_2 = driver.findElement(By.xpath("//input[@id='shippingAddressTwodefault']"));
				Address_2.sendKeys("18107");
				
				WebElement city = driver.findElement(By.xpath("//input[@id='shippingAddressCitydefault']")); 
				city.sendKeys("houston");
				
				WebElement zipcode = driver.findElement(By.xpath("//input[@id='shippingZipCodedefault']"));//*  
				zipcode.sendKeys("77090");
				
				WebElement phone_number = driver.findElement(By.xpath("//input[@id='shippingPhoneNumberdefault']"));
				phone_number.sendKeys("2814403330");
	 
				
				WebElement check_bill = driver.findElement(By.xpath("//input[@id='billing-shippingAddressUseAsBillingAddress']"));
			 check_bill.click();
			
			
				Thread.sleep(10000);
			     
			      WebElement BTN_warehouse = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
			 
			      BTN_warehouse.click();	
	   
			      Thread.sleep(5000); 
			      
			      WebElement BTN_saved_to_billing = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
					BTN_saved_to_billing.click();
	
	
					/*	WebElement Date_box = driver.findElement(By.xpath("//*[@id=\"dwfrm_shipping\"]/div[1]/fieldset[3]/div[1]/div[3]/div/input"));
			 Date_box.sendKeys("09-10-2022");
			
			 Thread.sleep(2000);*/
	 
		
			/* Thread.sleep(2000);
			 
			 WebElement first_name = driver.findElement(By.xpath("//*[@id=\"billingFirstName\"]"));
			 first_name.sendKeys("Vishal");
				
				WebElement last_name = driver.findElement(By.xpath("//*[@id=\"billingLastName\"]"));
				last_name.sendKeys("QA");
				
				WebElement Address_1 = driver.findElement(By.xpath("//*[@id=\"billingAddressOne\"]"));
				Address_1.sendKeys("18107 North  Freeway");
				
				WebElement Address_2 = driver.findElement(By.xpath("//*[@id=\"billingAddressTwo\"]"));
				Address_2.sendKeys("18107");
				
				WebElement city = driver.findElement(By.xpath("//*[@id=\"billingAddressCity\"]")); 
				city.sendKeys("houston");
				
				WebElement zipcode = driver.findElement(By.xpath("//*[@id=\"billingZipCode\"]"));//*  
				zipcode.sendKeys("77090");
				
				WebElement phone_number = driver.findElement(By.xpath("//*[@id=\"phoneNumber\"]"));
				phone_number.sendKeys("2814403330"); */
				
			
				
				Thread.sleep(2000);
				
				WebElement card_number = driver.findElement(By.xpath("//input[@id='cardNumber']"));
				card_number.sendKeys("4111111111111111");
				
				Select month = new Select(driver.findElement(By.xpath("//select[@id='expirationMonth']")));
				month.selectByVisibleText("12");
				
				Select year = new Select(driver.findElement(By.xpath("//select[@id='expirationYear']")));
				year.selectByVisibleText("2024");
	
				WebElement cvv = driver.findElement(By.xpath("//input[@id='securityCode']"));
		         cvv.sendKeys("123");	
		         
		         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		         
		         WebElement continue_place_order= driver.findElement(By.xpath("//button[@value='submit-payment']"));
		         continue_place_order.click();
				
		       Thread.sleep(1000);
		       
				  WebElement place_order= driver.findElement(By.xpath("(//button[@type='submit'])[5]"));
				  place_order.click();

              System.out.println("Title of confirmation page:   "   +  driver.getTitle());
              
	
					
			      }
		  }
					
		    	
