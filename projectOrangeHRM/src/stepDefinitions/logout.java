package stepDefinitions;

import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.pageLogout;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class logout extends env {
    public int duration = 10;
    WebDriverWait wait = new WebDriverWait(driver, duration);
    pageLogout elementLogout = new pageLogout();
    @When("user click Burger Menu")
    public void user_click_burger_menu() {
        WebElement btnContainer = driver.findElement(elementLogout.getBtnBurgerMenu());
        btnContainer.click();
    }
    @And("user click button Logout")
    public void user_click_button_logout() {
        WebElement btnLogout = driver.findElement(elementLogout.getBtnLogout());
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        btnLogout.click();
    }
    @Then("user verify (.*) logout result$")
    public void user_verify_success_logout_result(String status) {
        if (status.contains("success")){
            wait.until(
                    ExpectedConditions.presenceOfElementLocated(elementLogout.getCtnButtonLogin())
            );
            System.out.println("Successfully logout");
        } else {
            driver.findElement(elementLogout.getBtnError());
        }
    }
}
