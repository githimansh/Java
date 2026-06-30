public class WomenClothing extends Cloth{
    WomenClothing(int productId, String productName, double productPrice, String fabricType) {
        super(productId, productName, productPrice, fabricType);
    }
    @Override
    void display() {
        System.out.println("===== Women Clothing =====\n");
        super.display();
    }
}
