package objectRepository;

import org.openqa.selenium.By;

public class pageBuy {
    By btnAddtoCart = By.id("add-to-cart-sauce-labs-backpack");
    By btnShoppingCart = By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a");
    By btnCheckout = By.id("checkout");
    By fieldFirstName = By.id("first-name");
    By fieldLastName = By.id("last-name");
    By fieldPostcode = By.id("postal-code");
    By btnContinue = By.id("continue");
    By dplPaymentInformation = By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div[1]");
    By btnFinishShopping = By.id("finish");
    By dplCompleteOrder = By.xpath("/html/body/div/div/div/div[2]/h2");
    By btnBackToHomePage = By.id("back-to-products");
    By dplHomePage = By.xpath("/html/body/div/div/div/div[1]/div[2]");

    public By getBtnAddtoCart() {
        return btnAddtoCart;
    }

    public By getBtnShoppingCart() {
        return btnShoppingCart;
    }

    public By getBtnCheckout() {
        return btnCheckout;
    }

    public By getFieldFirstName() {
        return fieldFirstName;
    }

    public By getFieldLastName() {
        return fieldLastName;
    }

    public By getFieldPostcode() {
        return fieldPostcode;
    }

    public By getBtnContinue() {
        return btnContinue;
    }

    public By getDplPaymentInformation() {
        return dplPaymentInformation;
    }

    public By getBtnFinishShopping() {
        return btnFinishShopping;
    }

    public By getDplCompleteOrder() {
        return dplCompleteOrder;
    }

    public By getBtnBackToHomePage() {
        return btnBackToHomePage;
    }

    public By getDplHomePage() {
        return dplHomePage;
    }
}
