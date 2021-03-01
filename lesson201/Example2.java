package lesson201;

public class Example2 {
    public static void main(String[] args) {
        int[] numbers = {45, 2, 6, 7, 21, 25, 24, 5, 3, 9, 28, 34, 56, 36};
        int i,k,i1,i2;
        int n1,n2, n3 ;
        // определяем минимум
        n1=1000;  i1=0;
        System.out.println("n1="+n1);
        k=numbers.length;
        System.out.println("k="+k);

        for (i = 0; i < k; i++) {
//         System.out.println("i="+i +"    n1="+n1+ "   numbers[i]="+numbers[i]);
            if (n1 >= numbers[i]) {
                n1 = numbers[i];  i1=i;
            }
        }
        System.out.println("Минимальный елемент массива = " + n1 +"   индекс i1="+i1);
//
// определяем максимум
        n2=-1000; i2=0;
        for (i = 0; i < k; i++) {
            if (n2 <= numbers[i]) {
                n2 = numbers[i];   i2=i;
            }
        }
        System.out.println("Максимальный елемент массива = " + n2 + "   индекс i2="+i2);
//
        // обмен местами
        n3= numbers[i1];    numbers[i1]=numbers[i2];  numbers[i2] =n3;

        for (i = 0; i < k; i++) {
            System.out.println(numbers[i]);
        }

    }
}
