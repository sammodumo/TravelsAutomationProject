package StepDefinition;

import Page.PhpTravelsBasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class PhpTravelBaseStep {

    private PhpTravelsBasePage phpTravelsBasePage;

    @Given("I am on the flight search page")
    public void iAmOnTheFlightSearchPage() throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://www.phptravels.net/");
        Thread.sleep(2000);
        phpTravelsBasePage = new PhpTravelsBasePage(driver);

        phpTravelsBasePage.clickFlights();
        Thread.sleep(2000);
    }

    @When("I enter {string} as the departure city")
    public void iEnterAsTheDepartureCity(String arg0) throws InterruptedException {
        phpTravelsBasePage.clickFlyingFromDroDown();
        Thread.sleep(2000);

        phpTravelsBasePage.searchBar();
        Thread.sleep(2000);

        phpTravelsBasePage.searchBarResults();
        Thread.sleep(2000);
    }

    @And("I enter {string} as the arrival city")
    public void iEnterAsTheArrivalCity(String arg0) throws InterruptedException {
        phpTravelsBasePage.destinationToDroDown();
        Thread.sleep(2000);

        phpTravelsBasePage.destinationToSearchBar();
        Thread.sleep(2000);

        phpTravelsBasePage.searchBarResultsTwo();
        Thread.sleep(2000);
    }

    @And("I select {string} as the departure date")
    public void iSelectAsTheDepartureDate(String date) throws InterruptedException {
        phpTravelsBasePage.selectDepartureDate("01-12-2023");
        Thread.sleep(2000);
    }

    @And("I click the {string} button")
    public void iClickTheButton(String arg0) throws InterruptedException {
        phpTravelsBasePage.searchIcon();
        Thread.sleep(2000);
    }
}
