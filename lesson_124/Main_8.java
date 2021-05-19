package lesson_124;

public class Main_8 {
    public static void main(String[] args) {
        String strHexNumber = "20";

        int decimalNumber = Integer.parseInt(strHexNumber, 16);

        System.out.println("Hexadecimal number converted to decimal number");
        System.out.println("Decimal number is :" + decimalNumber );
    }
}
