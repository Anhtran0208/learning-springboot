
public class Inheritance {
    public static void main(String[] args) {
        Calc obj = new Calc();
        int r1 = obj.add(4, 5);
        System.out.println(r1);
        AdvCalc obj2 = new AdvCalc();
        int r2 = obj2.add(3, 6);
        System.out.println(r2);
        VeryAdvCalc obj3 = new VeryAdvCalc();
        int r3 = obj3.add(45, 89);
        System.out.println(r3);
    }
}
