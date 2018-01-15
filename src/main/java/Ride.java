public abstract class Ride {

    private String type;
    private float price;
    private int minimumAge;
    private int minimumHeightInCentimetres;

    public Ride(String type, float price, int minimumAge, int minimumHeightInCentimetres){
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

    public float getMinimumHeight() {
        return this.minimumHeightInCentimetres;
    }

    public float getPrice() {
        return this.price;
    }
}
