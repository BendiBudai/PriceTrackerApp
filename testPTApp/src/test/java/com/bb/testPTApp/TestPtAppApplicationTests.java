package com.bb.testPTApp;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverLogLevel;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.springframework.boot.test.context.SpringBootTest;

import utils.xPath;

@SpringBootTest
class TestPtAppApplicationTests {

	@Test
	void contextLoads() {
		// FirefoxOptions options = new FirefoxOptions();
		// options.addArguments("--headless");
		// options.setLogLevel(FirefoxDriverLogLevel.ERROR);
		// WebDriver driver = new FirefoxDriver(options);

		// driver.get("https://tablet-pc.arukereso.hu/samsung/galaxy-tab-a7-t500-10-4-32gb-p586563525/");

		// String price = driver.findElement(By.xpath(xPath.getArukeresoPrice())).getText();
		// try {
		// 	Thread.sleep(2000);
		// } catch (InterruptedException e) {
		// 	// TODO Auto-generated catch block
		// 	e.printStackTrace();
		// }
		// String title = driver.getTitle();
		// System.out.println(price);

		// driver.close();
		// driver.quit();

		String str = "84 990 Ft Raktáron";

		System.out.println(Double.parseDouble(str));	
	}

}
