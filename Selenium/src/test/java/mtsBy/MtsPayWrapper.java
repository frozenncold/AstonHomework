package mtsBy;

import core.BaseSeleniumPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class MtsPayWrapper extends BaseSeleniumPage {


    @FindBy(xpath = "//div[@class='cookie__wrapper']")
    private WebElement cookieWindow;

    @FindBy(xpath = "//button[@id='cookie-agree']")
    private WebElement cookieButton;

    @FindBy(xpath = "//div[@class='pay__wrapper']/h2")
    private WebElement pay__wrapperTitle;

    @FindBy(xpath = "//div[@class='pay__partners']//img")
    private WebElement pay__partnersImg;

    @FindBy(xpath = "//a[@href='/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/']")
    private WebElement moreAboutService;

    @FindBy(xpath = "//input[@id='connection-phone']")
    private WebElement connectionPhone;

    @FindBy(xpath = "//input[@id='connection-sum']")
    private WebElement connectionSum;

    @FindBy(xpath = "//form[@class='pay-form opened']/button")
    private WebElement submitButton;

    @FindBy(xpath = "//div[@class='bepaid-app']")
    private WebElement bePaidApp;

    @FindBy(xpath = "//input[@id ='connection-email']")
    private WebElement connectionEmail;

    @FindBy(xpath = "//input[@id ='internet-phone']")
    private WebElement internetPhone;

    @FindBy(xpath = "//input[@id ='internet-sum']")
    private WebElement internetSum;

    @FindBy(xpath = "//input[@id ='internet-email']")
    private WebElement internetEmail;

    @FindBy(xpath = "//input[@id ='score-instalment']")
    private WebElement scoreInstalment;

    @FindBy(xpath = "//input[@id ='instalment-sum']")
    private WebElement instalmentSum;

    @FindBy(xpath = "//input[@id ='instalment-email']")
    private WebElement instalmentEmail;

    @FindBy(xpath = "//input[@id ='score-arrears']")
    private WebElement scoreArrears;

    @FindBy(xpath = "//input[@id ='arrears-sum']")
    private WebElement arrearsSum;

    @FindBy(xpath = "//input[@id ='arrears-email']")
    private WebElement arrearsEmail;

    @FindBy(xpath = "//span[@class='select__now']")
    private WebElement dropdownButton;

    @FindBy(xpath = "//p[@class='select__option'][text()='Домашний интернет']")
    private WebElement selectOptionInt;

    @FindBy(xpath = "//p[@class='select__option'][text()='Рассрочка']")
    private WebElement selectOptionInst;

    @FindBy(xpath = "//p[@class='select__option'][text()='Задолженность']")
    private WebElement selectOptionArrears;

    @FindBy(xpath = "//div[@class='pay-description__cost']/span[1]")
    private WebElement bePaidAppSum;

    @FindBy(xpath = "//button[@class='colored disabled']")
    private WebElement bePaidAppButtonSum;

    @FindBy(xpath = "//div[@class='pay-description__text']/span")
    private WebElement bePaidAppDescrpnText;

    @FindBy(xpath = "//input[@id='cc-number']")
    private WebElement bePaidAppCreditCardNumber;

    @FindBy(xpath = "//input[@formcontrolname='expirationDate']")
    private WebElement bePaidAppCardExpirationDate;

    @FindBy(xpath = "//input[@formcontrolname='cvc']")
    private WebElement bePaidAppCardCVC;

    @FindBy(xpath = "//input[@formcontrolname='holder']")
    private WebElement bePaidAppCardHolderName;

    @FindBy(xpath = "//img[@src='assets/images/payment-icons/card-types/visa-system.svg']")
    private WebElement bePaidAppVisaImg;

    @FindBy(xpath = "//img[@src='assets/images/payment-icons/card-types/mastercard-system.svg']")
    private WebElement bePaidAppMasterCardImg;

    @FindBy(xpath = "//img[@src='assets/images/payment-icons/card-types/belkart-system.svg']")
    private WebElement bePaidAppBelkartImg;

    @FindBy(xpath = "//img[@src='assets/images/payment-icons/card-types/maestro-system.svg']")
    private WebElement bePaidAppMaestroImg;

    @FindBy(xpath = "//img[@src='assets/images/payment-icons/card-types/mir-system-ru.svg']")
    private WebElement bePaidAppMirImg;

    @FindBy(xpath = "//body")
    private WebElement body;


    public MtsPayWrapper() {
        driver.get("https://www.mts.by/");
        PageFactory.initElements(driver, this);
    }

    public void cookieButton() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        if (cookieWindow.isDisplayed()) {
            WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(2)))
                    .until(ExpectedConditions.elementToBeClickable(cookieButton));
            js.executeScript("arguments[0].click();", cookieButton);
        }
    }

    public void bodyPageDown() {
        body.sendKeys(Keys.PAGE_DOWN);
        body.sendKeys(Keys.PAGE_DOWN);
    }

    public String getPayWrapperTitleText() {
        return pay__wrapperTitle.getText();
    }

    public void titleCheck(String expectedTitle) {
        Assertions.assertEquals(expectedTitle, getPayWrapperTitleText());
    }

    public void logosCheck() {
        pay__partnersImg.isDisplayed();
    }

    public void moreAboutServiceClick() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", moreAboutService);
    }

    public String getMoreAboutServiceUrl() {
        return driver.getCurrentUrl();
    }

    public void moreAboutServiceCheck(String expectedUrl) {
        Assertions.assertEquals(expectedUrl, getMoreAboutServiceUrl());
    }

    public void phoneInput(String phoneNumberValue) {
        connectionPhone.sendKeys(phoneNumberValue);
    }

    public void replenishmentAmountInput(String replenishmentAmountValue) {
        connectionSum.sendKeys(replenishmentAmountValue);
    }

    public void submitBtnClick() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", submitButton);
    }

    public void onlineReplenishmentCheck() {
        bePaidApp.isDisplayed();
    }

