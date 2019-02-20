package project24;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class test24 {
	
@Test
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\3.3.1\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.Facebook.com");
        driver.manage().window().maximize();
       // driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("wel");
        //driver.findElement(By.cssSelector("#pass")).sendKeys("om");
       // driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
      // driver.findElement(By.xpath("//*[@id=\"u_0_7\"]")).click();
       // driver.findElement(By.xpath("//*[@id=\"u_0_12\"]")).click();
        WebElement Month_dropdown=driver.findElement(By.id("month"));
        Select month_dd= new Select(Month_dropdown);
        
        month_dd.selectByIndex(3);
        
      Thread.sleep(3000);
        month_dd.selectByValue("10");
        
        Thread.sleep(3000);
        month_dd.selectByVisibleText("Aug");
        
        
        
     

	}

	
	}


