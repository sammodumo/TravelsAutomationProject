package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends PhpTravelsBasePage{
    public AccountPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/div[2]/ul/li[3]/a")
    private WebElement accountDropDown;

    @FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/div[2]/ul/li[3]/ul/li[2]/a")
    private WebElement signUpBtn;

    @FindBy(xpath = "//*[@id=\"firstname\"]")
    private WebElement firstName;

    @FindBy(xpath = "//*[@id=\"last_name\"]")
    private WebElement lastName;

    @FindBy(xpath = "//*[@id=\"signup\"]/div/div/div/div[3]/div[1]/div/div/button/div")
    private WebElement countryDrpDown;

    @FindBy(xpath = "//*[@id=\"phone\"]")
    private WebElement phoneNumber;

    @FindBy(xpath = "//*[@id=\"user_email\"]")
    private WebElement emailAccount;

    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement passWord;

    @FindBy(xpath = "//*[@id=\"recaptcha-anchor\"]/div[1]")
    private WebElement checkBox;

    @FindBy(xpath = "//*[@id=\"signup\"]/div/div/div/div[7]/div/div/div[1]")
    private WebElement signUpButton;


    public void openSignUp() {
        accountDropDown.click();
        signUpBtn.click();
    }


    public void fillSignUpForm() {
        firstName.sendKeys("John");
        lastName.sendKeys("Doe");
//        phoneNumber.sendKeys("0731019580");
        emailAccount.sendKeys("john.doe@example.com");
        passWord.sendKeys("SecurePassword123");
    }


//    public void selectCountry(String country) {
//        countryDrpDown.click();
//    }


//    public void checkRecaptcha() {
//        checkBox.click();
//
//    }


    public void clickSignUp() {
        signUpButton.click();
    }


}
