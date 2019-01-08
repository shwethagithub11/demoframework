package com.techfundas.demoframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest {

	@Test
	public  void validatelaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anvi\\eclipse-workspace\\demoframework\\src\\test\\java\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("chrome opened");
	}

}
