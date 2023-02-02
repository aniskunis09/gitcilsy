package objectRepository;

import org.openqa.selenium.By;

public class pageLogout {
    By btnBurgerMenu = By.id("react-burger-menu-btn");
    By btnLogout = By.id("logout_sidebar_link");
    By ctnButtonLogin = By.id("login_button_container");
    By btnError = By.className("error-button");

    public By getBtnBurgerMenu() {
        return btnBurgerMenu;
    }

    public By getBtnLogout() {
        return btnLogout;
    }

    public By getCtnButtonLogin() {
        return ctnButtonLogin;
    }

    public By getBtnError() {
        return btnError;
    }
}
