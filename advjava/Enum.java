package advjava;

enum Status {
    Running, Failure, Pending, Success;
}
public class Enum {
    public static void main(String[] args) {
        int i = 5;
        Status s = Status.Running;
        System.out.println(s);
        System.out.println(s.ordinal());

        Status[] allStatus = Status.values();
        for (Status status:allStatus){
            System.out.println(status);
        }
    }
}
