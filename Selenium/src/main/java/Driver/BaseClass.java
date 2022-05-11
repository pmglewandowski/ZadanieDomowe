package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    //    Variable which can be used with all methods and constructor. Variables should be privet, and access should be
//    through getDriver() method
    private WebDriver driver;

    //    This is constructor, it will be made every time you will create new object
    public BaseClass(){
//      This path direct to TestClow folder
        String projectPath = System.getProperty("user.dir");

//      If you want to use firefox, you must set this again but with "gecko" instead of "chrome".
//      I used in value for property String.format(), how do this you can find here
//      https://dzone.com/articles/java-string-format-examples
        System.setProperty("webdriver.chrome.driver",
                String.format("%s\\src\\main\\java\\WebDrivers\\chromedriver.exe", projectPath));

//      Here we create browser object. It also open here browser
        driver = new ChromeDriver();
    }

    //    Method which return driver, which we will need during our tests
    public WebDriver getDriver(){
        return driver;
    }
}