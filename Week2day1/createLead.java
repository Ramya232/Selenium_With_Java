package Week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class createLead {

	public static void main(String[] args) {
		 
		{
			FirefoxDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.findElement(By.id("username")).sendKeys("democsr");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.partialLinkText("CRM")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.partialLinkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ramya");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Namasivayam");
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
			driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("TestLead");
			driver.findElement(By.className("smallSubmit")).click();
			String title = driver.getTitle();
			System.out.println(title);
			driver.close();
			
		}
	}
}
