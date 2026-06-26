class Customer {
    String name;
    int id;
    int age;

    Customer(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
}

class Task6 {

    public static void youngestCustomer(Customer c1, Customer c2) {

        if (c1.age < c2.age) {
            System.out.println(c1.name + " is the youngest customer");
        } else if (c2.age < c1.age) {
            System.out.println(c2.name + " is the youngest customer");
        } else {
            System.out.println("Both customers have the same age");
        }
    }

 public static Customer getYoungestCustomer(Customer c1, Customer c2) {

        if (c1.age < c2.age) {
            return c1;
        } else {
            return c2;
        }
    }


    public static void main(String[] args) {

        Customer c1 = new Customer("Himanshu", 101, 21);
        Customer c2 = new Customer("Rahul", 102, 24);

        youngestCustomer(c1, c2);
        Customer youngest = getYoungestCustomer(c1, c2);
        
        System.out.println("Name: " + youngest.name);
        System.out.println("Id: " + youngest.id);
        System.out.println("Age: " + youngest.age);
    }
}