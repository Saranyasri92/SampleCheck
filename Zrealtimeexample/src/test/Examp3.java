package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Examp3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saran\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver(); 
	
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
	List <WebElement> linkcount=driver.findElements(By.tagName("a"));
	int a=linkcount.size();
	System.out.println(a);
		
	for(int i=0;i<=linkcount.size();i++)
	{
		System.out.println(linkcount.get(i).getText());
	}
		
	}

}
