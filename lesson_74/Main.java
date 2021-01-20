package lesson_74;



public class Main {
    public static void main(String[] args) {

        User u1 = new User("Vlad", "Syshitsky");
        User u2 = new User("Vlad", "Syshitsky");

       // System.out.println(u1 == u2);  //неправильно
        System.out.println(u1.equals(u2));


    }
}
