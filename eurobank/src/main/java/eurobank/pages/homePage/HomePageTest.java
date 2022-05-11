package eurobank.pages.homePage;

import eurobank.cfg.WebDriverCfg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomePageTest {

    private WebDriver driver;
    private WebDriverWait wait;
    private WebDriverCfg webDriverCfg;
    private HomePage homePage;


    @BeforeClass
    public void init() {
        webDriverCfg = WebDriverCfg.getInstance();
        driver = webDriverCfg.getWebdriver();
        wait = webDriverCfg.getWait();
        homePage = new HomePage(driver, wait);
    }


    @Test
    public void test() {
        homePage.testA();
        Assert.assertEquals(homePage.asercjaDoladujTelefonLogo(),"doładuj telefon");

        homePage.testB();
        Assert.assertEquals(homePage.asercjaPodsumowaniePrzelewuNaglowek(), "podsumowanie przelewu");
        Assert.assertEquals(homePage.asercjaPrzyciskDalej(), "btn red arrow");
        Assert.assertEquals(homePage.asercjaWpisanaKwota(), "123");

    }

    @AfterClass
    public void quit(){
        driver.quit();
    }
}