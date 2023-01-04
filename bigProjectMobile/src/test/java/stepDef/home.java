package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.pageHome;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.net.MalformedURLException;

public class home extends hooks {
    pageHome elementHome = new pageHome();

    @Given("user is on Home page")
    public void user_is_on_home_page() throws MalformedURLException {
        before();
        if (driver.findElement(elementHome.getBtnChooseComp()).isDisplayed()) {
            wait.until(
                    ExpectedConditions.visibilityOfElementLocated(elementHome.getPageHome())
            );
        } else {
            driver.findElement(elementHome.getBtnCloseNotif1()).click();
//        driver.findElement(elementHome.getBtnCloseNotif2()).click();
            wait.until(
                    ExpectedConditions.visibilityOfElementLocated(elementHome.getPageHome())
            );
        }
    }
    @When("user click Create New Company button")
    public void user_click_create_new_company_button() {
        driver.findElement(elementHome.getBtnCreateComp()).click();
    }

    @When("user click Choose Company Name")
    public void user_click_choose_company_name() {
        driver.findElement(elementHome.getBtnChooseComp()).click();
    }

    @Then("user is on Current Company Page")
    public void user_is_on_current_company_page() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementHome.getCtnTeam())
        );
    }

    @And("user click Add Yellow button")
    public void user_click_add_yellow_button() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementHome.getBtnAddYellow())
        );
        driver.findElement(elementHome.getBtnAddYellow()).click();
    }

    @And("user choose Add New Team button")
    public void user_choose_add_new_team_button() {
        driver.findElement(elementHome.getBtnNewTeam()).click();
    }

}
