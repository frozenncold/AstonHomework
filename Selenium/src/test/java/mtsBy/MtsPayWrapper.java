package mtsBy;

import core.BaseSeleniumPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MtsPayWrapper extends BaseSeleniumPage {

    @FindBy(xpath = "//button[@class='btn btn_black cookie__ok']")
    private WebElement cookieButton;

    @FindBy(xpath = "//div[@class='pay__wrapper']/h2")
    private WebElement pay__wrapperTitle;

    @FindBy(xpath = "//div[@class='pay__partners']//img")
    private WebElement pay__partnersImg;

    @FindBy(xpath = "//a[@href='/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/']")
    private WebElement moreAboutService;

    @FindBy(xpath = "//input[@id='connection-phone']")
    private WebElement phoneNumber;

    @FindBy(xpath = "//input[@id='connection-sum']")
    private WebElement replenishmentAmount;

    @FindBy(xpath = "//form[@class='pay-form opened']/button")
    private WebElement submitButton;

    public MtsPayWrapper() {
        driver.get("https://www.mts.by/");
        PageFactory.initElements(driver, this);
    }

    public void titleCheck(String expectedTitle) {
        cookieButton.click();
        Assertions.assertEquals(pay__wrapperTitle.getText(), expectedTitle);
    }

    public void logosCheck() {
        cookieButton.click();
        pay__partnersImg.isDisplayed();
    }

    public void moreAboutServiceCheck(){
        cookieButton.click();
        moreAboutService.click();
    }

    public void dataInput(String phoneNumberValue, String replenishmentAmountValue) {
        cookieButton.click();
        phoneNumber.sendKeys(phoneNumberValue);
        replenishmentAmount.sendKeys(replenishmentAmountValue);
        submitButton.click();
    }
}
