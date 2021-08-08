public class TextStatement extends Statement {
    public String getHeader(String name) {
        return "Rental Record for " + name + "\n";
    }

    public String getFigure(String title, double charge) {
        return "\t" + title + "\t" + String.valueOf(charge) + "\n";
    }

    public String getFooter(double totalCharge, int totalFrequentRenterPoints) {
        return "Amount owed is " + String.valueOf(totalCharge) + "\n" + "You earned "
                + String.valueOf(totalFrequentRenterPoints) + " frequent renter points";
    }
}
