package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

public class Main3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com");

        WebElement webElement1 = driver.findElement(By.cssSelector("a[title='Women']"));
        webElement1.click();

        WebElement webElement2 = driver.findElement(By.cssSelector("h5[itemprop='name'] a[title='Faded Short Sleeve T-shirts']"));
        webElement2.click();

        WebElement webElement3 = driver.findElement(By.id("group_1"));
        webElement3.click();
        webElement3.sendKeys("M");

        WebElement webElement4 = driver.findElement(By.cssSelector("button[name='Submit'] span"));
        webElement4.click();

        WebElement webElement5 = driver.findElement(By.cssSelector("span[title='Close window']"));
        webElement5.click();

        driver.quit();
    }
}
