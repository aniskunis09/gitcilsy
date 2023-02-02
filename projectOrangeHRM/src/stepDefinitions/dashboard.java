package stepDefinitions;

import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.pageDashboard;
import objectRepository.pageFilter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static org.junit.Assert.assertNotSame;

public class dashboard extends env {
    pageDashboard elementDashboard = new pageDashboard();

    @When("user click icon Stopwatch")
    public void user_click_icon_stopwatch() {
        driver.findElement(elementDashboard.getIconStopwatch()).click();
    }
    @And("user input Date Punch-In")
    public void user_input_date_punch_in() {
        WebElement inputDatePI = driver.findElement(elementDashboard.getDatePI());
        inputDatePI.click();
        String datePI = "2023-01-31";
        inputDatePI.sendKeys(datePI);
    }
    @And("user input Time Punch-In")
    public void user_input_time_punch_in() {
        WebElement inputTimePI = driver.findElement(elementDashboard.getTimePI());
        inputTimePI.click();
        String timePI = "08:00 AM";
        inputTimePI.sendKeys(timePI);
    }
    @And("user input Note Punch-In")
    public void user_input_note_punch_in() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementDashboard.getFormPI())
        );
        WebElement inputNotePI = driver.findElement(elementDashboard.getTxtNotePI());
        inputNotePI.click();
        String notePI = "Tes Note Punch-In Anis";
        inputNotePI.sendKeys(notePI);
    }
    @And("user click button In")
    public void user_click_button_in() {
        driver.findElement(elementDashboard.getBtnIN()).click();
    }
    @Then("user navigated to Punch-Out page")
    public void user_navigated_to_punch_out_page() {
//        driver.findElement(elementDashboard.getNotifSuccessPI()).isDisplayed();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementDashboard.getBtnOUT())
        );
        driver.findElement(elementDashboard.getBtnOUT()).isDisplayed();
    }
}
