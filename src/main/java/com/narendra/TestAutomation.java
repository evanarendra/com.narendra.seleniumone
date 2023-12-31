package com.narendra;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAutomation {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String pageTitle = driver.getTitle();
        JavascriptExecutor js = (JavascriptExecutor) driver;

//      String url = "https://v3-web-app-micro.staging.superapp.co.id/ ";
        String url = "https://demoqa.com/text-box";
        driver.get(url);
        driver.manage().window().maximize();
        System.out.println(pageTitle);

        driver.findElement(By.id("userName")).sendKeys("Evan Narendra");
        driver.findElement(By.id("userEmail")).sendKeys("evanarendra7@gmail.com");
        driver.findElement(By.id("currentAddres")).sendKeys("Kos Niaga Sutera");
        driver.findElement(By.id("permanentAddres")).sendKeys("Timoho");
//      js.executeScript("window.scrollBy(0,700");
        driver.findElement(By.id("submit")).click();
        delay(3);
        driver.quit();
    }
    static void delay(int seconds) {
        try {
            Thread.sleep(1000*seconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
