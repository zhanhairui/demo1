package day01;

import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lianxi1 {
    @Test
	public void openfirefox() {
		
		//�ȸ������
		 System.setProperty("webdriver.chrome.driver", ".//tools//chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 String urll ="https://www.baidu.com";
		 driver.get(urll);
		 
		// driver.get("http://localhost:8080/mobile_mysql/index.jsp");
		 //driver.get("http://localhost:8080/mobile_mysql/bg-land.jsp");
		 driver.navigate().refresh();  //ˢ��
		 driver.manage().window().maximize();//���
		 Dimension dimension =new Dimension(900,800);//������Ļ��С
		 driver.manage().window().setSize(dimension);
}
}
