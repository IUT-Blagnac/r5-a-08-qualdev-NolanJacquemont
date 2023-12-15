package fr.nolan.app;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/fr/nolan/app",
        glue = "src/test/java/fr/nolan/app",
        plugin = {"json:target/cucumber.json"}
)
public class RunCucumberTest {

}