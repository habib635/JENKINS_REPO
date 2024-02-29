

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class day15_feb6_cssSelectors {
	
	public WebDriver driver;
	public Properties prop;
	public FileInputStream ip;
	
	
		

		@Test

		public void readRegisterDataFromPropertiesFile() throws Exception {

			prop = new Properties();
		 ip = new FileInputStream(System.getProperty("user.dir") +
					"\\src\\test\\java\\day15_feb6_cssSelectors_class\\assignment\\config.properties");

			prop.load(ip);
			Login();

		}

		
		public void Login() {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("Url"));
			driver.findElement(By.linkText("My Account")).click();
			driver.findElement(By.linkText("Login")).click();
			driver.findElement(By.id("input-email)")).sendKeys("seleniumpanda25@gmail");
			driver.findElement(By.id("input-password")).sendKeys("selenium@123");
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		}
		@Test
		public void userPath() {
			System.out.println(System.getProperty("user.dir"));
		}
	}

