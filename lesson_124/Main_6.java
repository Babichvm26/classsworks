package lesson_124;

public class Main_6 {
    public static void main(String[] args) {
//Преобразование десятичного числа в шестандцатиричную
        int i = 32;

        String strHexNumber = Integer.toHexString(i);

        System.out.println("Converted decimal number to hexadecimal number example");
        System.out.println("Hexadecimal value of "+ i +" is " + strHexNumber);
    }
}
