package advjava;

enum Laptop {
    Macbook(2000), HP(700), Surface(1500), Dell(1200);
    private int price;

    //Constructor 
    private Laptop(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
}
public class EnumClass {
    public static void main(String[] args) {
        Laptop lap = Laptop.Dell;
        System.out.println(lap);
        System.out.println(lap.getPrice());

        Laptop[] allLaptops = Laptop.values();
        for (Laptop laptop: allLaptops){
            System.out.println(laptop);
            System.out.println(laptop.getPrice());
        }
    }
}
