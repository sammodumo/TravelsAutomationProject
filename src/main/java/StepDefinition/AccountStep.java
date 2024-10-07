package StepDefinition;

import Page.AccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class AccountStep {
    private WebDriver driver;
    private AccountPage accountPage;

    @Given("I am on the registration page")
    public void iAmOnTheRegistrationPage() throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://www.phptravels.net/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        accountPage = new AccountPage(driver);

        accountPage.openSignUp();
        Thread.sleep(2000);
    }

    @When("I fill in {string} with {string}")
    public void iFillInWith(String arg0, String arg1) throws InterruptedException {
        accountPage.fillSignUpForm();
        Thread.sleep(2000);
    }

    @And("I click on {string}")
    public void iClickOn(String arg0) throws InterruptedException {
        accountPage.clickSignUp();
        Thread.sleep(2000);
    }
}
