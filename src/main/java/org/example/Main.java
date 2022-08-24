package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com");

        WebElement webElement1 = driver.findElement(By.cssSelector("a[title='Log in to your customer account']"));
        webElement1.click();

        WebElement webElement2 = driver.findElement(By.id("email"));
        webElement2.click();
        webElement2.sendKeys("aka_lub@mail.ru");

        WebElement webElement3 = driver.findElement(By.id("passwd"));
        webElement3.click();
        webElement3.sendKeys("12345");

        WebElement webElement4 = driver.findElement(By.cssSelector("button[id='SubmitLogin'] span"));
        webElement4.click();

        driver.quit();
    }
}