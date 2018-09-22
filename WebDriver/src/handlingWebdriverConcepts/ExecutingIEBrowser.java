package handlingWebdriverConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ExecutingIEBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "C:\\Users\\saran\\Downloads\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		WebDriver driver =new InternetExplorerDriver();
		Thread.sleep(4000);
		driver.get("http://google.com");
	
	
	}
	
	

}
