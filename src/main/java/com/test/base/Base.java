package com.test.base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Base {

	public static WebDriver driver;
	// 获取项目路径(本地项目路径)
	String filePath = System.getProperty("user.dir");

	// 打开浏览器
	public void openBrowser(String bro) {
		if (bro.equals("chrome")) {
			System.setProperty("webdriver.chrom.driver", filePath + "/src/main/java/com/test/driver/chromedriver.exe");
			// 启动谷歌浏览器
			driver = new ChromeDriver();
			// 窗口放大
			driver.manage().window().maximize();
		} else if (bro.equals("firefox")) {
			System.setProperty("webdriver.firefox.driver",
					filePath + "/src/main/java/com/test/driver/firefoxdriver.exe");
			// 启动火狐浏览器
			driver = new FirefoxDriver();
			// 窗口放大
			driver.manage().window().maximize();
		}
	}

	// 关闭浏览器
	public void colseBrowser() {
		driver.quit();
	}

	// 等待时间
	public void sleep(int time) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 获取url地址
	public WebDriver getUrl(String url) {
		driver.get(url);
		sleep(2000);
		return driver;
	}
	
	//鼠标悬停
	public void hover(WebDriver deiver,WebElement xpath) {
		Actions action = new Actions(deiver);
		action.moveToElement(xpath).perform();;
	}
}
