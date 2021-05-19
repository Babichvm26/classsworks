package lesson_124;

public class Main_3 {
    public static void main(String[] args) {
        int i = 56;
//Преобразование десятичного числа в двоичное
       String strBinaryNumber = Integer.toBinaryString(i);
        System.out.println("Convert decimal number to binary number example");
        System.out.println("Binary value of " + i + " is " + strBinaryNumber);

    }
}
