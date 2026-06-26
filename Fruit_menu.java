import java.util.Scanner;

class Fruit {

    String fruitName;
    double pricePerKg;
    int id;

    Fruit(String fruitName, double pricePerKg, int id) {
        this.fruitName = fruitName;
        this.pricePerKg = pricePerKg;
        this.id = id;
    }

    public void calculateBill(double kg) {

        double total = kg * pricePerKg;

        System.out.println("\nFruit Name : " + fruitName);
        System.out.println("Fruit ID   : " + id);
        System.out.println("Price/Kg   : ₹" + pricePerKg);
        System.out.println("Quantity   : " + kg + " Kg");
        System.out.println("Total Bill : ₹" + total);

        if (total > 500) {

            double discount = total * 0.50;
            double finalBill = total - discount;

            System.out.println("Discount (50%) : ₹" + discount);
            System.out.println("Final Bill     : ₹" + finalBill);

        } else {

            System.out.println("No Discount");
            System.out.println("Pay Amount     : ₹" + total);
        }
    }
}

class FruitShop extends Fruit {

    FruitShop(String fruitName, double pricePerKg, int id) {
        super(fruitName, pricePerKg, id);
    }
}

public class Fruit_menu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("---------- FRUIT SHOP ----------");
        System.out.println("1. Apple      - Rs120/Kg");
        System.out.println("2. Mango      - Rs150/Kg");
        System.out.println("3. Orange     - Rs80/Kg");
        System.out.println("4. Watermelon - Rs40/Kg");
        System.out.println("5. Banana     - Rs60/Kg");
        System.out.println("6. Grapes     - Rs100/Kg");
        System.out.println("7. Pineapple  - Rs90/Kg");
        System.out.println("8. Papaya     - Rs70/Kg");
        System.out.println("9. Kiwi       - Rs250/Kg");
        System.out.println("10. Strawberry - Rs300/Kg");

        System.out.print("\nSelect Fruit (1-10): ");
        int choice = sc.nextInt();

        System.out.println("Select fruit is : " + choice);

        FruitShop fruit = null;

        switch (choice) {

            case 1:
                fruit = new FruitShop("Apple", 120, 101);
                break;

            case 2:
                fruit = new FruitShop("Mango", 150, 102);
                break;

            case 3:
                fruit = new FruitShop("Orange", 80, 103);
                break;

            case 4:
                fruit = new FruitShop("Watermelon", 40, 104);
                break;

            case 5:
                fruit = new FruitShop("Banana", 60, 105);
                break;

            case 6:
                fruit = new FruitShop("Grapes", 100, 106);
                break;

            case 7:
                fruit = new FruitShop("Pineapple", 90, 107);
                break;

            case 8:
                fruit = new FruitShop("Papaya", 70, 108);
                break;

            case 9:
                fruit = new FruitShop("Kiwi", 250, 109);
                break;

            case 10:
                fruit = new FruitShop("Strawberry", 300, 110);
                break;

            default:
                System.out.println("Invalid Choice");
                sc.close();
                return;
        }

        System.out.print("\nEnter Quantity (Kg): ");
        double kg = sc.nextDouble();

        fruit.calculateBill(kg);
    }
}