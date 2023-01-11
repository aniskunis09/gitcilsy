package stepDef;

import config.env;
import objectRepository.pageLogin;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class login extends env {
    pageLogin elementLogin = new pageLogin();

    public void user_has_open_cicle_app() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementLogin.getPageCicle())
        );
    }
    public void user_click_skip_button() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementLogin.getBtnSkip())
        );
        driver.findElement(elementLogin.getBtnSkip()).click();
    }
    public void user_click_sign_in_button() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementLogin.getBtnSignIn())
        );
        driver.findElement(elementLogin.getBtnSignIn()).click();
    }
    public void user_click_sign_in_by_google_account_button() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementLogin.getBtnSignInGoogle())
        );
        driver.findElement(elementLogin.getBtnSignInGoogle()).click();
    }
    public void user_choose_account() {
        driver.findElement(elementLogin.getBtnChooseAccount()).click();
    }
}
