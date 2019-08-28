package com.AmazonMaven.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public static WebDriver driver;

	
	@BeforeClass
	public void Setup() {
		 
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\ecc\\chromedriver_win32//chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.amazon.com/?tag=hymsabk-20&hvadid=77721776303163&hvqmt=e&hvbmt=be&hvdev=c&ref=pd_sl_7j18redljw_e");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
