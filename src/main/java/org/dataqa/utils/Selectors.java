package org.dataqa.utils;

import org.openqa.selenium.By;

public class Selectors {

    public static By byID(String id) {
        return By.cssSelector("#" + id);
    }

    public static By byClass(String className) {
        return By.cssSelector("[class='" + className + "'" + "]");
    }
}
