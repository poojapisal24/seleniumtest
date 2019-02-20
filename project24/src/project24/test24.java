package project24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test24 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\3.3.1\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.Facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("wel");
        driver.findElement(By.cssSelector("#pass")).sendKeys("om");
        driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
        
        
        
        
     

	}

}
