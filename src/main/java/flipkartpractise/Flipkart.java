package flipkartpractise;



import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Flipkart {
@Test
	public void flipkart() throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElementByXPath("//button[contains(@class,'_2AkmmA _29YdH8')]").click();
		//driver.findElementByXPath("//button[contains(@class,'_1QZ6fC _3Lgyp8')]").click();
		WebElement electronics = driver.findElementByXPath("//span[contains(text(),'Electronics')]");
		Actions builder = new Actions(driver);
		builder .moveToElement(electronics).perform();
		Thread.sleep(1000);
		driver.findElementByLinkText("Mi").click();
		 List<WebElement> mimobile = driver.findElementsByClassName("_3wU53n");	 
		 List<WebElement> allPrices = driver.findElementsByXPath("//div[@class='_1vC4OE _2rQ-NK']");
			for (int i = 0; i < mimobile.size(); i++) {
				System.out.println("The mobile model "+mimobile.get(i).getText()+" has a price of "+allPrices.get(i).getText());
			}
			String mobilemodel = driver.findElementByXPath("//div[text()='Newest First']/following::div[@class='_3wU53n']").getText();
			driver.findElementByXPath("//div[text()='Newest First']/following::div[@class='_3wU53n']").click();
			
			Set<String> windowHandles = driver.getWindowHandles();
			List<String> allWindows = new ArrayList<>(windowHandles);
			driver.switchTo().window(allWindows.get(1));
			
		
			if(driver.getTitle().contains(mobilemodel)) {
				System.out.println("Title Matches");
			}else {
				System.out.println(driver.getTitle());
				System.out.println("Title does not match");
			}
			
		
			String ratings = driver.findElementByXPath("//span[contains(text(),'Ratings')]").getText();
			System.out.println(ratings);
			String reviews = driver.findElementByXPath("//span[contains(text(),'Reviews')]").getText();
			System.out.println(reviews);
			driver.quit();
			
		}

		





		//button[contains(@class,'_2AkmmA _29YdH8')]


	}


