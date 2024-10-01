package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhpTravelsBasePage {
    WebDriver driver;
    public PhpTravelsBasePage(WebDriver webDriver){
        driver = webDriver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"tab\"]/li[2]/button")
    private WebElement flightLink;

    @FindBy(xpath = "//*[@id=\"onereturn\"]/div[1]/div[1]/div[2]/span/span[1]/span/span[2]/b")
    private WebElement flyingFromDroDown;

    @FindBy(xpath = "//*[@id=\"fadein\"]/span/span/span[1]/input")
    private WebElement flyingFromSearchBar;

    @FindBy(xpath = "//*[@id=\"select2--results\"]/li[1]")
    private WebElement searchBarResults;

    @FindBy(xpath = "//*[@id=\"onereturn\"]/div[2]/div[2]/div[2]/span/span[1]/span/span[2]/b")
    private WebElement destinationToDroDown;

    @FindBy(xpath = "//*[@id=\"fadein\"]/span/span/span[1]/input")
    private WebElement destinationToSearchBar;

    @FindBy(xpath = "//*[@id=\"select2--results\"]/li[1]")
    private WebElement searchBarResultsTwo;

    @FindBy(xpath = "//*[@id=\"departure\"]")
    private WebElement departDate;

    @FindBy(xpath = "//*[@id=\"flights-search\"]")
    private WebElement searchIcon;

    //Methods

    public void clickFlights()
    {
        flightLink.click();
    }

    public void clickFlyingFromDroDown()
    {
        flyingFromDroDown.click();
    }

    public void searchBar()
    {
        flyingFromSearchBar.sendKeys("New York");
    }

    public void searchBarResults()
    {
        searchBarResults.click();
    }

    public void destinationToDroDown()
    {
        destinationToDroDown.click();
    }

    public void destinationToSearchBar()
    {
        destinationToSearchBar.sendKeys("London");
    }

    public void searchBarResultsTwo()
    {
        searchBarResultsTwo.click();
    }

    public void selectDepartureDate(String date) {
        departDate.click();
        departDate.clear();
        departDate.sendKeys("01-12-2023");
//        departDate.sendKeys(org.openqa.selenium.Keys.RETURN);
    }

    public void searchIcon()
    {
        searchIcon.click();
    }


}
