package in.srssprojects.kexim_bank;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	WebDriver driver;
	
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\dharani\\softwares\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://srssprojects.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void closeBrowser() {
		driver.close();
	}

}
