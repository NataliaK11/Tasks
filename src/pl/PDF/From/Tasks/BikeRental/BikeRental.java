package pl.PDF.From.Tasks.BikeRental;

public class BikeRental {
    private int days;
    private double profit;


    private static int pointsOfColour(Colour colour) {
        if (colour.equals(Colour.BLUE))
            return 250;
        else if (colour.equals(Colour.RED))
            return 500;
        else return 100;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public void BikeRental() {

    }

    public double orderBike(int days, Colour colour, boolean frame, double widthOfTire) {
        double price;
        int pointsOfColour = pointsOfColour(colour);

        if (frame)
            price = days * ((pointsOfColour + widthOfTire / 3)) / 20;
        else price = days * 2 * ((pointsOfColour + widthOfTire / 3)) / 20;
        profit += price;
        return price;
    }
}
