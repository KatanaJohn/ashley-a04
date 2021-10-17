package baseline;

//make things easier to work with multiple products and multiple variables and return those values
public class Product {

    String name;
    double price;
    int quantity;

    public Product(String name, double price, int quantity)
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }


    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }

    public int getQuantity()
    {
        return quantity;
    }






}
