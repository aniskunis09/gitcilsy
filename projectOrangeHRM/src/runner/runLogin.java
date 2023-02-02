package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        features = "resources/features/TC1 - Login as Admin.feature",
        glue = "stepDefinitions",
        plugin = "html:target/HTML_report.html"
//        tags = "@Positive"
)
public class runLogin {

}
