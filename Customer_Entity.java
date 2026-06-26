
class Customer2{
    private String name;
    private int id;
    private int age;

    public String getEamil() {
        return eamil;
    }

    public void setEamil(String eamil) {
        this.eamil = eamil;
    }

    private String eamil;



    public void setName(String name){
        this.name = name;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public int getAge(){
        return age;
    }

}
public class Customer_Entity {
    public static Customer2 getYoungestCustomer(Customer2 c1, Customer2 c2, Customer2 c3) {
        Customer2 youngest = c1;
        if (c2.getAge() < youngest.getAge()) {
            youngest = c2;
        }
        if (c3.getAge() < youngest.getAge()) {
            youngest = c3;
        }
        return youngest;
    }

        public static void main (String[]args){

            Customer2 c1 = new Customer2();
            c1.setName("Rahul");
            c1.setId(101);
            c1.setAge(25);

            Customer2 c2 = new Customer2();
            c2.setName("Aman");
            c2.setId(102);
            c2.setAge(20);


            Customer2 c3 = new Customer2();
            c3.setName("Ram");
            c3.setId(103);
            c3.setAge(2);

       Customer2 youngest = getYoungestCustomer(c1, c2 , c3);
            System.out.println("Youngest Customer Details");
            System.out.println("-------------------------");
            System.out.println("Name  : " + youngest.getName());
            System.out.println("ID    : " + youngest.getId());
            System.out.println("Age   : " + youngest.getAge());
        }
    }


