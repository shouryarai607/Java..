// Save this file as CoffeeOrder.java

public class CoffeeOrder {
    
    // Attributes (Fields)
    String blend;
    double price;
    boolean isIced;

    // Constructor to initialize the object
    public CoffeeOrder(String blend, double price, boolean isIced) {
        this.blend = blend;
        this.price = price;
        this.isIced = isIced;
    }

    // A method to display order details
    public void displayOrder() {
        String temperature = isIced ? "Iced" : "Hot";
        System.out.println("Order: " + temperature + " " + blend + " - $" + price);
    }

    // The Main method: where the magic starts
    public static void main(String[] args) {
        // Creating an instance (Object) of CoffeeOrder
        CoffeeOrder myDrink = new CoffeeOrder("Dark Roast", 4.50, true);
        
        // Calling a method
        System.out.println("--- Welcome to Java Beans ---");
        myDrink.displayOrder();
    }
}

public