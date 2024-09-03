package uiSteps;

import net.serenitybdd.annotations.Step;
import org.dataqa.pages.ElementsPage;

public class TextBoxSteps {

    ElementsPage elementsPage = new ElementsPage();

    @Step("Fill full name")
    public void fillFullName(String fullName) {
        elementsPage.fillFullName(fullName);
    }

    @Step("Fill email")
    public void fillEmail(String email) {
        elementsPage.fillEmail(email);
    }

    @Step("Fill current address")
    public void currentAddress(String currentAddress) {
        elementsPage.currentAddress(currentAddress);
    }

    @Step("Fill permanent address")
    public void permanentAddress(String permanentAddress) {
        elementsPage.permanentAddress(permanentAddress);
    }

    @Step("Fill permanent address")
    public void clickBtn() {
        elementsPage.clickSubmitBtn();
    }

    @Step("Checking the completed form for availability - full name({0})," +
            "email({1}), current address ({2}) and permanent address({3})")
    public void completedFormShouldHaveInfo(String fullName, String email, String currentAddress, String permanentAddress) {
        elementsPage.completedFormShouldHaveInfo(fullName, email, currentAddress, permanentAddress);
    }

}
