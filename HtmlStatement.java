public class HtmlStatement extends Statement {
    public String getHeader(String name) {
        return "<H1>Rentals for <EM>" + name + "</EM></H1><P>\n";
    }

    public String getFigure(String title, double charge) {
        return title + ": " + String.valueOf(charge) + "<BR>\n";
    }

    public String getFooter(double totalCharge, int totalFrequentRenterPoints) {
        return "<P>You owe <EM>" + String.valueOf(totalCharge) + "</EM><P>\n" + "On this rental you earned <EM>"
                + String.valueOf(totalFrequentRenterPoints) + "</EM> frequent renter points<P>";
    }
}
