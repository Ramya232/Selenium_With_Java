package Week2day1;

import org.openqa.selenium.chrome.ChromeDriver;

 public class googlehomepage{
	   
    public static void main(String args[])throws InterruptedException
    
    {
  	    ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.close();

    }
    
}

