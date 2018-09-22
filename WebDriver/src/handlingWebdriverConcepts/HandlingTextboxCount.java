package handlingWebdriverConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTextboxCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saran\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver(); 
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/Login.aspx");

		WebElement Username= driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_username\"]"));
		Username.sendKeys("Tester");
		WebElement Pwd= driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_password\"]"));
		Pwd.sendKeys("test");
		WebElement submit= driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_login_button\"]"));
		submit.click();
		WebElement order=driver.findElement(By.xpath("//*[@id=\"ctl00_menu\"]/li[3]/a"));
		order.click();
		List <WebElement> total=driver.findElements(By.xpath("//*[@type='text']"));
		System.out.println(total.size());
		
	}

}
