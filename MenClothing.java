public class MenClothing extends Cloth{
    MenClothing(int productId, String productName, double productPrice, String fabricType) {
        super(productId, productName, productPrice, fabricType);
    }

    @Override
    void display() {
        System.out.println("========Men Clothing =========\n");
        super.display();
    }
}
