package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saran\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver(); 
		driver.get("http://www.snapdeal.com");
		Thread.sleep(5000);
		WebElement signin=driver.findElement(By.xpath("//*[@id=\'sdHeader\']/div[4]/div[2]/div/div[3]/div[3]/div/span[1]"));
Actions a =new Actions(driver);
a.moveToElement(signin).build().perform();

	}

}
