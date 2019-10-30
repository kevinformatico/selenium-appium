package runnings;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@Login",
        plugin = {"junit:target/cucumber.xml", "json:target/cucumber.json"})

public class LoginRunning extends Running{

}
