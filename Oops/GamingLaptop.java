package Oops;

public class GamingLaptop extends  Laptop{
    protected String graphicsCard;
    protected double refreshRate;

    GamingLaptop(int productId, String productName, double price , String brand, double warrantyYear, double powerConsumption, String processor, double screenSize, String graphicsCard, double refreshRate){
        super(productId, productName , price, brand, warrantyYear, powerConsumption, processor, screenSize);

        this.graphicsCard = graphicsCard;
        this.refreshRate = refreshRate;
    }

    @Override
    public void display() {
        System.out.println("---------Gaming Laptop-----------");
        super.display();
        System.out.println("GraphicsCard is  : "  + graphicsCard );
        System.out.println("Refresh Rate is  : "  + refreshRate);

         double discount = calculateDiscount();
        System.out.println("Discount is " + discount);
        System.out.println("Final Price is " + (price - discount));
    }

    @Override
    public double calculateDiscount() {
        return price * 0.22;
    }
}
