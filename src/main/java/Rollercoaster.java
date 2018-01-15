public class Rollercoaster extends Ride {


    public Rollercoaster(String type, float price, int minimumAge, int minimumHeightInCentimetres) {
        super(type, price, minimumAge, minimumHeightInCentimetres);
    }

    @Override
    public String ride() {
        return "Coaster ride!";
    }


}
