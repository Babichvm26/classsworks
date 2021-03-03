package lesson103_2;

public class Dispatcher {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        int[] a = {2, 7, 5};

        try {
            System.out.println("Start");
            System.out.println(x / y);
        } catch (ArithmeticException ae) {

            System.out.println("Finish Scanner");
            System.out.println("After divided");
            System.out.println(a[2]);
            System.out.println("After arrays element");
            System.out.println("In catch");
            System.out.println(ae);
            System.out.println("In catch divided");
            System.out.println(ae);
            System.out.println("Finaly");
            System.out.println("Exception type" );
        }finally {
            System.out.println("Finish");



        }
    }
}