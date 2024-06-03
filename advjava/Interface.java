package advjava;

// All methods in interface is public abstract
interface A {
    // All variables in interface are final and static
    int age=44;
    String area="Area";
    void show ();
    void config();
}

class B implements A {
    public void show(){
        System.out.println("In show");
    }
    public void config(){
        System.out.println("In config");
    }
}
public class Interface {
    public static void main(String[] args) {

        // create an object 
        A obj; 
        obj = new B();
        obj.show();
        obj.config();
        System.out.println(A.age);
    }
}
