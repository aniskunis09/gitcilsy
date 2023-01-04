package objectRepository;

import org.openqa.selenium.By;

public class pageTeam {
    By inputTeamName = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText[1]");
    By inputTeamDesc = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText[2]");
    By btnCreateTeam = By.xpath("//android.widget.Button[@content-desc='Create']");


    public By getInputTeamName() {
        return inputTeamName;
    }

    public By getInputTeamDesc() {
        return inputTeamDesc;
    }

    public By getBtnCreateTeam() {
        return btnCreateTeam;
    }
}
