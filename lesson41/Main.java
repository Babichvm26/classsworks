package lesson41;

public class Main {
    int x;
    static  int y;
    public static void main(String[] args) {
        int x = 7;
        for (int i = 0; i < 5; i++) {

        }
   int i = 5;
        Main m = new Main();
        m.x = 5;
        Main.y = 7;
        m.changeX();


    }
    void  changeX(){
        int x = 0;
        System.out.println(x);
        x = 999;
        System.out.println(x);
    }


}
