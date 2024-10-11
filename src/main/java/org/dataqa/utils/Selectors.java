package org.dataqa.utils;

import org.openqa.selenium.By;

/**
 * Утилитарный класс для работы с селекторами.
 */
public class Selectors {

    /**
     * Возвращает селектор для элемента по ID.
     *
     * @param id ID элемента.
     * @return Селектор.
     */
    public static By byID(String id) {
        return By.cssSelector("#" + id);
    }

    /**
     * Возвращает селектор для элемента по классу.
     *
     * @param className Имя класса элемента.
     * @return Селектор.
     */
    public static By byClass(String className) {
        return By.cssSelector("[class='" + className + "'" + "]");
    }


}
