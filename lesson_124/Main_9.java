package lesson_124;

public class Main_9 {
    public static void main(String[] args) {
        String strOvtalNumber = "33";

        int decimalNumber = Integer.parseInt(strOvtalNumber, 8);

        System.out.println("Octal number converted to decimal number");
        System.out.println("Decimal number is:" + decimalNumber);
    }
}
