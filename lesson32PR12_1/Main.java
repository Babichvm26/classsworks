package lesson32PR12_1;

public class Main {
    public static void main(String[] args) {
        int[] numbers1 = new int[1+(int)(Math.random()*10)];
        for (int i = 0, n = numbers.length; i < n; i++) {
            numbers1[i] = (int) (Math.random() * 100*Math.pow(-1,i));
        }
        int[] numbers2 = new int[1+(int)(Math.random()*10)];
        for (int i = 0, n = numbers2.length; i < n; i++) {
            numbers2[i] = (int) (Math.random() * 100*Math.pow(-1,i));
        }
        int avr1 = 0, avr2=0;
//Находим среднее первого массивов

        avr1 =avr1/numbers1.lengt;
        for (int temp: numbers.length{

            avr1 = avr1 +temp;
        }
        avr1 = avr1/numbers1.length;
        for (int temp: numbers1){
            System.out.println(temp + " ");
        }
        System.out.println();
        System.out.println(avr1);

        }
    //Находим среднее второго массивов
        for (int temp: numbers2){
        avr2 = avr2 + temp;

    }

    avr2 = avr2/numbers2.length;
        for (int temp: numbers1){
        System.out.println(temp + " ");
    }
        System.out.println();
        System.out.println(avr2);
        int[] result =new int[numbers.length + numbers2.length];
        for(int i= 0, n=result.length; i<n; i++){
        if (i < numbers1.lengt)
            result[i] = numbers1[i];
        }else{
        result[i] = numbers2[i - numbers1.lengt];
        for (int temp: result){
            System.out.println(temp +" ");
        }
        System.out.println();
       //Вывод на екран массива результата
        for (int temp: result){
            System.out.println();
            //Считаем сколько чисел между средними
            for (int temp:result){
                if (avr1>avr2){
                    if(avr2 < temp & temp < avr1){
                        cont++;
                    }
                }else{
                    if (avr1<temp & temp < avr2){
                        count++;
                    }
                }

            }


}

}
