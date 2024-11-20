


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\browserdriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://mcdev1.larsonjuhl.com/en-US"); // replace with your URL

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		/*
		 * driver.get("https://developmentcc.starfurniture.com/login");
		 * 
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 * 
		 * driver.findElement(By.xpath("//input[@id = 'login-form-email']"))
		 * .sendKeys("VChaudhary@starfurniture.com");
		 * driver.findElement(By.xpath("//input[@id = 'login-form-password']"))
		 * .sendKeys("Vishal@8181");
		 * driver.findElement(By.xpath("(//button[@type = 'submit'])[3]")).click();
		 */

		Thread.sleep(3000);

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links in this page: " + links.size());

		for (int i = 0; i < links.size(); i++) {
			WebElement element = links.get(i);
			String url = element.getAttribute("href");
			String[] validProtocols = { "http", "https" };
			URL link = null;
			try {
				link = new URL(url);
			} catch (MalformedURLException e) {
				// URL is not a valid format, skip it
				continue;
			}
			String protocol = link.getProtocol();
			boolean valid = false;
			for (String p : validProtocols) {
				if (protocol.equals(p)) {
					valid = true;
					break;
				}
			}
			if (!valid) {
				// Protocol is not in the list of valid protocols, skip it
				continue;
			}
			HttpURLConnection httpconn = (HttpURLConnection) link.openConnection();

			Thread.sleep(2000);
			httpconn.connect();

			int rescode = httpconn.getResponseCode();
			if (rescode >= 404) { // check for response code >= 400
				System.err.println(url + "  -   " + "is broken link");
			} else {
				System.out.println(url + " - " + "is valid link ");
			}
			httpconn.disconnect(); // close the connection
		}
		driver.quit(); // close the browser
	}
}






