class Calculator {
    public int add(int num1, int num2){
        int r = num1 + num2;
        return r; 
    }
}
public class Object {
    public static void main(String a[]){
        int num1 = 4;
        int num2 = 5;

        Calculator calc = new Calculator();
        int res = calc.add(num1, num2);
        System.out.println(res);
    }
}

// Object has properties and behaviors 
// Create class if you want to create an object