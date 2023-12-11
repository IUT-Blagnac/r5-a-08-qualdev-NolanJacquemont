package fr.nolan.app;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private String owner;
    private String target;
    private String message;

    public void declareOwner(String romeo) {
        this.owner = romeo;
    }

    public void declareTarget(String juliette) {
        this.target = juliette;
    }

    public List<String> getCocktails() {
        return new ArrayList<>();
    }

    public void addMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return "From " + this.owner + " to " + this.target + ": " + this.message;
    }

    public String getOwner() {
        return owner;
    }

    public String getTarget() {
        return target;
    }
}
