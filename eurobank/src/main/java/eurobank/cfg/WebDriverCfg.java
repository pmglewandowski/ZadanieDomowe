package eurobank.cfg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;


public class WebDriverCfg {
    private WebDriver driver;
    private WebDriverWait wait;
    private static  WebDriverCfg instance;

    public WebDriverCfg() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver,10);
        driver.manage().window().maximize();
    }

    public static WebDriverCfg getInstance(){
        if(instance ==null){
            instance = new WebDriverCfg();
        }
        return instance;
    }

    public WebDriver getWebdriver(){
        return driver;
    }

    public WebDriverWait getWait(){
        return wait;
    }
}
