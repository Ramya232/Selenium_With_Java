package Week1Day4;

import org.openqa.selenium.firefox.FirefoxDriver;
public class Firefox {

	   
public static void main (String args[]) throws InterruptedException
	    
	    {
	  	    FirefoxDriver driver = new FirefoxDriver();
	        driver.get("http://leaftaps.com/opentaps/");
	        driver.manage().window().maximize();
	        //Thread.sleep(3000);
	        driver.close();
	        
	        
	        

	    }
	    	
}






