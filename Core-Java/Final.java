// final class: no one can extend it 
final class A {
    public void show(){
        System.out.println("In A show");
    }
    public void add(int num1, int num2){
        System.out.println(num1 + num2);
    }
}
public class Final {
    public static void main(String[] args) {
        final int num  = 8; //cannot change the value because of final kw
        // num = 9;
        System.out.println(num);
        A obj = new A();
        obj.show();
        obj.add(4, 10);
    }
}
