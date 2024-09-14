package uiTests;

import io.qameta.allure.Attachment;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.OutputType;
import uiSteps.TextBoxSteps;

import static com.codeborne.selenide.Selenide.*;

import static io.qameta.allure.Allure.step;

import static com.codeborne.selenide.Selenide.screenshot;

public class TestBase {

    TextBoxSteps textBoxSteps = new TextBoxSteps();
    @BeforeAll
    static void setUp(){

        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browser = "Firefox";
        step("открывает textbox", () -> {
            open("/text-box");
        });
    }

    @AfterEach
    public void tearDown() {
        // Сохранение скриншота после каждого теста
        screenshot("screenshot_after_test");
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshotToAllure() {
        // Сохраняем скриншот и возвращаем его как массив байт для Allure
        return screenshot(OutputType.BYTES);
    }
}
