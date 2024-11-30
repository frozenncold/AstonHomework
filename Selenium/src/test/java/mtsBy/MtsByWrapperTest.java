package mtsBy;

import core.BaseSeleniumTest;
import org.junit.jupiter.api.Test;


public class MtsByWrapperTest extends BaseSeleniumTest {

    @Test
    public void titleCheckTest() {
        String expectedTitle = "Онлайн пополнение\n" + "без комиссии";
        MtsPayWrapper mtsPayWrapper = new MtsPayWrapper();
        mtsPayWrapper.titleCheck(expectedTitle);
    }

    @Test
    public void logosCheckTest() {
        MtsPayWrapper mtsPayWrapper = new MtsPayWrapper();
        mtsPayWrapper.logosCheck();
    }

    @Test
    public void moreAboutServiceTest(){
        MtsPayWrapper mtsPayWrapper = new MtsPayWrapper();
        mtsPayWrapper.moreAboutServiceCheck();
    }

    @Test
    public void dataInputTest() {
        String phone = "297777777";
        String replenishmentAmount = "22";
        MtsPayWrapper mtsPayWrapper = new MtsPayWrapper();
        mtsPayWrapper.dataInput(phone, replenishmentAmount);
    }
}
