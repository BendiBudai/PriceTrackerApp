package com.bb.testPTApp.service;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

import com.bb.testPTApp.model.Product;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import utils.xPath;

@Service
@AllArgsConstructor
public class ProductFactory {

    /**
     *
     */
    private static final String regex = "[^0-9]";
    @Autowired
    private final FirefoxDriver driver;

    public ProductFactory(FirefoxDriver driver) {
        this.driver = driver;
    }

    //TODO make seperate methods to scrape Name and Price move to: scraper service class
    public Product scrapeProduct(String url) {
        driver.get(url);

        // TODO explicit w8
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String name = driver.findElement(By.xpath(xPath.getArukeresoName())).getText();
        String price = "";

        // TODO more elegant solution here, some products are not working still!
        try {
            price = driver.findElement(By.xpath(xPath.getArukeresoPriceV1())).getText().replaceAll(regex, "");
        } catch (Exception e) {
            try {
                price = driver.findElement(By.xpath(xPath.getArukeresoPriceV2())).getText().replaceAll(regex, "");
            } catch (Exception e2) {
                price = driver.findElement(By.xpath(xPath.getArukeresoPriceV3())).getText().replaceAll(regex, "");
            }

        }

        Product product = new Product();
        product.setLink(url);
        product.setName(name);
        product.setPrice(Double.parseDouble(price));
        product.setLastCheck(LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES));

       //  driver.close();

        return product;
    }

}
