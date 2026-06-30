package Oops;
public class Main {

    public static void main(String[] args) {

        Product products[] = {

                new MobilePhone(
                        101,
                        "Samsung Galaxy S25",
                        85000,
                        "Samsung",
                        2,
                        25,
                        12,
                        256,
                        5000),

                new Laptop(
                        102,
                        "Dell Inspiron",
                        78000,
                        "Dell",
                        3,
                        90,
                        "Intel i7",
                        15.6),

                new GamingLaptop(
                        103,
                        "ASUS ROG",
                        145000,
                        "ASUS",
                        3,
                        180,
                        "Intel i9",
                        16,
                        "RTX 4070",
                        240)

        };

        for (Product p : products) {

            p.display();

            System.out.println("--------------------------------");
        }
    }
}