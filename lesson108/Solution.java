package lesson108;

public class Solution {
    public static void main(String[] args) throws Exception {
        try {


            int a = 33 / 0;

        } catch (ArithmeticException e) {
            System.out.println(e);

            //Ошибка деления на ноль


        }
    }
}
