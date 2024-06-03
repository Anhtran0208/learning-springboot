
public class Inheritance {
    public static void main(String[] args) {
        Calc obj = new Calc();
        int r1 = obj.add(4, 5);
        System.out.println(r1);
        AdvCalc obj2 = new AdvCalc();
        int r2 = obj2.add(3, 6);
        System.out.println(r2);
    }
}
