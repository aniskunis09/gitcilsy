package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import objectRepository.pageCompany;
import objectRepository.pageTeam;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class team extends hooks {
    pageTeam elementTeam = new pageTeam();

    @And("user input Team Name")
    public void user_input_team_name() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementTeam.getInputTeamName())
        );
        driver.findElement(elementTeam.getInputTeamName()).click();
        String teamName = "Team 2 Jan";
        driver.findElement(elementTeam.getInputTeamName()).sendKeys(teamName);
    }

    @And("user input Team Description")
    public void user_input_team_description() {
        driver.findElement(elementTeam.getInputTeamDesc()).click();
        String teamDesc = "Team 2 Jan SQA 16";
        driver.findElement(elementTeam.getInputTeamDesc()).sendKeys(teamDesc);
    }

    @And("user click Create Team button")
    public void user_click_create_team_button() {
        driver.findElement(elementTeam.getBtnCreateTeam()).click();
    }


}
