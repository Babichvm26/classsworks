package lesson_124;

public class Main_2 {
    public static void main(String[] args) {
//Перевод из двоичного числа в десятичное с использыванием обвёртки Integer.parseInt
        String strBinaryNumber = "111000";

        int decimalNumber = Integer.parseInt(strBinaryNumber,2);
        System.out.println("Binary number converted to decimal number");
        System.out.println("Decimal number is:" + decimalNumber);

    }
}
