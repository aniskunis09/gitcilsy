package stepDefinitions;

import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.pageDashboard;
import objectRepository.pageLogin;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.fileHandling;

public class login extends env {
    pageLogin elementLogin = new pageLogin();
    pageDashboard elementDashboard = new pageDashboard();
    fileHandling fileHandling = new fileHandling();


    String dataUsername = "resources/file/Username.txt";
    String dataPassword = "resources/file/Password.txt";

    @Given("user is on Login page")
    public void user_is_on_login_page() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementLogin.getBtnLogin())
        );
    }
    @When("user input Username Admin")
    public void user_input_username_admin() {
        WebElement inputUsername = driver.findElement(elementLogin.getFieldUsername());
        inputUsername.isDisplayed();
        String username = "Admin";
        inputUsername.sendKeys(username);
    }
    @And("user input Password Admin")
    public void user_input_password_admin() {
        WebElement inputPassword = driver.findElement(elementLogin.getFieldPassword());
        inputPassword.isDisplayed();
        String password = "admin123";
        inputPassword.sendKeys(password);
    }
    @And("user click button Login")
    public void user_click_button_login() {
        WebElement btnLogin = driver.findElement(elementLogin.getBtnLogin());
        btnLogin.sendKeys(Keys.ENTER);
    }
    @Then("user navigated to Dashboard page")
    public void user_navigated_to_dashboard_page() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementDashboard.getPanelDashboard())
        );
        driver.findElement(elementDashboard.getPanelDashboard()).isDisplayed();
    }


    @When("user input Username User")
    public void user_input_username_user() {
        WebElement inputUsername = driver.findElement(elementLogin.getFieldUsername());
        inputUsername.isDisplayed();
        String username = fileHandling.readFromFile(dataUsername);
        inputUsername.sendKeys(username);
    }
    @And("user input Password User")
    public void user_input_password_user() {
        WebElement inputPassword = driver.findElement(elementLogin.getFieldPassword());
        inputPassword.isDisplayed();
        String password = fileHandling.readFromFile(dataPassword);
        inputPassword.sendKeys(password);
    }
}
