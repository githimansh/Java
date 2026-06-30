package Oops;

public class MobilePhone extends ElectronicProduct{
    protected int ram;
    protected int storage;
    protected int batterCapacity;

    MobilePhone(int productId, String productName, double price , String brand, double warrantyYear, double powerConsumption, int ram , int storage, int batterCapacity){
        super(productId, productName , price, brand, warrantyYear, powerConsumption);

        this.ram = ram;
        this.storage = storage;
        this.batterCapacity = batterCapacity;

    }
    public void display(){
        System.out.println("--------Mobile Details--------");
 super.display();
        System.out.println("Ram            :  " + ram + " GB ");
        System.out.println("Storage        :   " + storage  + " GB ");
        System.out.println("Batterycapacity :  " + batterCapacity );

        double discount = calculateDiscount();

        System.out.println("Discount       :   " + discount);
        System.out.println("Final Price is  :   " + (price - discount));

    }

    @Override
    public double calculateDiscount() {
        return price * 0.15;
    }
}
