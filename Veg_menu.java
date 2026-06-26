import java.util.Scanner;

class Veg{
    String vegName;
    double pricePerKg;
    int id;

    Veg(String vegName, double pricePerKg, int id){
        this.vegName = vegName;
        this.pricePerKg = pricePerKg;
        this.id = id;
    }

    public void Calculate_Bill(double kg){
        double total = kg * pricePerKg;
        System.out.println("------------");
        System.out.println("Name of the Veg : " + vegName);
        System.out.println("Price per Kg of" + vegName + " is :" + pricePerKg);
        System.out.println("Id of the veg : " + id);
        System.out.println("Total price " + total);

        if(total > 500){
            double discount = total - 50.0;
            double final_price = total - discount;

            System.out.println("discount : " + discount);
            System.out.println("Final Total Price is :" + final_price);
        }else {
            System.out.println("No discount : ");
            System.out.println("Final Total Price is :" + total);
        }
    }
}

class vegShop extends Veg{
    vegShop(String vegName, double pricePerKg, int id) {
        super(vegName, pricePerKg, id);
    }
}
public class Veg_menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----------Veg Menu-----------");
        System.out.println("1. Patato      - Rs120/Kg");
        System.out.println("2. Onion     - Rs150/Kg");
        System.out.println("3. Carrot     - Rs80/Kg");
        System.out.println("4. Cucumber - Rs40/Kg");
        System.out.println("5. Bittergroud   - Rs60/Kg");
        System.out.println("6. Pumpkin     - Rs100/Kg");
        System.out.println("7. Spainch  - Rs90/Kg");
        System.out.println("8. chill    - Rs70/Kg");
        System.out.println("9. Ginger      - Rs250/Kg");
        System.out.println("10. Lashun - Rs300/Kg");

        System.out.println("--------------------------");
        System.out.println("Select the Veg From 1 - 10");
        int choice = sc.nextInt();

        System.out.println("Select Veg is " + choice);

        vegShop veg = null;

        switch (choice) {
            case 1 :
                veg = new vegShop("Potato", "120", "101");
                break;
            case 2 :
                veg = new vegShop("Onion" , "150", "102");
                break;
            case 3:
                veg = new vegShop("")
        }
    }
}
