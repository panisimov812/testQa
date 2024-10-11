package uiTests;

import io.qameta.allure.Attachment;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.OutputType;
import uiSteps.AlertSteps;
import uiSteps.BrowserWindowSteps;
import uiSteps.TextBoxSteps;

import static com.codeborne.selenide.Selenide.*;

import static io.qameta.allure.Allure.step;

import static com.codeborne.selenide.Selenide.screenshot;

public class TestBase {

    TextBoxSteps textBoxSteps = new TextBoxSteps();
    AlertSteps alertSteps = new AlertSteps();
    BrowserWindowSteps browserWindowSteps = new BrowserWindowSteps();

    @BeforeEach
    void setUp(){
        String environment = System.getProperty("stage", "prod");

        switch(environment) {
            case "prod":
                Configuration.baseUrl = "https://demoqa.com";
                break;
            case "stage":
            default:
                Configuration.baseUrl = "https://stage.demoqa.com";
                break;
        }

        Configuration.browser = "Firefox";
        Configuration.browserSize =  "1920x1080";
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
