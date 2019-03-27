package day01;

import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lianxi1 {
    @Test
	public void openfirefox() {
		
		//谷歌浏览器
		 System.setProperty("webdriver.chrome.driver", ".//tools//chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 String urll ="https://www.baidu.com";
		 driver.get(urll);
		 
		// driver.get("http://localhost:8080/mobile_mysql/index.jsp");
		 //driver.get("http://localhost:8080/mobile_mysql/bg-land.jsp");
		 driver.navigate().refresh();  //刷新
		 driver.manage().window().maximize();//最大化
		 Dimension dimension =new Dimension(900,800);//设置屏幕大小
		 driver.manage().window().setSize(dimension);
}
}
