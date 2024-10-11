package org.dataqa.pages;

import org.dataqa.utils.Selectors;
import org.openqa.selenium.By;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.driver;

/**
 * Класс для работы с браузерными окнами и вкладками.
 */
public class BrowserWindowPage {

    private final By NEW_TAB_BTN = Selectors.byID(" tabButton");
    private final By TITLE_IN_NEW_TAB = Selectors.byID("sampleHeading");
    private final By NEW_WINDOW_BTN = Selectors.byID("windowButton");

    /**
     * Нажимает на кнопку для открытия новой вкладки.
     */
    public void clickToNewTabBtn(){
        $(NEW_TAB_BTN).click();
    }

    /**
     * Проверяет, что заголовок новой вкладки содержит ожидаемое значение.
     *
     * @param title Ожидаемый заголовок страницы.
     */
    public void titleShuoldHave(String title){
         $(TITLE_IN_NEW_TAB).find(title);
    }

    /**
     * Проверяет, что новое окно было открыто.
     */
    public void checkThatNewWindowIsOpened(){
        Set<String> allWindows = driver().getWebDriver().getWindowHandles();
        assertEquals(2,allWindows.size());
    }

    /**
     * Проверяет, что заголовок нового окна содержит ожидаемое значение.
     *
     * @param title Ожидаемый заголовок страницы.
     */
    public void windowShouldHaveTitle(String title) {
        $(TITLE_IN_NEW_TAB).find(title);
    }

    /**
     * Нажимает на кнопку для открытия нового окна.
     */
    public void clickNewWindowBtn() {
        $(NEW_WINDOW_BTN).click();
    }

}
