package hellocucumber;

public class IsItFriday {

    private String today;
    private String isItFriday;

    IsItFriday(String today) {
        this.today = today;
    }

    public void checkIfIsItFriday() {
        this.isItFriday = "Friday".equals(this.today) ? "TGIF" : "No";
    }

    public String getIsItFriday() {
        return isItFriday;
    }
}
