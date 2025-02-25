package Week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLgin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//inititating the driver browser
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		 driver.findElement(By.id("email")).sendKeys("testleaf@gmail.com");
		 driver.findElement(By.id("pass")).sendKeys("nishanth0508");
		 driver.findElement(By.name("login")).click();
		 driver.findElement(By.linkText("Account Login.")).click();
		 String title= driver.getTitle();
		 System.out.println(title);
		 driver.close();
		 
			 }
	}


				



