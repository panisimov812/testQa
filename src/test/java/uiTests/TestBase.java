package uiTests;

import org.junit.jupiter.api.BeforeAll;

import com.codeborne.selenide.Configuration;
import uiSteps.TextBoxSteps;

import static com.codeborne.selenide.Selenide.*;

import static io.qameta.allure.Allure.step;

public class TestBase {

    TextBoxSteps textBoxSteps = new TextBoxSteps();
    @BeforeAll
    static void setUp(){

        Configuration.baseUrl = "https://demoqa.com";

        step("открывает textbox", () -> {
            open("/text-box");
        });
    }
}
