package fr.nolan.app;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.jupiter.api.Assertions;

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
        Assertions.assertDoesNotThrow(() -> {
            System.out.println("Testing game numbers");
            this.pgnChecker.checkGameNumber();
        });
        System.out.println("OK");
    }

    @Then("Each game in a pgn file should contain a white player")
    public void eachGameInAPgnFileMustContainAWhitePlayer() {
        Assertions.assertDoesNotThrow(() -> {
            System.out.println("Testing white players");
            this.pgnChecker.checkWhitePlayers();
        });
        System.out.println("OK");
    }

    @Then("Each game in a pgn file should contain a black player")
    public void eachGameInAPgnFileMustContainABlackPlayer() {
        Assertions.assertDoesNotThrow(() -> {
            System.out.println("Testing black players");
            this.pgnChecker.checkBlackPlayers();
        });
        System.out.println("OK");
    }

    @Then("Each game in a pgn file should contain a final result")
    public void eachGameInAPgnFileMustContainAResult() {
        Assertions.assertDoesNotThrow(() -> {
            System.out.println("Testing game results");
            this.pgnChecker.checkGameResults();
        });
        System.out.println("OK");
    }
}
