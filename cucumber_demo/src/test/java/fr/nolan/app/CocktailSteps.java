package fr.nolan.app;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

public class CocktailSteps {
    private Order order;

    @Given("{string} who wants to buy a drink")
    public void whoWantsToBuyADrink(String name) {
        order = new Order();
        order.declareOwner(name);
    }

    @When("an order is declared for {string}")
    public void anOrderIsDeclaredFor(String target) {
        order.declareTarget(target);
    }

    @And("a message saying {string} is added")
    public void aMessageSayingIsAdded(String message) {
        order.addMessage(message);
    }

    @Then("there are {int} cocktails in the order")
    public void thereAreCocktailsInTheOrder(int expectedCocktails) {
        List<String> cocktails = order.getCocktails();
        Assert.assertEquals(expectedCocktails, cocktails.size());
    }

    @Then("the ticket must say {string}")
    public void theTicketMustSay(String expected) {
        String message = order.getMessage();
        Assert.assertEquals(expected, message);
    }
}
