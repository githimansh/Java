package Oops;

public class Laptop extends ElectronicProduct{
    protected String processor;
    protected double screenSize;

    Laptop(int productId, String productName, double price , String brand, double warrantyYear, double powerConsumption, String processor, double screenSize){
        super(productId, productName , price, brand, warrantyYear, powerConsumption);

        this.processor = processor;
        this.screenSize = screenSize;
    }
    public void display(){
        System.out.println("-------Laptop Details--------");
        super.display();
        System.out.println("Processor is  :  "  + processor);
        System.out.println("ScreenSize is  :  " + screenSize);

        double discount = calculateDiscount();
        System.out.println("Discount is     : " + discount);
        System.out.println("Final Price is  : " + (price - discount));
    }

    @Override
    public double calculateDiscount() {
        return price *.18;
    }
}
