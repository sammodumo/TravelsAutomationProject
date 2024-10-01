package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HotelsPage extends PhpTravelsBasePage{
    public HotelsPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/div[1]/ul/li[1]/a")
    private WebElement hotelLink;

    @FindBy(xpath = "//*[@id=\"hotels-search\"]/div/div[1]/div[1]/span/span[1]/span/span[2]/b")
    private WebElement hotelDropDown;

    @FindBy(xpath = "//*[@id=\"fadein\"]/span/span/span[1]/input")
    private WebElement hotelFromSearchBar;

    @FindBy(xpath = "//*[@id=\"select2-hotels_city-results\"]/li")
    private WebElement hotelSearchBarResults;

    @FindBy(xpath = "//*[@id=\"checkin\"]")
    private WebElement checkInDate;

    @FindBy(xpath = "//*[@id=\"checkout\"]")
    private WebElement checkOutDate;

    @FindBy(xpath = "//*[@id=\"hotels-search\"]/div/div[5]/button")
    private WebElement searchIcon;


    //Methods

    public void hotelLink()
    {
        hotelLink.click();
    }

    public void hotelDropDown()
    {
        hotelDropDown.click();
    }

    public void hotelFromSearchBar()
    {
        hotelFromSearchBar.sendKeys("Dubai");
    }

    public void hotelSearchBarResults()
    {
        hotelSearchBarResults.click();
    }

    public void checkInDate(String date) {
        checkInDate.click();
        checkInDate.clear();
        checkInDate.sendKeys("01-12-2024");
//        checkInDate.sendKeys(org.openqa.selenium.Keys.RETURN);
    }

    public void checkOutDate(String date) {
        checkOutDate.click();
        checkOutDate.clear();
        checkOutDate.sendKeys("10-12-2024");
//        checkOutDate.sendKeys(org.openqa.selenium.Keys.RETURN);
    }

    public void searchIcon()
    {
        searchIcon.click();
    }


}
