package handlingWebdriverConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class HandlingTopMenuNavigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saran\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver(); 
		driver.get("https://www.hdfcbank.com/");
		WebElement Applynow= driver.findElement(By.xpath("//html/body//div[1]//div[1]//div[2]//div[3]//ul//li[4]//div[1]//span"));
		Actions a = new Actions(driver);
		a.moveToElement(Applynow).build().perform();
		Thread.sleep(4000);
		WebElement Carloan= driver.findElement(By.xpath("//html//body//div[1]//div[1]//div[2]//div[3]//ul//li[4]//div[2]//div[2]//div//ul//li[3]//a"));
		Carloan.click();
		
		
		
		
		
		
		
		
		
	}

}
