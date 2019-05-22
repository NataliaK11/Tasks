package pl.PDF.From.Tasks.BikeRental;


public class Main {
    public static void main(String[] args) {
        BikeRental bikeRental=new BikeRental();
        System.out.println(bikeRental.orderBike(15, Colour.RED, true, 25));
    }
}
