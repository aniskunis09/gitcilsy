package stepDef;

import com.github.javafaker.Faker;
import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.pageBoard;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.fileHandling;

import java.util.concurrent.TimeUnit;

public class board extends env {
    pageBoard elementBoard = new pageBoard();
    Faker faker = new Faker();
    fileHandling fileHandling = new fileHandling();
    String dataBoardName = "src/test/resources/file/listName.txt";
    String dataCardName = "src/test/resources/file/cardName.txt";

    @Then("user is on Current Board Page")
    public void user_is_on_current_board_page() throws InterruptedException {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementBoard.getPageDropdownBoard())
        );
        driver.findElement(elementBoard.getPageDropdownBoard()).click();
        Thread.sleep(2000);
    }
    @When("user click Add New List")
    public void user_click_add_new_list() {
        driver.findElement(elementBoard.getBtnAddList()).click();
    }
    @When("user input Board Name")
    public void user_input_board_name() {
        String boardName = "List Anis " + faker.number().numberBetween(111, 99999);
        fileHandling.writeToFile(dataBoardName, boardName);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementBoard.getInputBoardName())
        );
        WebElement inputBoardName = driver.findElement(elementBoard.getInputBoardName());
        inputBoardName.click();
        inputBoardName.sendKeys(boardName);
    }
    @When("user click Submit button")
    public void user_click_submit_button() {
        driver.findElement(elementBoard.getBtnsubmitBoard()).click();
    }
    @Then("user see success create Board")
    public void user_see_success_create_board() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementBoard.getCtnBoardName(fileHandling.readFromFile(dataBoardName)))
        );
    }


    @When("user click Add New Card button")
    public void user_click_add_new_card_button() {
        driver.findElement(elementBoard.getBtnAddNewCard()).click();
    }
    @And("user input Card Name")
    public void user_input_card_name() {
        String cardName = "Card Anis " + faker.number().numberBetween(111, 99999);
        fileHandling.writeToFile(dataCardName, cardName);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementBoard.getInputCardName())
        );
        WebElement inputCardName = driver.findElement(elementBoard.getInputCardName());
        inputCardName.click();
        inputCardName.sendKeys(cardName);
    }
    @And("user click Tick On Card Name")
    public void user_click_tick_on_card_name() {
        driver.findElement(elementBoard.getTickOnCard()).click();
    }
    @Then("user see success create Card")
    public void user_see_success_create_card() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementBoard.getCtnCard(fileHandling.readFromFile(dataCardName)))
        );
    }
//    @When("user click Add New Private Card")
//    public void user_click_add_new_private_card() {
//
//    }
//    @And("user input Private Card Name")
//    public void user_input_private_card_name() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @And("user click Private card toggle button")
//    public void user_click_private_card_toggle_button() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @And("user click Tick On Private Card Name")
//    public void user_click_tick_on_private_card_name() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("user see Private Card created")
//    public void user_see_private_card_created() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
}
