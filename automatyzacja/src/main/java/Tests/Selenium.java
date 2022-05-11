package Tests;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;



public class Selenium

{

    protected static Webdriver driver;

    {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.testarena.pl/zaloguj");

        driver.findElement(By.id("email")).sendKeys(" administrator@testarena.pl");

        driver.findElement(By.id("password")).sendKeys("sumXQQ72$L");

                driver.findElement(By.id("login")).click();

        System.out.println("Poprawne logowanie");

        driver.quit();

    }

}


