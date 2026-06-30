public class KidsClothing extends Cloth{
    KidsClothing(int productId, String productName, double productPrice, String fabricType) {
        super(productId, productName, productPrice, fabricType);
    }

    @Override
    void display() {
        System.out.println("========Kids Clothing=====\n");
        super.display();
    }
}
