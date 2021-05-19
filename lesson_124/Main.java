package lesson_124;

public class Main {
    public static void main(String[] args) {

        //Преобразование Sting в Inteder с помощью конструктора
        Integer intObj = new Integer(10);
        Integer intObj1 = new Integer("100");
        System.out.println(intObj1);

        String str = "100";
        Integer intObj2 = Integer.valueOf(str);
        System.out.println(intObj2);

        String str1 = intObj.toString();
        System.out.println("Integer converted to String as " + str1);


    }
}
