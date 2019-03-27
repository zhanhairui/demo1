package stu;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class login {
	public static WebDriver driver;
	public static String url="http://www.baidu.com";
	@BeforeClass
	public void openfirefox() throws MalformedURLException{
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		driver=new ChromeDriver();
		 


	}
	@Test  //µÇÂ¼
	public void Alogin()  {
	driver.get(url);
	}
}
