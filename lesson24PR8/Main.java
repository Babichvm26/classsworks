package lesson24PR8;

public class Main {
    public static void main(String[] args) {
    int i,j,k;
    String [] str = new String[11];
    String [] stP = new String[11];
//
    k=10;
    System.out.println("1 пример");
    str[0]="";  stP[0]="";
    for (i=1; i<=k; i++) {
    str[i]=str[i-1]+"#";
    stP[i]=stP[i-1]+" ";
      System.out.println(str[i]);
    }
    for (i=k-1; i>=1;  i--) {
        System.out.println(str[i]);
    }
        System.out.println("");
        System.out.println("");
        System.out.println("2 пример");
        for (i=k; i>=1; i--) {
            System.out.println(stP[k-i]+str[i]);
        }
        System.out.println("");
        System.out.println("");
        System.out.println("3 пример");
        for (i=1; i<=k; i++) {
            System.out.println(stP[k-i]+str[i]);
        }
        System.out.println("");
        System.out.println("");
        System.out.println("4 пример");
        for (i=1; i<=k; i++) {
            System.out.println(stP[k-i]+str[i]);
        }
        for (i=k-1; i>=1; i--) {
            System.out.println(stP[k-i]+str[i]);
        }
        System.out.println("");
        System.out.println("");
        System.out.println("5 пример");
        for (i=1; i<=k; i++) {
            if (i==1) System.out.println(stP[k-i]+str[i]);
            if (i>1) System.out.println(stP[k-i]+str[i]+str[i-1]);
        }
        for (i=2; i<=k; i++) {
            if (i==1) System.out.println(stP[k-i]+str[i]);
            if (i>1) System.out.println(stP[k-i]+str[i]+str[i-1]);
        }

//==============================================
    }
}
