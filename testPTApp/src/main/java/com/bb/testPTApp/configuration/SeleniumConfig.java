package com.bb.testPTApp.configuration;

import javax.annotation.PostConstruct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverLogLevel;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import utils.Paths;

@Configuration
public class SeleniumConfig {

    @PostConstruct
    public void setSystemProperties() {
        System.setProperty("webdriver.gecko.driver", Paths.getGecoPath());
    }

    @Bean
    public FirefoxDriver driver() {
        FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--headless");
		options.setLogLevel(FirefoxDriverLogLevel.ERROR);
		WebDriver driver = new FirefoxDriver(options);
        return (FirefoxDriver) driver;
    }

}
