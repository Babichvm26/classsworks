package lesson24PR8;

public class Main {
    public static void main(String[] args) {
    int i,j,k;
//    String [] str = new String[11];
//    String [] stP = new String[11];
//
    String  str = new String();
    String  stP = new String();

        k=10;

    System.out.println("1 пример");
    for (i=1; i<=k; i++) {
        str = "";
        for (j = 1; j <= i; j++) {
            str = str + "#";
        }
        System.out.println(str);
    }
    for (i=k; i>=1; i--) {
        str = "";
       for (j=k; j>=k-i; j-- ) {
        str=str+"#";
       }
        System.out.println(str);
    }
//
        System.out.println("");
        System.out.println("");
        System.out.println("2 пример");
        for (i=k; i>=1; i--) {
            str="";  stP="";
            for (j=1; j<=i; j++) {
                str = str + "#";
            }
            for (j=1; j<=k-i; j++ ) {
                stP=stP+" ";
            }
            System.out.println(stP+str);
        }

        System.out.println("");
        System.out.println("");
        System.out.println("3 пример");
        for (i=1; i<=k; i++) {
            str="";  stP="";
            for (j=1; j<=i; j++) {
                str = str + "#";
            }
            for (j=k; j>=i; j-- ) {
              stP=stP+" ";
            }
            System.out.println(stP+str);
        }


        System.out.println("");
        System.out.println("");
        System.out.println("4 пример");
        for (i=1; i<=k; i++) {
            str="";  stP="";
            for (j=1; j<=i; j++) {
                str = str + "#";
            }
            for (j=k; j>=i; j-- ) {
                stP=stP+" ";
            }
            System.out.println(stP+str);
        }
        for (i=k-1; i>=1; i--) {
            str="";  stP="";
            str="";  stP="";
            for (j=1; j<=i; j++) {
                str = str + "#";
            }
            for (j=1; j<=k-i+1; j++ ) {
                stP=stP+" ";
            }
          System.out.println(stP+str);
        }

        System.out.println("");
        System.out.println("");
        System.out.println("5 пример");
        for (i=1; i<=k; i++) {
            str = "";
            stP = "";
            for (j = 1; j <= i; j++) {
                str = str + "#";
            }
            for (j = k; j >= i; j--) {
                stP = stP + " ";
            }
            for (j = 2; j <= i; j++) {
                str = str + "#";
            }
            System.out.println(stP+str);
        }
        for (i=2; i<=k; i++) {
            str = "";
            stP = "";
            for (j = 1; j <= i; j++) {
                str = str + "#";
            }
            for (j = k; j >= i; j--) {
                stP = stP + " ";
            }
            for (j = 2; j <= i; j++) {
                str = str + "#";
            }
            System.out.println(stP+str);
        }
//==============================================
    }
}
