package starter.serenityswag.authentication.actions;

import net.serenitybdd.core.steps.UIInteractionSteps;

public class LoginActions extends UIInteractionSteps {

    public void asAStandardUser() {

        openUrl("https://www.saucedemo.com");

        $("//input[@data-test='username']").sendKeys("standard_user");
        $("//input[@data-test='password']").sendKeys("secret_sauce");
        $("//input[@data-test='login-button']").click();
    }
}
