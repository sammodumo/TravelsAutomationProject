package StepDefinition;

import Page.HotelsPage;
import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class HotelSearchStep {
    private HotelsPage hotelsPage;
    private WebDriver driver;

    @Given("I am on the hotel search page")
    public void iAmOnTheHotelsSearchPage() throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://www.phptravels.net/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        hotelsPage = new HotelsPage(driver);

//        hotelsPage.hotelLink();
//        Thread.sleep(2000);
    }

    @When("I enter {string} in the destination field")
    public void iEnterInTheDestinationField(String arg0) throws InterruptedException {
        hotelsPage.hotelDropDown();
        Thread.sleep(2000);

        hotelsPage.hotelFromSearchBar();
        Thread.sleep(2000);

        hotelsPage.hotelSearchBarResults();
        Thread.sleep(2000);
    }

    @And("I select {string} as check-in date")
    public void iSelectAsCheckInDate(String arg0) throws InterruptedException {
        hotelsPage.checkInDate("01-12-2024");
        Thread.sleep(2000);
    }

    @And("I select {string} as check-out date")
    public void iSelectAsCheckOutDate(String arg0) throws InterruptedException {
        hotelsPage.checkOutDate("10-12-2024");
        Thread.sleep(2000);
    }

    @And("I click on the search button")
    public void iClickOnTheSearchButton() throws InterruptedException {
        hotelsPage.searchIcon();
        Thread.sleep(2000);
    }


}
