package org.dataqa.pages;

import org.dataqa.utils.Selectors;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

/**
 * Класс для работы со страницей с алертами.
 */
public class AlertPage {

    /**
     * Нажимает на кнопку для вызова алерта.
     */
    private final By ALERT_BTN = Selectors.byID("alertButton");

    /**
     * Подтверждает алерт.
     */
    public void clickToAlertBtn() {
        $(ALERT_BTN).click();
    }

    public void agreeToAlertBtn(){
        switchTo().alert().accept();
    }

}