// Lesson16--------------------

    public void getConnectionPhoneText() {
        cookieButton.click();
        connectionPhone.getText();
    }

    public void getConnectionSumText() {
        connectionSum.getText();
    }

    public void getConnectionEmailText() {
        connectionEmail.getText();
    }

    public void getInternetPhoneText() {
        internetPhone.getText();
    }

    public void getInternetSumText() {
        internetSum.getText();
    }

    public void getInternetEmailText() {
        internetEmail.getText();
    }

    public void getScoreInstalmentText() {
        scoreInstalment.getText();
    }

    public void getInstalmentSumText() {
        instalmentSum.getText();
    }

    public void getInstalmentEmailText() {
        instalmentEmail.getText();
    }

    public void getScoreArrearsText() {
        scoreArrears.getText();
    }

    public void getArrearsSumText() {
        arrearsSum.getText();
    }

    public void getArrearsEmailText() {
        arrearsEmail.getText();
    }

    public void dropdownListClick() {
        dropdownButton.click();
    }

    public void dropdownSelectOptionIntClick() {
        selectOptionInt.click();
    }

    public void dropdownSelectOptionInstClick() {
        selectOptionInst.click();
    }

    public void dropdownSelectOptionArrearsClick() {
        selectOptionArrears.click();
    }

    public String getBePaidAppBtnSumText() {
        return bePaidAppButtonSum.getDomProperty("innerHTML");
    }

    public String getBePaidAppSumText() {
        return bePaidAppSum.getDomProperty("innerHTML");
    }

    public String bePaidAppBtnSumTextSubstring() {
        String str = getBePaidAppBtnSumText();
        return str.substring(11, 16);
    }

    public String bePaidAppSumTextSubstring() {
        String str = getBePaidAppSumText();
        return str.substring(0, 5);
    }

    public void bePaidAppSumEqual(String expectedSum) {
        Assertions.assertEquals(expectedSum, bePaidAppSumTextSubstring());
    }

    public void bePaidAppBtnSumEqual(String expectedSum) {
        Assertions.assertEquals(expectedSum, bePaidAppBtnSumTextSubstring());
    }

    public String getBePaidAppDescrpnText() {
        return bePaidAppDescrpnText.getDomProperty("innerHTML");
    }


    public String bePaidAppDescrpnTextSubstring() {
        String str = getBePaidAppDescrpnText();
        return str.substring(30, 39);
    }

    public void bePaidAppPhoneEqual(String expectedPhone) {
        Assertions.assertEquals(expectedPhone, bePaidAppDescrpnTextSubstring());
    }

    public void getBePaidAppCardNumberText() {
        bePaidAppCreditCardNumber.getText();
    }

    public void getBePaidAppCardExpirationDateText() {
        bePaidAppCardExpirationDate.getText();
    }

    public void getBePaidAppCardCVCText() {
        bePaidAppCardCVC.getText();
    }

    public void getBePaidAppCardHolderNameText() {
        bePaidAppCardHolderName.getText();
    }

    public void switchToBePaidFrame() {
        driver.switchTo().frame(driver.findElement(By.className("bepaid-iframe")));
    }

    public void bePaidAppVisaImgIsDisplay() {
        bePaidAppVisaImg.isDisplayed();
    }

    public void bePaidAppMasterCardImgIsDisplay() {
        bePaidAppMasterCardImg.isDisplayed();
    }

    public void bePaidAppBelkartImgIsDisplay() {
        bePaidAppBelkartImg.isDisplayed();
    }

    public void bePaidAppMaestroImgIsDisplay() {
        WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(5)))
                .until(ExpectedConditions.visibilityOf(bePaidAppMaestroImg));
        bePaidAppMaestroImg.isDisplayed();
    }

    public void bePaidAppMirImgIsDisplay() {
        WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(5)))
                .until(ExpectedConditions.visibilityOf(bePaidAppMirImg));
        bePaidAppMirImg.isDisplayed();
    }
}

