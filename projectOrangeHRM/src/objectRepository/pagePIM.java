package objectRepository;

import org.openqa.selenium.By;

public class pagePIM {
    public By getBtnAddEmployee() {
        By btnAddEmployee = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div[1]/button");
        return btnAddEmployee;
    }
    public By getFieldFirstName() {
        By fieldFirstName = By.name("firstName");
        return fieldFirstName;
    }
    public By getFieldMiddleName() {
        By fieldMiddleName = By.name("middleName");
        return fieldMiddleName;
    }
    public By getFieldLastName() {
        By fieldLastName = By.name("lastName");
        return fieldLastName;
    }
    public By getSwitchCreateLoginDtl() {
        By switchCreateLoginDtl = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span");
        return switchCreateLoginDtl;
    }
    public By getUsernameNewUser() {
        By usernameNewUser = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input");
        return usernameNewUser;
    }
    public By getPasswordNewUser() {
        By passwordNewUser = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input");
        return passwordNewUser;
    }
    public By getConfirmPswdNewUser() {
        By confirmPswdNewUser = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input");
        return confirmPswdNewUser;
    }
    public By getBtnSaveNewUser() {
        By btnSaveNewUser = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]");
        return btnSaveNewUser;
    }
    public By getNotifSuccessNewUser() {
        By notifSuccessNewUser = By.xpath("//*[@id='oxd-toaster_1']/div");
        return notifSuccessNewUser;
    }

    public By getPersonalDtlPage() {
        By personalDtlPage = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/h6");
        return personalDtlPage;
    }


}
