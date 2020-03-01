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

        String title = driver.getTitle(); // returns <title> some title</title> text
        String expectedTitle="Google";
        System.out.println("title is "+ title);

        if(expectedTitle.equals(title)){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }




        driver.close();// to close driver


    }
}
