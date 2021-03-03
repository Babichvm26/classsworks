package lesson103_3;
import java.util.Scanner;public class Main {
    public static void main(String[] args) {

        int[] m = {-1, 0, 1};
        Scanner sc = new Scanner(System.in);

        try {
            int a = sc.nextInt();
            m[a] = 4 / a;

            System.out.println(m[a]);
            System.out.println("arithmetic exception");
            System.out.println(4 / a);
            System.out.println("END try");

        } catch (ArithmeticException ae) {
            System.out.println("Divided by 0");

        }catch (ArrayIndexOutOfBoundsException aa){
            System.out.println("array index out exception");

        }finally {
            System.out.println("Finish Scanner");
            sc.close();

        }
    }
}

