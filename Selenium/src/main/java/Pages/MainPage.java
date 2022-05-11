package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage {
    private WebDriver driver;

    //  Inside this selector we searching "input" tag which have attribute "type" as "text"
    @FindBy (xpath = "//input[@type='text']")
    private WebElement searchField;

    //  Here we looking for tag "input" with "type" attribute "submit", but because we have 4 of them, we can check with
//  ctrl+f which one is the one we looking for
    @FindBy (xpath = "(//input[@type='submit'])[3]")
    private WebElement searchButton;

    //  This is example of searching by className few elements
    @FindBy (className = "r")
    private List <WebElement> allWebsitesInResults;

    //  This selector go to tag "div" with class "r", next go deeper inside first tag "a" and inside this tag looking for h3
    @FindBy (xpath = "//div[@class='r']/a[1]/h3")
    private WebElement firstTitle;

    public MainPage(WebDriver driver){
//      this. refers to class where you use it. In this case we set driver from above by driver get inside constructor
        this.driver = driver;

//      This line change all selectors inside this class on elements
        PageFactory.initElements(driver, this);
    }

    private void searchTestClow(String text){
//      We can input text into text fields with sendKeys(String) method from element
        searchField.sendKeys(text);

//      click() method just click with one left mouse button on element
        searchButton.click();
    }

    private void getNumberOfResultsOnThePage(){
//      Write inside console how many websites is on one page. size() method return size of list
        System.out.println(String.format("There is %d websites searched on first page", allWebsitesInResults.size()));
    }

    private void getTitleOfFirstResult(){
//      getText() get text which is between start and end of tag
        System.out.println(String.format("Title of first result is \"%s\"", firstTitle.getText()));
    }

    private void openTestClow(String url){
//      We cannot in this case use @FindBy annotation because it is first thing when we create object. So we can do it
//      on this moment and create selector which can be flexible
        WebElement websiteToClick = driver.findElement(By.xpath(String.format("//a[@href='%s']/h3", url)));
        websiteToClick.click();
    }



    //  Method which test google site
    public void testGoogle(String textToSearch, String urlToClick){
//      Send through parameter text for searchTestClow method
        searchTestClow(textToSearch);
        getNumberOfResultsOnThePage();
        getTitleOfFirstResult();
        openTestClow(urlToClick);
    }
}
