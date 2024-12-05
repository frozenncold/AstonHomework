package mtsBy;

import core.BaseSeleniumTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class MtsByWrapperTest extends BaseSeleniumTest {

    private static MtsPayWrapper getMtsPayWrapperNew() {
        return new MtsPayWrapper();
    }

    @BeforeEach
    public void cookieWindowCheck() {
        MtsPayWrapper mtsPayWrapper = getMtsPayWrapperNew();
        mtsPayWrapper.cookieButton();
    }

    @Test
    public void titleCheckTest() {
        String expectedTitle = "Онлайн пополнение\n" + "без комиссии";
        MtsPayWrapper mtsPayWrapper = getMtsPayWrapperNew();
        mtsPayWrapper.titleCheck(expectedTitle);

    }

    @Test
    public void logosCheckTest() {
        MtsPayWrapper mtsPayWrapper = getMtsPayWrapperNew();
        mtsPayWrapper.logosCheck();
    }

    @Test
    public void moreAboutServiceTest() {
        String expectedUrl = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
        MtsPayWrapper mtsPayWrapper = getMtsPayWrapperNew();
        mtsPayWrapper.moreAboutServiceClick();
        mtsPayWrapper.moreAboutServiceCheck(expectedUrl);
    }

    @Test
    public void dataInputTest() {
        String phone = "297777777";
        String replenishmentAmount = "22";
        MtsPayWrapper mtsPayWrapper = getMtsPayWrapperNew();
        mtsPayWrapper.phoneInput(phone);
        mtsPayWrapper.replenishmentAmountInput(replenishmentAmount);
        mtsPayWrapper.submitBtnClick();
        mtsPayWrapper.onlineReplenishmentCheck();
    }

    // Lesson16------------------

    @Test                               // задание 1
    public void textInTheFieldsTest() {
        MtsPayWrapper mtsPayWrapper = getMtsPayWrapperNew();
        mtsPayWrapper.getConnectionPhoneText();
        mtsPayWrapper.getConnectionSumText();
        mtsPayWrapper.getConnectionEmailText();
        mtsPayWrapper.dropdownListClick();
        mtsPayWrapper.dropdownSelectOptionIntClick();
        mtsPayWrapper.getInternetPhoneText();
        mtsPayWrapper.getInternetSumText();
        mtsPayWrapper.getInternetEmailText();
        mtsPayWrapper.dropdownListClick();
        mtsPayWrapper.dropdownSelectOptionInstClick();
        mtsPayWrapper.getScoreInstalmentText();
        mtsPayWrapper.getInstalmentSumText();
        mtsPayWrapper.getInstalmentEmailText();
        mtsPayWrapper.dropdownListClick();
        mtsPayWrapper.dropdownSelectOptionArrearsClick();
        mtsPayWrapper.getScoreArrearsText();
        mtsPayWrapper.getArrearsSumText();
        mtsPayWrapper.getArrearsEmailText();
    }

    @Test                                   // задание 2
    public void connectionFieldsTest() {
        String phone = "297777777";
        String replenishmentAmount = "22.00";
        MtsPayWrapper mtsPayWrapper = getMtsPayWrapperNew();
        mtsPayWrapper.bodyPageDown();
        mtsPayWrapper.phoneInput(phone);
        mtsPayWrapper.replenishmentAmountInput(replenishmentAmount);
        mtsPayWrapper.submitBtnClick();
        mtsPayWrapper.switchToBePaidFrame();
        mtsPayWrapper.bePaidAppSumEqual(replenishmentAmount);
        mtsPayWrapper.bePaidAppBtnSumEqual(replenishmentAmount);
        mtsPayWrapper.bePaidAppPhoneEqual(phone);
        mtsPayWrapper.getBePaidAppCardNumberText();
        mtsPayWrapper.getBePaidAppCardExpirationDateText();
        mtsPayWrapper.getBePaidAppCardCVCText();
        mtsPayWrapper.getBePaidAppCardHolderNameText();
        mtsPayWrapper.bePaidAppVisaImgIsDisplay();
        mtsPayWrapper.bePaidAppMasterCardImgIsDisplay();
        mtsPayWrapper.bePaidAppBelkartImgIsDisplay();
        mtsPayWrapper.bePaidAppMaestroImgIsDisplay();
        mtsPayWrapper.bePaidAppMirImgIsDisplay();
    }


}

