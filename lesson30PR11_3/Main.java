package lesson30PR11_3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Із масиву видалити дублікати максимума та мінімума");
        int i;  //рабочий индекс циклов
        int n1; //значение минимума
        int n2; //значение максимума
        int i1; //кол минимумов
        int i2; //кол максимумов
        int k;
        int[] numbers = {45, 2 , 6, 7, 56, 21, 2, 25, 24, 2, 56, 5, 3, 2, 9, 28, 34, 56, 36};
        String min,max;
        k=numbers.length;

   // определяем минимум
        n1=1000;
        for (i = 0; i < k; i++) {
//         System.out.println("i="+i +"    n1="+n1+ "   numbers[i]="+numbers[i]);
            if (n1 >= numbers[i]) n1 = numbers[i];
        }
        System.out.println("Минимальный елемент массива = " + n1);
//
// определяем максимум
        n2=-1000;
        for (i = 0; i < k; i++) {
            if (n2 <= numbers[i]) n2 = numbers[i];
        }
        System.out.println("Максимальный елемент массива = " + n2);
        //Опредиляем количество повторений
        i1=0;  i2=0;
        for (i = 0; i < k; i++) {
            if (numbers[i] == n1) i1 = i1 + 1;   //min
            if (numbers[i] == n2) i2 = i2 + 1;   //max
        }
        System.out.println("Кол min ="+i1+ "  Кол max ="+i2);
//Печать массива без повторов
        int pov1=0; int pov2=0;
        for (i = 0; i < k; i++) {
           if (numbers[i] != n1 & numbers[i] != n2) {System.out.println(numbers[i]);}
            if (numbers[i] == n1 & pov1==0) {System.out.println(numbers[i]); pov1=1;}
            if (numbers[i] == n2 & pov2==0) {System.out.println(numbers[i]); pov2=1;}
        }
//====================================
    }
}
