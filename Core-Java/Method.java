class Computer {
    public void playMusic(){
        System.out.println("Music playing");
    }
    public String getAPen(int cost){
        return "Pen";
    }
}
public class Method {
    public static void main(String a[]){
        Computer computer = new Computer();
        computer.playMusic();
        computer.getAPen(10);
    }
}
