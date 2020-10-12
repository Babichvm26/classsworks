package lesson20;

public class Main {
    public static void main(String[] args) {
   int balance = 1000;
   int goal = 2000;
   int rate = 11;
   int years = 0;
   while (balance < goal){
       double profilt = balance * rate /100;
       balance +=profilt;
       years++;



      }
   System.out.println(" Накопили " + balance + " за " + years + " лет." );
    }
}
