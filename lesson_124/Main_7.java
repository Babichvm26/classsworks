package lesson_124;

public class Main_7 {
    public static void main(String[] args) {

        int i = 27;

        String strOctalNumber = Integer.toOctalString(i);

        System.out.println("Converted decimal number to octal number example");
        System.out.println("Octal value of"+ i + " is " +strOctalNumber);
    }
}
