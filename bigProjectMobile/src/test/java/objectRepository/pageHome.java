package objectRepository;

import org.openqa.selenium.By;

public class pageHome {
    By btnCloseNotif1 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");
//    By btnCloseNotif2 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[3]/android.widget.Button");
    By pageHome = By.xpath("//android.widget.ImageView[@content-desc='logo']");
    By btnCreateComp = By.xpath("//android.widget.Button[@content-desc='Create New Company']");
    By btnChooseComp = By.xpath("//android.view.View[@content-desc='Big Project SQA 16']");

    By ctnTeam = By.xpath("//android.view.View[@content-desc='Start adding new Team by clicking the yellow button!']");
    By btnAddYellow = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button");
    By btnNewTeam = By.xpath("//android.view.View[@content-desc='Add new team']");



    public By getBtnCloseNotif1() {
        return btnCloseNotif1;
    }
//    public By getBtnCloseNotif2() {
//        return btnCloseNotif2;
//    }
    public By getPageHome() {
        return pageHome;
    }
    public By getBtnCreateComp() {
        return btnCreateComp;
    }
    public By getBtnChooseComp() {
        return btnChooseComp;
    }
    public By getCtnTeam() {
        return ctnTeam;
    }
    public By getBtnAddYellow() {
        return btnAddYellow;
    }
    public By getBtnNewTeam() {
        return btnNewTeam;
    }
}
