package com.automation.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws InterruptedException {
        // to start selenium script we needed
        // setup webdriver (browser driver) and create webdriver object
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        // in selenium, everything starts from webdriver interface
        driver.get("http://google.com"); //open website

        Thread.sleep(3000); //for demo wait 3 seconds

        driver.close();// to close driver


    }
}
