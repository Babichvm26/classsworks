package lesson23;

public class SystemExitExample {
    public static void main(String[] args) {
        System.out.println("Begin");
        if(true){return;}
        System.exit(0);
        System.out.println("End");
    }
}
