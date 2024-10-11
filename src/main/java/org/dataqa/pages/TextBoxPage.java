package org.dataqa.pages;

import org.dataqa.utils.Selectors;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

/**
 * Класс для работы с полями текстового ввода на странице.
 */
public class TextBoxPage {

    //поля с сайта
    private final By FULL_NAME_INPUT = Selectors.byID("userName");
    private final By EMAIL_INPUT = Selectors.byID("userEmail");
    private final By CURRENT_ADDRESS_INPUT = Selectors.byID("currentAddress");
    private final By PERMANENT_ADDRESS_INPUT = Selectors.byID("permanentAddress");
    private final By SUBMIT_BUTTON = Selectors.byID("submit");
    private final By COMPLETE_FORM = Selectors.byClass("border col-md-12 col-sm-12");


    /**
     * Заполняет поле "Полное имя".
     *
     * @param fullName Полное имя.
     */
    public void fillFullName(String fullName) {
        $(FULL_NAME_INPUT).setValue(fullName);
    }

    /**
     * Заполняет поле "Email".
     *
     * @param email Адрес электронной почты.
     */
    public void fillEmail(String email) {
        $(EMAIL_INPUT).setValue(email);
    }

    /**
     * Заполняет поле "Текущий адрес".
     *
     * @param currentAddress Текущий адрес.
     */
    public void currentAddress(String currentAddress) {
        $(CURRENT_ADDRESS_INPUT).setValue(currentAddress);
    }

    /**
     * Заполняет поле "Постоянный адрес".
     *
     * @param permanentAddress Постоянный адрес.
     */
    public void permanentAddress(String permanentAddress) {
        $(PERMANENT_ADDRESS_INPUT).setValue(permanentAddress);
    }

    /**
     * Нажимает кнопку "Отправить".
     */
    public void clickSubmitBtn(){
        $(SUBMIT_BUTTON).click();
    }

    /**
     * Проверяет, что форма содержит введенные данные.
     *
     * @param fullName Полное имя.
     * @param email Email.
     * @param currentAddress Текущий адрес.
     * @param permanentAddress Постоянный адрес.
     */
    public void completedFormShouldHaveInfo(String fullName, String email, String currentAddress, String permanentAddress) {
        $(COMPLETE_FORM).shouldHave(text(fullName), text(email), text(currentAddress), text(permanentAddress));
    }


}
