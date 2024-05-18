class Mobile {
    String brand;
    int cost;
    static String name;

    public Mobile(){
        brand = "";
        cost = 200;
    }
    public void show(){
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + cost);
        System.out.println("Name: " + name);
    }
    public static void show1(Mobile obj){
        System.out.println("In static method...");
        System.out.println(obj.brand + " : " + obj.cost) ;

    }
}
public class Static {
    public static void main(String[] args) {
        Mobile phone1 = new Mobile();
        phone1.brand = "Apple";
        phone1.cost = 1400;
        Mobile.name = "Smartphone";
        phone1.show();

        Mobile.show1(phone1);
    }
}
