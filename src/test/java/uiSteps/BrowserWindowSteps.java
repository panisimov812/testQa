package uiSteps;

import net.serenitybdd.annotations.Step;
import org.dataqa.pages.BrowserWindowPage;

public class BrowserWindowSteps {
    BrowserWindowPage browserWindowPage = new BrowserWindowPage();

    @Step("нажать на кнопку для открытия новой вкладки")
    public void clickToNewTabBtn(){
        browserWindowPage.clickToNewTabBtn();
    }

    @Step("Проверка наличия тайтла")
    public void pageShouldHaveTitle(String title) {
        browserWindowPage.titleShuoldHave(title);
    }

    @Step("Проверяем что открылось окно")
    public void checkThatNewWindowIsOpened( ) {
        browserWindowPage.checkThatNewWindowIsOpened();
    }

    @Step("Проверка наличия тайтла в новом окне")
    public void windowShouldHaveTitle(String title) {
        browserWindowPage.windowShouldHaveTitle(title);
    }

    @Step("нажал на кнопку для открытия нового  окна")
    public void clickNewWindowOpen() {
        browserWindowPage.clickNewWindowBtn();
    }

}
