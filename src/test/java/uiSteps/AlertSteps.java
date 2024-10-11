package uiSteps;

import net.serenitybdd.annotations.Step;
import org.dataqa.pages.AlertPage;

public class AlertSteps {

    AlertPage alertPage = new AlertPage();

    @Step("нажали на кнопку")
    public void clickToAlertBtn(){
        alertPage.clickToAlertBtn();
    }

    @Step("Закрыть алерт попап")
    public void agreeToAlert(){
        alertPage.agreeToAlertBtn();
    }
}
