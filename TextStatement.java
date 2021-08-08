import java.util.Enumeration;

public class TextStatement extends Statement {
    public String value(Customer aCustomer) {
        Enumeration<Rental> rentals = aCustomer.getRentals();
        String result = getHeader(aCustomer.getName());
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += getFigure(each.getMovie().getTitle(), each.getCharge());
        }
        result += getFooter(aCustomer.getTotalCharge(), aCustomer.getTotalFrequentRenterPoints());
        return result;
    }

    private String getHeader(String name) {
        return "Rental Record for " + name + "\n";
    }

    private String getFigure(String title, double charge) {
        return "\t" + title + "\t" + String.valueOf(charge) + "\n";
    }

    private String getFooter(double totalCharge, int totalFrequentRenterPoints) {
        return "Amount owed is " + String.valueOf(totalCharge) + "\n" + "You earned "
                + String.valueOf(totalFrequentRenterPoints) + " frequent renter points";
    }
}
