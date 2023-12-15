package hellocucumber;

import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions;

public class StepDefinitions {

    private IsItFriday isItFriday;

    @Given("an example scenario")
    public void anExampleScenario() {
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }

    @Given("today is {string}")
    public void todayIsDay(String day) {
        isItFriday = new IsItFriday(day);
    }

    @When("I ask whether it's Friday yet")
    public void iAskWhetherItSFridayYet() {
        isItFriday.checkIfIsItFriday();
    }

    @Then("I should be told {string}")
    public void iShouldBeTold(String string) {
        Assertions.assertEquals(string, isItFriday.getIsItFriday());
    }
}
