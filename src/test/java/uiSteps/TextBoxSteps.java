package uiSteps;

import net.serenitybdd.annotations.Step;
import org.dataqa.pages.TextBoxPage;

public class TextBoxSteps {

    TextBoxPage textBoxPage = new TextBoxPage();

    @Step("Fill full name")
    public void fillFullName(String fullName) {
        textBoxPage.fillFullName(fullName);
    }

    @Step("Fill email")
    public void fillEmail(String email) {
        textBoxPage.fillEmail(email);
    }

    @Step("Fill current address")
    public void currentAddress(String currentAddress) {
        textBoxPage.currentAddress(currentAddress);
    }

    @Step("Fill permanent address")
    public void permanentAddress(String permanentAddress) {
        textBoxPage.permanentAddress(permanentAddress);
    }

    @Step("Fill permanent address")
    public void clickBtn() {
        textBoxPage.clickSubmitBtn();
    }

    @Step("Checking the completed form for availability - full name({0})," +
            "email({1}), current address ({2}) and permanent address({3})")
    public void completedFormShouldHaveInfo(String fullName, String email, String currentAddress, String permanentAddress) {
        textBoxPage.completedFormShouldHaveInfo(fullName, email, currentAddress, permanentAddress);
    }

}
