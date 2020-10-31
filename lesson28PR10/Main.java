package lesson28PR10;

public class Main {
    public static void main(String[] args) {
        System.out.println("Створення 3-го масиву як попарної суми елементів 2-х масивів однакової довжини");
        int i,k;
        int[] numb1 = {45, 2, 6, 7, 21, 25, 24, 5, 3, 9, 28, 34, 56, 36};
        int[] numb2 = {35, 8, 3, 2, 1, 15, 22, 7, 9, 12, 26, 38, 54, 39};
        int[] numb3 = new int[numb1.length];


        k=numb1.length;
        System.out.println("3-iй масив як попарна сума елементів"  );
        for ( i = 0; i < k; i++) {
         numb3[i]= numb1[i]+ numb2[i];
         System.out.println(numb3[i]);
        }
//
        System.out.println("Створення 3-го масиву як конкатенація 2-х масивів різної довжини");
        //char [] chr1 = new char[numb1.length];
        //char [] chr2 = new char[numb1.length];

        int k1,k2,ks;
        int[] cnumb1 = {45, 2, 6, 7, 21, 25, 24, 5, 3, 9, 28, 34, 56};
        int[] cnumb2 = {35, 8, 3, 2, 1, 15, 22, 7, 9, 12, 26, 38, 54, 39,64,37,88};

        k1=cnumb1.length;
        k2=cnumb2.length;
        int kd;
        ks=k1;
        if (ks < k2) {ks=k2;}  ks=ks+1;
        int[] cnumR1 = new int[ks];
        int[] cnumR2 = new int[ks];
        for (i = 0; i < ks; i++) {cnumR1[i]=0;  cnumR2[i]=0;}
        for (i = 0; i < k1; i++) cnumR1[i] = cnumb1[i];
        for (i = 0; i < k2; i++) cnumR2[i] = cnumb2[i];
        System.out.println("k1="+ k1 +"   k2="+ k2 + "   ks="+ks);

        for (i = 0; i < ks-1; i++) {
            System.out.println("cnumR1[i]=" + cnumR1[i] + "cnumR2[i]=" + cnumR2[i]);
        }
//
//конвертировать-int-в-char-в-java
//        char[] chr1 = new char[k1];
//        char[] chr2 = new char[k2];

        String[] str1 = new String[ks];
        String[] str2 = new String[ks];

        String strR = new String();
        for (i = 0; i < ks-1; i++) {str1[i] = Integer.toString(cnumR1[i]);}
        for (i = 0; i < ks-1; i++) {str2[i] = Integer.toString(cnumR2[i]);}
        for (i = 0; i < ks-1; i++) {
            System.out.println("str1[i]=" + str1[i] + "   str2[i]=" + str2[i]);
        }
  //конкатенація
        System.out.println("конкатенація");
        for (i = 0; i < ks-1; i++) {
//            strR = str1[i]+str2[i];
           str1[i] = str1[i].concat(str2[i]);
            System.out.println(str1[i]);
//            System.out.println(strR);
        }

//===============================
    }
}
