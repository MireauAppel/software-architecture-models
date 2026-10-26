import Bibliothèque.DigitalMedia;
import Bibliothèque.User;

public class Loan {
    private final User user;
    private final DigitalMedia medium;
    private final String loanDate;
    private final String returnDate;

    public Loan(User user, DigitalMedia medium, String loanDate, String returnDate) {
        this.user = user;
        this.medium = medium;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
    }

    public String toString() {
        return user.getDescription() + ", " + medium.getType() + ", " + loanDate + " - " + returnDate;
    }
}
