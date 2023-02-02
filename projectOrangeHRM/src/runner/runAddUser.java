package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "resources/features/TC2 - Add New User.feature",
        glue = "stepDefinitions"
)
public class runAddUser {
}
