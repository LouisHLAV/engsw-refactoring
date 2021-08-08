import java.util.Enumeration;

public class HtmlStatement extends Statement {
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
        return "<H1>Rentals for <EM>" + name + "</EM></H1><P>\n";
    }

    private String getFigure(String title, double charge) {
        return title + ": " + String.valueOf(charge) + "<BR>\n";
    }

    private String getFooter(double totalCharge, int totalFrequentRenterPoints) {
        return "<P>You owe <EM>" + String.valueOf(totalCharge) + "</EM><P>\n" + "On this rental you earned <EM>"
                + String.valueOf(totalFrequentRenterPoints) + "</EM> frequent renter points<P>";
    }
}
