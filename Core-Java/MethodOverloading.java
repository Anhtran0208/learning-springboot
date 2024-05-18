class Calculator{
    public int add(int num1, int num2){
        return num1 + num2;
    }
    public double add(int num1, double num2){
        return num1 + num2;
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(3, 4));
    }
}
