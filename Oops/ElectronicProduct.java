package Oops;

public class ElectronicProduct extends Product {
     protected double warrantyYear;
     protected double powerConsumption;

     ElectronicProduct(int productId, String productName, double price , String brand, double warrantyYear, double powerConsumption){
         super(productId, productName , price, brand);

         this.warrantyYear = warrantyYear;
         this.powerConsumption = powerConsumption;
     }

     public void display(){
         super.display();

         System.out.println("Warranty    :  " +warrantyYear + "Year");
         System.out.println("Power       :   " + powerConsumption + "W");
     }

    @Override
    public double calculateDiscount() {
        return price * 0.10;
    }
}
