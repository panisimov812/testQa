package uiTests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class AlertTest extends TestBase{

    @Test
    void checkAlert(){
        open("/alerts");
        alertSteps.clickToAlertBtn();

    }
}
