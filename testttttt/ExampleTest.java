import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExampleTest {
    @Test
    public void purchaseProductTest() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
        driver.findElement(By.id("shopping_cart_container")).click();
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("first-name")).sendKeys("Ola");
        driver.findElement(By.id("last-name")).sendKeys("Testowa");
        driver.findElement(By.id("postal-code")).sendKeys("22222");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish")).click();
        Assertions.assertEquals("THANK YOU FOR YOUR ORDER\n" +
                        "Your order has been dispatched, and will " +
                        "arrive just as fast as the pony can get there!\n" +
                        "BACK HOME",
                driver.findElement(
                        By.id("checkout_complete_container")).getText(),
                "Order confirmation message is different than expected.");
        driver.quit();
    }
}