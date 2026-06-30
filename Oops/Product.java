package Oops;

public  abstract class Product {
    protected  int productId;
    protected String productName;
    protected double price;
    protected  String brand;

    Product(int productId, String productName, double price, String brand){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.brand = brand;
    }
    void display(){
        System.out.println("------------Product Details----------");
        System.out.println("Id of the Product     :  " + productId);
        System.out.println("Name of the Product   :   " + productName);
        System.out.println("Price of the Product   :   " + price);
        System.out.println("Brand of the Product   :    " + brand);
    }

    public abstract  double calculateDiscount();
}

