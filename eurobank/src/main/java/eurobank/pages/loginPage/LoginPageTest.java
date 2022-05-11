package eurobank.pages.loginPage;

import eurobank.cfg.WebDriverCfg;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPageTest {

    private WebDriver driver;
    private WebDriverWait wait;
    private WebDriverCfg webDriverCfg;
    private LoginPage loginPage;

    @BeforeClass
    public void init(){
        webDriverCfg = WebDriverCfg.getInstance();
        driver = webDriverCfg.getWebdriver();
        wait = webDriverCfg.getWait();
        loginPage = new LoginPage(driver, wait);
    }
    @Test
    public void test(){
        driver.get(LoginPageData.URL);
        loginPage.zaloguj();
        Assert.assertEquals(loginPage.asercjaLogo(),"eurobank na co dzień");


    }


}
