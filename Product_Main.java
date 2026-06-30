public class Product_Main {
        public static void main(String[] args) {

            WomenClothing women = new WomenClothing(101, "Kurti", 1299.0, "Cotton");
            MenClothing men = new MenClothing(102, "Shirt", 999.0, "Linen");
            KidsClothing kids = new KidsClothing(103, "Tshirt", 799.0, "cotton");

            women.display();
            men.display();
            kids.display();
        }
    }

