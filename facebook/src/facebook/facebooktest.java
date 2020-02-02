package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebooktest {

	WebDriver driver;
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id=\"u_0_m\"]"));
		driver.findElement(By.xpath("//*[@id=\"u_0_o\"]"));
		Select ss1=new Select(driver.findElement(By.id("month")));
		ss1.selectByIndex(4);
	}
}
