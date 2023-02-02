package objectRepository;

import org.openqa.selenium.By;

public class pageLogin {
    public By getLogoOrange() {
        By logoOrange = By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[1]/img");
        return logoOrange;
    }
    public By getFieldUsername() {
        By fieldUsername = By.name("username");
        return fieldUsername;
    }
    public By getFieldPassword() {
        By fieldPassword = By.name("password");
        return fieldPassword;
    }
    public By getBtnLogin() {
        By btnLogin = By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
        return btnLogin;
    }
}
