package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import objectRepository.pageCompany;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class company extends hooks {
    pageCompany elementCompany = new pageCompany();

    @And("user input Company Name")
    public void user_input_company_name() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementCompany.getInputCompanyName())
        );
        driver.findElement(elementCompany.getInputCompanyName()).click();
        String compName = "Big Project SQA 16";
        driver.findElement(elementCompany.getInputCompanyName()).sendKeys(compName);
    }

    @And("user input Company Description")
    public void user_input_company_description() {
        driver.findElement(elementCompany.getInputCompanyDesc()).click();
        String compDesc = "Company untuk Big Project SQA 16";
        driver.findElement(elementCompany.getInputCompanyDesc()).sendKeys(compDesc);
    }

    @And("user click Create Company button")
    public void user_click_create_company_button() {
        driver.findElement(elementCompany.getBtnCreateCompany()).click();
    }

    @Then("user see success create Company notification")
    public void user_see_success_create_company_notification() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementCompany.getNotifSuccessComp())
        );
        driver.findElement(elementCompany.getNotifSuccessComp()).isDisplayed();
        driver.findElement(elementCompany.getBtnCloseNotif3()).click();
    }
}
