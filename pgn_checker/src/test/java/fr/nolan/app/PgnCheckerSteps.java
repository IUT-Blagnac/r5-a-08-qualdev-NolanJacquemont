package fr.nolan.app;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class PgnCheckerSteps {

    private PgnChecker pgnChecker;

    @Given("A PGN file to review at {string}")
    public void aPGNFileToReviewAt(String path) {
        this.pgnChecker = new PgnChecker(path);
    }

    @When("I load PGN file data")
    public void iLoadPGNFileData() {
        this.pgnChecker.loadData();
    }

    @Then("The pgn file should contain at least one valid game")
    public void thePgnFileShouldContainAtLeastOneValidGame() {
        try {
            System.out.println("Testing game numbers");
            this.pgnChecker.checkGameNumber();
        } catch (RuntimeException e) {
            Assert.fail(e.getMessage());
        }
        System.out.println("OK");
    }

    @Then("Each game in a pgn file should contain a white player")
    public void eachGameInAPgnFileMustContainAWhitePlayer() {
        try {
            System.out.println("Testing white players");
            this.pgnChecker.checkWhitePlayers();
        } catch (RuntimeException e) {
            Assert.fail(e.getMessage());
        }
        System.out.println("OK");
    }

    @Then("Each game in a pgn file should contain a black player")
    public void eachGameInAPgnFileMustContainABlackPlayer() {
        try {
            System.out.println("Testing black players");
            this.pgnChecker.checkBlackPlayers();
        } catch (RuntimeException e) {
            Assert.fail(e.getMessage());
        }
        System.out.println("OK");
    }

    @Then("Each game in a pgn file should contain a final result")
    public void eachGameInAPgnFileMustContainAResult() {
        try {
            System.out.println("Testing game results");
            this.pgnChecker.checkGameResults();
        } catch (RuntimeException e) {
            Assert.fail(e.getMessage());
        }
        System.out.println("OK");
    }
}
