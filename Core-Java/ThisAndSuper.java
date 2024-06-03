class A {
    public A(){
        System.out.println("in A");
    }
    public A(int n){
        super();
        System.out.println("int A int");
    }
}
class B extends A {
    public B() {
        super(); // Call the instructor of the super class 
        System.out.println("in B");
    }
    public B(int n){
        // super();
        this(); //call the instructor of the same class
        System.out.println("int B int");
    }
}
public class ThisAndSuper {
    public static void main(String[] args) {
        B obj = new B(5);
        // B obj2 = new B();

    }
}
