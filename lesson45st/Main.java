package lesson45st;

public class Main {
        public static void main(String[] args) {

        System.out.println("Взять любой английский текст и вывести все индексы буквы 'a'. Сделать с помощью циклов.");
        String name = ("Module 'Project' production: java.lang.ClassCastException: class org.jetbrains.");
        System.out.println(name);
         int n = name.length(); //длина количества символов
        System.out.println("Количество символов в строке = "+n);
        System.out.println("Ищем индекы символа a:");

        int[] nind = new int[n];
        char sumb='a';
        int n1=0;
        for (int i = 0; i < n; i++) {
        char c = name.charAt(i);
          if(c == sumb) {
            n1=n1+1;
            nind[i]=i;
            System.out.println("индекс i= "+i+"  nind[i]= "+nind[i]);
          }
        }
/*
        String str = new String();
        str="";
        System.out.println("n1="+n1);
        for (int i = 0; i < n1; i++) {
            String str1=Integer.toString(nind[i]);
            System.out.println(str1);
          str=str+" "+str1;
        }
        System.out.println(str);
//            System.out.println("индекс i"+i+"  nind[i]="+nind[i]);
 */
//===================
        }
    }
