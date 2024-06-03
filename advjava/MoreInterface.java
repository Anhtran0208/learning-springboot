package advjava;

interface Computer {
    void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("Coding in laptop");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("Coding in desktop");
    }
}

class Developer{
    public void devApp(Computer computer){
        computer.code();
    }
}
public class MoreInterface {
    public static void main(String[] args) {
        Developer dev = new Developer();
        Computer desktop = new Desktop();
        Computer lap = new Laptop();
        dev.devApp(lap);
        dev.devApp(desktop);
    }
}
