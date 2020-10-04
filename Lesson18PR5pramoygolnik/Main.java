package Lesson18PR5pramoygolnik;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float xe,ye,xf,yf,xg,yg,xh,yh;
        float k,kx,ky;
//        println (String x)
//ввод координат

    // 1 прямоугольник
    //xa = 1;  ya = 1;  xb = 4;  yb = 4;
    // 2 прямоугольник
    //xc = 5;  yc = 5;  xd = 9;  yd = 9;
    //
        System.out.println("введите xa");
        Scanner s1 = new Scanner(System.in);
        float xa = s1.nextFloat();
        System.out.println("xa=" +xa);
//
        System.out.println("введите ya");
        Scanner s2 = new Scanner(System.in);
        float ya = s2.nextFloat();
        System.out.println("ya=" +ya);
//
        System.out.println("введите xb");
        Scanner s3 = new Scanner(System.in);
        float xb = s3.nextFloat();
        System.out.println("xb=" +xb);
//
        System.out.println("введите yb");
        Scanner s4 = new Scanner(System.in);
        float yb = s4.nextFloat();
        System.out.println("yb=" +yb);

        System.out.println("xa=" +xa+ " ya=" +ya+ "      xb=" +xb+ " yb=" +yb);


        // 2 прямоугольник
        //
        System.out.println("введите xc");
        Scanner s5 = new Scanner(System.in);
        float xc = s5.nextFloat();
        System.out.println("xc=" +xc);
//
        System.out.println("введите yc");
        Scanner s6 = new Scanner(System.in);
        float yc = s6.nextFloat();
        System.out.println("yc=" +yc);
//
        System.out.println("введите xd");
        Scanner s7 = new Scanner(System.in);
        float xd = s7.nextFloat();
        System.out.println("xd=" +xd);
//
        System.out.println("введите xd");
        Scanner s8 = new Scanner(System.in);
        float yd = s8.nextFloat();
        System.out.println("yd=" +yd);
        System.out.println("xc=" +xc+ " yc=" +yc+ "      xd=" +xd+ " yd=" +yd);
//
//
//
//   Y
//   |                      G---------D
//   |                       |       |
//   |                      C---------H
//   |  E----------------B
//   |   |              |
//   |   |              |
//   |   ----------------F
//   |  A
//   --------------------------------------------------X
//доопределение координат
        // 1 прямоугольник
        xe = xa;  ye = yb;  xf = xb;  yf = ya;
        // 2 прямоугольник
        xg = xc;  yg = yd;  xh = xd;  yh = yc;


        System.out.println("ввод координат");
        System.out.println("прямоугольник AFBE");
        System.out.println("xa=" +xa+ " ya=" +ya+ "      xb=" +xb+ " yb=" +yb);
        System.out.println("xe=" +xe+ " ye=" +ye+ "      xf=" +xf+ " yf=" +yf);
//
        System.out.println("прямоугольник CHDG");
        System.out.println("xc=" +xc+ " yc=" +yc+ "      xd=" +xd+ " yd=" +yd);
        System.out.println("xg=" +xg+ " yg=" +yg+ "      xh=" +xh+ " yh=" +yh);
        System.out.println("");
        System.out.println("");
        System.out.println("Варианты пересечений");
        System.out.println("");
//
// 1 проверка совпадения вершиной A
        if (xa==xc||xa==xd||xa==xg||xa==xh){kx=1;}
        else {kx=0;}
        if (ya==yc||ya==yd||ya==yg||ya==yh){ky=1;}
        else {ky=0;}
        k=kx;
        if (kx!=ky||kx==0) System.out.println("совпадения c A вершин CHDG нет  k="+ k);
        if (kx==ky||kx==1) System.out.println("совпадение A вершин CHDG  k=" +k);
        System.out.println("");
//
// 1 проверка совпадения вершиной F
        if (xf==xc||xf==xd||xf==xg||xf==xh){kx=1;}
        else {kx=0;}
        if (yf==yc||yf==yd||yf==yg||yf==yh){ky=1;}
        else {ky=0;}
        if (kx!=ky||kx==0) System.out.println("совпадения c F вершин CHDG  нет  k="+ k);
        if (kx==ky||kx==1) System.out.println("совпадение c F вершин CHDG  k=" +k);
        System.out.println("");
// 1 проверка совпадения вершиной B
        if (xb==xc||xb==xd||xb==xg||xb==xh){kx=1;}
        else {kx=0;}
        if (yb==yc||yb==yd||yb==yg||yb==yh){ky=1;}
        else {ky=0;}
        k=kx;
        if (kx!=ky||kx==0) System.out.println("совпадения c B вершин CHDG нет  k="+ k);
        if (kx==ky||kx==1) System.out.println("совпадение B вершин CHDG  k=" +k);
        System.out.println("");
//
// 1 проверка совпадения вершиной E
        if (xe==xc||xe==xd||xe==xg||xe==xh){kx=1;}
        else {kx=0;}
        if (ye==yc||ye==yd||ye==yg||ye==yh){ky=1;}
        else {ky=0;}
        k=kx;
        if (kx!=ky||kx==0) System.out.println("совпадения c E вершин CHDG  нет  k="+ k);
        if (kx==ky||kx==1) System.out.println("совпадение c E вершин CHDG  k=" +k);
//
        System.out.println("");
        System.out.println("");
 //
// 2 проверка совпадения горизонтальных сторон
        // стороны EB   CH
        if (ye==yc) {
            if (xe <= xc || xc <= xb) {kx = 1;}
            else {kx=0;}
        }
        if (kx==1) System.out.println("совпадение сторон AF и GD  k=" +k);
        if (kx==0) System.out.println("совпадения сторон AF и GD нет k=" +k);
//
        System.out.println("");
        System.out.println("");

        // стороны AF   GD
        if (ya==yg) {
            if (xa <= xg || xg <= xf) {kx = 1;}
            else {kx=0;}
        }
        if (kx==1) System.out.println("совпадение сторон CH и EB  k=" +k);
        if (kx==0) System.out.println("совпадения сторон CH и EB нет k=" +k);

// 3 проверка совпадения вертикальных сторон
        // стороны FB  CG
        if (xg==xb){
            if (yg <= yb || yf <= yg) {kx = 1;}
            else {kx=0;}
        }
        if (kx==1) System.out.println("совпадение сторон AE и HD  k=" +k);
        if (kx==0) System.out.println("совпадения сторон нет AE и HD k=" +k);
        // стороны AE  HD
        if (xf==xc){
            if (ye >= yd || ya <= yd) {kx = 1;}
            else {kx=0;}
        }
        if (kx==1) System.out.println("совпадение сторон FB и CG  k=" +k);
        if (kx==0) System.out.println("совпадения сторон FB и CG нет k=" +k);
//

    }
//  Можливі варіанти перетину:
//   1. прямокутник,
//   2. вертикальний відрізок,
//   3. горизонтальний відрізок,
//   4. точка,
//   5. перетин відсутній,
//   6. совпадение (збiг)
//  В задании не указано перемещение прямоугольника CHDG ?
//     1. поступательное
//     2. вращение
//     3.  поступательное + вращение
//
// при заданном рпсположении прямоугольников
//    5.   перетин відсутній  - да
//    1,2,3,4,6 варианты - нет
//



/*       if (xa = xd) {
           if (xa = xg) {
               if (xa = xh) {
               ind=1;
               }
           }
       }
    }
*/




}





