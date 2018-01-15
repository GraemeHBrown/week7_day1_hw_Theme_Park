public abstract class Ride {

    private String type;
    private double price;
    private int minimumAge;
    private int minimumHeightInCentimetres;

    public Ride(String type, double price, int minimumAge, int minimumHeightInCentimetres){
        this.type = type;
        this.price = price;
        this.minimumAge = minimumAge;
        this.minimumHeightInCentimetres = minimumHeightInCentimetres;
    }

    public abstract String ride();


    public String getType() {
        return this.type;
    }

    public int getMinimumAge() {
        return this.minimumAge;
    }

    public int getMinimumHeight() {
        return this.minimumHeightInCentimetres;
    }

    public double getPrice() {
        return this.price;
    }
}
