package uiTests;

import org.junit.jupiter.api.Test;

public class TextBoxTests extends TestBase {

    @Test
    void fillAllForms() {
        String fullName = "Name LastName";
        String email = "email@emlae.ru";
        String currentAddress = "sdfdsf12 2345r2";
        String permanentAddress = "sdfgs345234";

        textBoxSteps.fillFullName(fullName);
        textBoxSteps.fillEmail(email);
        textBoxSteps.currentAddress(currentAddress);
        textBoxSteps.permanentAddress(permanentAddress);
        textBoxSteps.clickBtn();
        textBoxSteps.completedFormShouldHaveInfo(fullName, email, currentAddress, permanentAddress);
    }
}
