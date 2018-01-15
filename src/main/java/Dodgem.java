public class Dodgem extends Ride{


    public Dodgem(String type, double price, int minimumAge, int minimumHeightInCentimetres) {
        super(type, price, minimumAge, minimumHeightInCentimetres);
    }

    @Override
    public String ride() {
        return "Dodgem ride!";
    }


}
