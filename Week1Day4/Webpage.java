package Week1Day4;

import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Webpage 
{

			 
		public static void main (String args[])throws InterruptedException
			    
			    {
			  	    FirefoxDriver driver = new FirefoxDriver();
			        driver.get("http://leaftaps.com/opentaps/");
			        driver.manage().window().maximize();
			        		        
			        driver.findElement(By.id("username")).sendKeys("democsr");
			        driver.findElement(By.name("PASSWROD")).sendKeys("crmsfa");
			        driver.findElement(By.className("decorativeSubmit")).click();
			        		        
			        driver.findElement(By.partialLinkText("CRM")).click();
			        	        
			        //Clicking on the "Accounts" tab
			        
			        driver.findElement(By.partialLinkText("Accounts")).click();
			        //Click on the "Create Account" button.
			        driver.findElement(By.partialLinkText("Create Account")).click();
			        //Entering an account name/description/Number Of Employees/Site Name 
			        driver.findElement(By.id("accountName")).sendKeys("sample11");
			        driver.findElement(By.id("accountName")).sendKeys("sample11");
			        driver.findElement(By.id("description")).sendKeys("Training Institute");
			        driver.findElement(By.id("numeberEmplyoees")).sendKeys("40");
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


			    	
		
	


