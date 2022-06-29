package browser;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Cal {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		//launch browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal Jair\\OneDrive\\Desktop\\Darshana_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		Properties p=new Properties();
		
		FileInputStream f=new FileInputStream("C:\\Users\\Vishal Jair\\eclipse-workspace\\Selinium_Scrpit\\LoginOR.properties");
	
		p.load(f);
		
		driver.get(p.getProperty("url"));
		
		driver.findElement(By.className(p.getProperty("reset"))).click();
		
		
		Assert.assertEquals("Reset","Reset" );
		System.out.println("AssertEquals Test Passed");
		driver.manage().window().maximize();
	}
}
