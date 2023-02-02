package objectRepository;

import org.openqa.selenium.By;

public class pageFilter {
    By btnSort = By.xpath("/html/body/div/div/div/div[1]/div[2]/div[2]/span/select");
    By fltPrice = By.xpath("/html/body/div/div/div/div[1]/div[2]/div[2]/span/select/option[3]");
    By prcProductBefore = By.className("inventory_item_price");
    By nameProducts = By.className("inventory_item_name");
    public By getBtnSort() {
        return btnSort;
    }

    public By getFltPrice() {
        return fltPrice;
    }

    public By getPrcProductBefore() {
        return prcProductBefore;
    }

    public By getNameProducts() {
        return nameProducts;
    }
}
