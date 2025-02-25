package Week2day1;

import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateAccount
{

			 
		public static void main (String args[])throws InterruptedException
			    
			    {
			  	    FirefoxDriver driver = new FirefoxDriver();
			        driver.get("http://leaftaps.com/opentaps/");
			        driver.manage().window().maximize();
			        Thread.sleep(6000);
			        		        
			        driver.findElement(By.id("username")).sendKeys("democsr");
			        driver.findElement(By.name("PASSWROD")).sendKeys("crmsfa");
			        driver.findElement(By.className("decorativeSubmit")).click();
			        		        
			        driver.findElement(By.partialLinkText("CRM")).click();
			        	        
			        //Clicking on the "Accounts" tab
			        
			        driver.findElement(By.partialLinkText("Accounts")).click();
			        //Click on the "Create Account" button.
			        driver.findElement(By.partialLinkText("Create Account")).click();
			        //Entering an account name/description/Number Of Employees/Site Name 
			        driver.findElement(By.linkText("Create Account")).click();
			        driver.findElement(By.id("accountName")).sendKeys("sample");
			        driver.findElement(By.id("description")).sendKeys("Training Institute");
			        driver.findElement(By.id("numeberEmployees")).sendKeys("40");
			        driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
			        driver.findElement(By.className("smallSubmit")).click();   
			        String title = driver.getTitle();
			        System.out.println(title);
			        String expTitle = "Accoun Details";
			        if (title.equals(expTitle))
			        {
			        	System.out.println("Title is same");
			        }
			        
			        	else
			        	{
			        		System.out.println("Title is not same");
			        	}			        		
			        		                  
			        		        			        			        			       			        		              		        
			        Thread.sleep(1000);
			        driver.close();
			        
			    }
}


			    	
		
	


