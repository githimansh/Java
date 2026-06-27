import java.util.Scanner;

class Veg {
    String vegName;
    double pricePerKg;
    int id;

    Veg(String vegName, double pricePerKg, int id) {
        this.vegName = vegName;
        this.pricePerKg = pricePerKg;
        this.id = id;
    }

    public void calculateBill(double kg) {
        double total = kg * pricePerKg;

        System.out.println("\n-------------------------");
        System.out.println("Vegetable Name : " + vegName);
        System.out.println("Price Per Kg   : Rs." + pricePerKg);
        System.out.println("Vegetable ID   : " + id);
        System.out.println("Quantity       : " + kg + " Kg");
        System.out.println("Total Price    : Rs." + total);

        if (total > 500) {
            double discount = total * 0.10; // 10% discount
            double finalPrice = total - discount;

            System.out.println("Discount (10%) : Rs." + discount);
            System.out.println("Final Price    : Rs." + finalPrice);
        } else {
            System.out.println("No Discount");
            System.out.println("Final Price    : Rs." + total);
        }
    }
}

class VegShop extends Veg {

    VegShop(String vegName, double pricePerKg, int id) {
        super(vegName, pricePerKg, id);
    }
}

public class Veg_menu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("----------- Veg Menu -----------");
        System.out.println("1. Potato      - Rs120/Kg");
        System.out.println("2. Onion       - Rs150/Kg");
        System.out.println("3. Carrot      - Rs80/Kg");
        System.out.println("4. Cucumber    - Rs40/Kg");
        System.out.println("5. Bitter Gourd- Rs60/Kg");
        System.out.println("6. Pumpkin     - Rs100/Kg");
        System.out.println("7. Spinach     - Rs90/Kg");
        System.out.println("8. Chilli      - Rs70/Kg");
        System.out.println("9. Ginger      - Rs250/Kg");
        System.out.println("10. Garlic     - Rs300/Kg");

        System.out.print("\nEnter your choice (1-10): ");
        int choice = sc.nextInt();

        VegShop veg = null;

        switch (choice) {
            case 1:
                veg = new VegShop("Potato", 120, 101);
                break;

            case 2:
                veg = new VegShop("Onion", 150, 102);
                break;

            case 3:
                veg = new VegShop("Carrot", 80, 103);
                break;

            case 4:
                veg = new VegShop("Cucumber", 40, 104);
                break;

            case 5:
                veg = new VegShop("Bitter Gourd", 60, 105);
                break;

            case 6:
                veg = new VegShop("Pumpkin", 100, 106);
                break;

            case 7:
                veg = new VegShop("Spinach", 90, 107);
                break;

            case 8:
                veg = new VegShop("Chilli", 70, 108);
                break;

            case 9:
                veg = new VegShop("Ginger", 250, 109);
                break;

            case 10:
                veg = new VegShop("Garlic", 300, 110);
                break;

            default:
                System.out.println("Invalid Choice!");
                System.exit(0);
        }

        System.out.print("Enter Quantity (Kg): ");
        double kg = sc.nextDouble();

        veg.calculateBill(kg);

        sc.close();
    }
}