package stepDefinitions;

import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.pageDashboard;
import objectRepository.pagePIM;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.fileHandling;


public class user extends env {
    pageDashboard elementDashboard = new pageDashboard();
    pagePIM elementPIM = new pagePIM();
    fileHandling fileHandling = new fileHandling();


    String dataUsername = "resources/file/Username.txt";
    String dataPassword = "resources/file/Password.txt";

    @When("user click menu PIM")
    public void user_click_menu_pim() {
        driver.findElement(elementDashboard.getMenuPIM()).click();
    }
    @And("user click button Add Employee")
    public void user_click_button_add_employee() {
        driver.findElement(elementPIM.getBtnAddEmployee()).click();
    }
    @And("user input First Name")
    public void user_input_first_name() {
        WebElement inputFirstName = driver.findElement(elementPIM.getFieldFirstName());
        inputFirstName.isDisplayed();
        String firstName = "Anis";
        inputFirstName.sendKeys(firstName);
    }
    @And("user input Middle Name")
    public void user_input_middle_name() {
        WebElement inputMiddleName = driver.findElement(elementPIM.getFieldMiddleName());
        inputMiddleName.isDisplayed();
        String middleName = "Tes";
        inputMiddleName.sendKeys(middleName);
    }
    @And("user input Last Name")
    public void user_input_last_name() {
        WebElement inputLastName = driver.findElement(elementPIM.getFieldLastName());
        inputLastName.isDisplayed();
        String lastName = "123";
        inputLastName.sendKeys(lastName);
    }
    @And("user click switch Create Login Details")
    public void user_click_switch_create_login_details() {
        driver.findElement(elementPIM.getSwitchCreateLoginDtl()).click();
    }
    @And("user input Username for New User")
    public void user_input_username_for_new_user() {
        wait.until(
                ExpectedConditions.elementToBeClickable(elementPIM.getUsernameNewUser())
        );
        WebElement inputNewUsername = driver.findElement(elementPIM.getUsernameNewUser());
        inputNewUsername.click();
        String newUsername = "anistes123";
        inputNewUsername.sendKeys(newUsername);
        fileHandling.writeToFile(dataUsername, newUsername);
    }
    @And("user input Password for New User")
    public void user_input_password_for_new_user() {
        WebElement inputPasswordNewUser = driver.findElement(elementPIM.getPasswordNewUser());
        inputPasswordNewUser.click();
        String newPassword = "Anistes123@";
        inputPasswordNewUser.sendKeys(newPassword);
        fileHandling.writeToFile(dataPassword, newPassword);
    }
    @And("user input Confirm Password for New User")
    public void user_input_confirm_password_for_new_user() {
        WebElement inputConfPasswordNewUser = driver.findElement(elementPIM.getConfirmPswdNewUser());
        inputConfPasswordNewUser.isDisplayed();
        String newConfPassword = "Anistes123@";
        inputConfPasswordNewUser.sendKeys(newConfPassword);
    }
    @And("user click button Save")
    public void user_click_button_save() {
        driver.findElement(elementPIM.getBtnSaveNewUser()).click();
    }
    @Then("user navigated to Personal Details page")
    public void user_navigated_to_personal_details_page() {
        driver.findElement(elementPIM.getNotifSuccessNewUser()).isDisplayed();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementPIM.getPersonalDtlPage())
        );
        driver.findElement(elementPIM.getPersonalDtlPage()).isDisplayed();
    }
}




















