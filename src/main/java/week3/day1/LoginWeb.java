package week3.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginWeb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("plintron");
		driver.findElementById("createLeadForm_firstName").sendKeys("archana");
		driver.findElementById("createLeadForm_lastName").sendKeys("jaya");
		
		WebElement source=driver.findElementById("createLeadForm_dataSourceId");
		Select sc=new Select(source); 
		sc.selectByVisibleText("Public Relations");
		WebElement source1=driver.findElementById("createLeadForm_marketingCampaignId");
		Select a=new Select(source1);
		a.selectByValue("CATRQ_CARNDRIVER");
		WebElement source2=driver.findElementById("createLeadForm_industryEnumId");
		Select b=new Select(source2);
		b.selectByIndex(14);
		
		driver.findElementByName ("submitButton").click();
		
		
		driver.close();
		

	}


}
