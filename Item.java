


public class Item {

    // Member variables:

    private String name;

    private double price;



    public Item() {

    }



    // Constructor
    public Item(String name, double price) {
        this.name = name;
        this.price = price;

    }



    // Getters and Setters
    public String getName() {
        return this.name;

    }

    public double getPrice() {
        return this.price;

    }

    public void setName(String name) {
        this.name = name;

    }

    public void setPrice(double price) {
        this.price = price;

    }

}