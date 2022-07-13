package starter.serenityswag.authentication;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SerenityRunner.class)
public class WhenLoggingOn extends UIInteractionSteps {

    @Managed
    WebDriver driver;

    @Test
    public void usersCanLoginViaTheHomePage() {
        openUrl("https://www.saucedemo.com");

        $("//input[@data-test='username']").sendKeys("standard_user");
        $("//input[@data-test='password']").sendKeys("secret_sauce");
        $("//input[@data-test='login-button']").click();

        assertThat(find("//span[@class='title']").getText()).isEqualToIgnoringCase("Products");

    }
}
