package stepDefinitions;

import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import objectRepository.pageBuy;

public class buy extends env {
    pageBuy elementBuy = new pageBuy();
    @When("user click button Add To Cart")
    public void user_click_button_add_to_cart() {
        driver.findElement(elementBuy.getBtnAddtoCart()).click();
    }
    @And("user open Shooping Cart")
    public void user_open_shooping_cart() {
        driver.findElement(elementBuy.getBtnShoppingCart()).click();
    }
    @And("user click button Checkout")
    public void user_click_button_checkout() {
        driver.findElement(elementBuy.getBtnCheckout()).click();
    }
    @And("user complete details information")
    public void user_complete_details_information() {
        driver.findElement(elementBuy.getFieldFirstName()).sendKeys("Anisatun");
        driver.findElement(elementBuy.getFieldLastName()).sendKeys("Nafi'ah");
        driver.findElement(elementBuy.getFieldPostcode()).sendKeys("63253");
        driver.findElement(elementBuy.getBtnContinue()).click();
    }
    @And("user see payment information confirmation order")
    public void user_see_payment_information_confirmation_order() {
        driver.findElement(elementBuy.getDplPaymentInformation()).isDisplayed();
        System.out.println("Payment information has displayed");
    }
    @And("user click button Finish Shopping")
    public void user_click_button_finish_shopping() {
        driver.findElement(elementBuy.getBtnFinishShopping()).click();
    }
    @And("user see display complete order")
    public void user_see_display_complete_order() {
        driver.findElement(elementBuy.getDplCompleteOrder()).isDisplayed();
        System.out.println("Your order has complete");
    }
    @When("user click back to Home page")
    public void user_click_back_to_home_page() {
        driver.findElement(elementBuy.getBtnBackToHomePage()).click();
    }
    @And("user see display Home page")
    public void user_see_display_home_page() {
        driver.findElement(elementBuy.getDplHomePage()).isDisplayed(); //"//*[contains(text(),'Products')]"
        System.out.println("Yeay, you are navigated to home page ");
    }
}
