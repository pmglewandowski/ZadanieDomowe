package eurobank.pages.homePage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private WebDriver webDriver;
    private WebDriverWait webDriverWait;

    public HomePage(WebDriver webDriver, WebDriverWait webDriverWait) {
        this.webDriver = webDriver;
        this.webDriverWait = webDriverWait;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = HomePageData.ZAKLADKA_PLATNOSCI)
    private WebElement zakladka_platnosci;

    @FindBy(xpath = HomePageData.DOLADUJ_TELEFON_LOGO)
    private WebElement doladuj_telefon_logo;

    @FindBy(xpath = HomePageData.ZAKLADKA_PRZELEW_DO_US)
    private WebElement zakladka_przelew_do_us;

//    @FindBy(xpath = HomePageData.FORMULARZ_US)
//    private WebElement formularz_us;

    @FindBy(xpath = HomePageData.NR_RACHUNKU)
    private WebElement nr_rachunku;

    @FindBy(xpath = HomePageData.KWOTA)
    private WebElement kwota;

    @FindBy(xpath = HomePageData.PRZYCISK_DALEJ)
    private WebElement przycisk_dalej;

    @FindBy(xpath = HomePageData.WPISANA_KWOTA)
    private WebElement wpisana_kwota;

    @FindBy(xpath = HomePageData.PODSUMOWANIE_PRZELEWU_NAGLOWEK)
    private WebElement podsumowanie_przelewu_naglowek;



    private void przejdzDoPlatnosci() {
       webDriverWait.until(ExpectedConditions.elementToBeClickable(zakladka_platnosci));
        zakladka_platnosci.click();
    }
    private void przejdzDoPrzelewDoUS() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(zakladka_przelew_do_us));
        zakladka_przelew_do_us.click();
    }
    private void wpiszNrRachunku() {
        webDriverWait.until(ExpectedConditions.visibilityOf(nr_rachunku));
        nr_rachunku.sendKeys("96910700070883657037928192");
    }
    private void wpiszKwote(){
        webDriverWait.until(ExpectedConditions.visibilityOf(kwota));
        kwota.sendKeys("123");
    }
    private void wcisnijDalej(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(przycisk_dalej));
        przycisk_dalej.click();
    }





    public String asercjaDoladujTelefonLogo() {
            webDriverWait.until(ExpectedConditions.visibilityOf(doladuj_telefon_logo));
            String asercja = doladuj_telefon_logo.getAttribute("innerText");
            return asercja;
    }
    public String asercjaPodsumowaniePrzelewuNaglowek() {
        webDriverWait.until(ExpectedConditions.visibilityOf(podsumowanie_przelewu_naglowek));
        String asercja = podsumowanie_przelewu_naglowek.getAttribute("innerText");
        return asercja;
    }
    public String asercjaPrzyciskDalej() {
        webDriverWait.until(ExpectedConditions.visibilityOf(przycisk_dalej));
        String asercja = przycisk_dalej.getAttribute("className");
        return asercja;
    }
    public String asercjaWpisanaKwota()  {
        webDriverWait.until(ExpectedConditions.visibilityOf(wpisana_kwota));
        String asercja = wpisana_kwota.getAttribute("innerHTML");

        return asercja;
    }




    public void testA(){
        przejdzDoPlatnosci();
        asercjaDoladujTelefonLogo();
    }
    public void testB(){
        przejdzDoPrzelewDoUS();
        asercjaPrzyciskDalej();
        wpiszNrRachunku();
        wpiszKwote();
        wcisnijDalej();
        asercjaWpisanaKwota();
    }








}

