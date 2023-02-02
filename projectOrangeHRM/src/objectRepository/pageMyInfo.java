package objectRepository;

import org.openqa.selenium.By;

public class pageMyInfo {
//    By chooseNationality = By.xpath();
//    By chooseMaritalStatus = By.xpath();
    public By getMenuMyInfo() {
        By menuMyInfo = By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a");
        return menuMyInfo;
    }
    public By getFormPersonalDetails() {
        By formPersonalDetails = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/h6");
        return formPersonalDetails;
    }
    public By getDropdownNationality() {
        By dropdownNationality = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div/div[2]/i");
        return dropdownNationality;
    }
    public By getDropdownMaritalStatus() {
        By dropdownMaritalStatus = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div/div[2]/i");
        return dropdownMaritalStatus;
    }
    public By getGenderFemale() {
        By genderFemale = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/label/span");
        return genderFemale;
    }
}
