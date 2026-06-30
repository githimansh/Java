public class Product {
        int productId;
        String productName;
        double productPrice;
   Product(int productId, String productName, double productPrice){
       this.productId = productId;
       this.productName = productName;
       this.productPrice = productPrice;
   }
    void display(){
        System.out.println("----Product Details------");
        System.out.println("Nmae of the Product   :     " + productName);
        System.out.println("ID of the product     :     " + productId);
        System.out.println("Price of the Product  :     "  + productPrice);
    }
    }
