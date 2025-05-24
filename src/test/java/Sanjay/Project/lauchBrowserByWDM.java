package Sanjay.Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class lauchBrowserByWDM {
	
	public static void main(String[] args) {

		//	System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver-win64\\chromedriver.exe");

		WebDriverManager.chromedriver().clearDriverCache().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.axisbank.com/");

		driver.findElement(By.xpath("//a[text()='About Us']")).click();

		System.out.println("About Us pade Opened");
	}


}
