 public class Cloth extends Product{
   String fabricType;
    Cloth(int productId, String productName, double productPrice, String fabricType) {
        super(productId, productName, productPrice);
        this.fabricType = fabricType;
    }
     void display(){
          super.display();
         System.out.println("FabricType of the Product   :  " + fabricType);
     }

}


