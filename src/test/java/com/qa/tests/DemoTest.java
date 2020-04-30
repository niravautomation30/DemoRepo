/*
 * @Author= Nirav Maisuria
 */
package com.qa.tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
	
	public WebDriver driver;
	public String driverPath = "/home/nirav/Documents/selenium jar/geckodriver-v0.26.0-linux64/geckodriver";
	
	@Test
	public void sum() {
		System.out.println("in sum");
		int a=10;
		int b=20;
		Assert.assertEquals(a+b, 30);
	}
	
	@Test
	public void sub() {
		System.out.println("in sub");
		int a=10;
		int b=20;
		Assert.assertEquals(b-a, 10);
	}
	
	@Test
	public void div() {
		System.out.println("in div");
		int a=10;
		int b=20;
		Assert.assertEquals(b/a, 2);
	}
	
	@Test
	public void mul() {
		System.out.println("in mul");
		int a=10;
		int b=20;
		Assert.assertEquals(a*b, 200);
	}
	
	
	@Test
	public void openBrow() {
//		System.setProperty("webdriver.firefox.marionette", "/home/nirav/Documents/selenium jar/geckodriver-v0.26.0-linux64/geckodriver");
		//System.setProperty("webdriver.chrome.driver", "/home/nirav/Documents/selenium jar/chrome/chromedriver");		
//		driver = new FirefoxDriver();
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
//		driver.get("https://www.guru99.com/first-webdriver-script.html");
		
		System.setProperty("webdriver.gecko.driver", driverPath);
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        driver = new FirefoxDriver(capabilities);		
        driver.get("http://demo.guru99.com/selenium/guru99home/");
        driver.quit();

	}

}
