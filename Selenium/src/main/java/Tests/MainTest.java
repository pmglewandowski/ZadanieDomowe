package Tests;

import Driver.BaseClass;
import Pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MainTest {
    //  Variables which will be used inside this class
    private WebDriver driver;
    private BaseClass bc;
    private MainPage mp;

    //    Everything inside this method will be done before run test
    @BeforeTest
    public void before(){
//      Create object and run constructor from BaseClass
        bc = new BaseClass();

//      Set driver variable on this from BaseClass
        driver = bc.getDriver();

//      Maximize browser window
        driver.manage().window().maximize();

//      Create MainPage object
        mp = new MainPage(driver);

//      Go to testclow.eu inside browser
        driver.get("http://testclow.eu");
    }

    //    It's our test
    @Test
    public void test(){
//      Change website on google
        driver.get("https://www.google.com/");

//      Run testing method for google website
        mp.testGoogle("testclow", "http://testclow.eu/");
    }

    //    This will be done after test. No matter if will be negative or positive
    @AfterTest
    public void after(){
//      Close driver and kill process
        driver.quit();
    }
}
