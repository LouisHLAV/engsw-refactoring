import java.util.Enumeration;

public abstract class Statement {
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

    public abstract String getHeader(String name);
    public abstract String getFigure(String title, double charge);
    public abstract String getFooter(double totalCharge, int totalFrequentRenterPoints);
}
