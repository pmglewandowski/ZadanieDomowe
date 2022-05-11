package eurobank.pages.loginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private WebDriver webDriver;
    private WebDriverWait webDriverWait;

    public LoginPage(WebDriver webDriver, WebDriverWait webDriverWait) {
        this.webDriver = webDriver;
        this.webDriverWait = webDriverWait;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = LoginPageData.IDENTYFIKATOR)
    private WebElement identyfikator;

    @FindBy(xpath = LoginPageData.PRZYCISK_DALEJ)
    private WebElement przycisk_dalej;

    @FindBy(xpath = LoginPageData.HASLO)
    private WebElement haslo;

    @FindBy(xpath = LoginPageData.LOGO)
    private WebElement logo;

    private void uzupelnijIdentyfikator() {
        webDriverWait.until(ExpectedConditions.visibilityOf(identyfikator));
        identyfikator.sendKeys("12345678");
    }

    private void kliknijDalej() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(przycisk_dalej));
        przycisk_dalej.click();
    }

    private void uzupelnijHaslo() {
        webDriverWait.until(ExpectedConditions.visibilityOf(haslo));
        haslo.sendKeys("12345678");
    }

    public String asercjaLogo() {
        webDriverWait.until(ExpectedConditions.visibilityOf(logo));
        String asercja = logo.getAttribute("innerHTML");
        return asercja;
    }


    public void zaloguj() {
        uzupelnijIdentyfikator();
        kliknijDalej();
        uzupelnijHaslo();
        kliknijDalej();

    }
}
