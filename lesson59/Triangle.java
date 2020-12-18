package lesson59;
import java.util.Scanner;
import static java.lang.Math.*;
public class Triangle {
    public static void main(String[] args) {
//
        Trian t1 = new Trian();
        Trian t2 = new Trian();
        Trian t3 = new Trian();
/*
//Ввод координат углов треугольника с клавиатуры
// оприделение 1 вершины треугольника
        System.out.println("ввод вершины t1: ");
        Scanner s1 = new Scanner(System.in);
        t1.x = s1.nextFloat();
        Scanner s2 = new Scanner(System.in);
        t1.y = s2.nextFloat();
        System.out.println("кординаты вершины t1: t1.x =" + t1.x + "   t1.y =" + t1.y);
// оприделение 2 вершины треугольника
        System.out.println("ввод вершины t2: ");
        Scanner s3 = new Scanner(System.in);
        t2.x = s3.nextFloat();
        Scanner s4 = new Scanner(System.in);
        t2.y = s4.nextFloat();
        System.out.println("кординаты вершины t2: t2.x =" + t2.x + "   t2.y =" + t2.y);
// оприделение 3 вершины треугольника
        System.out.println("ввод вершины t2: ");
        Scanner s5 = new Scanner(System.in);
        t3.x = s5.nextFloat();
        Scanner s6 = new Scanner(System.in);
        t3.y = s6.nextFloat();
        System.out.println("кординаты вершины t3: t3.x =" + t3.x + "   t3.y =" + t3.y);
*/
//Ввод данных вершын треугольника  программно
//Оприделение длин сторон треугольника
        t1.x = 6; t2.x = 9; t3.x = 1;   //координаты в системе осей X,Y
        t1.y = 9; t2.y = 2; t3.y = 3;

        t1.x = 3; t2.x = 3; t3.x = 5;
        t1.y = 4; t2.y = 5; t3.y = 6;

//
        System.out.println(" t1.x="+t1.x+"м   t1.y="+t1.y+ "м");
        System.out.println(" t2.x="+t2.x+"м   t2.y="+t2.y+ "м");
        System.out.println(" t3.x="+t3.x+"м   t3.y="+t3.y +"м");

        double dx1, dx2, dx3;
        dx1 = sqrt((t1.x - t2.x) * (t1.x - t2.x) + (t1.y - t2.y) * (t1.y - t2.y));
        dx2 = sqrt((t2.x - t3.x) * (t2.x - t3.x) + (t2.y - t3.y) * (t2.y - t3.y));
        dx3 = sqrt((t3.x - t1.x) * (t3.x - t1.x) + (t3.y - t1.y) * (t3.y - t1.y));
        System.out.println("длины сторон треугольника: t1-t2=" + dx1 + "   t2-t3=" + dx2 + "   t3-t1=" + dx3);
//Оприделение типа треугольника
        if (dx1 == dx2 & dx1 == dx3) {
            System.out.println("равносторонний");
        }
        if (dx1 == dx2 & dx1 != dx3) {
            System.out.println("равнобедренный");
        }
        if (dx1 != dx2 & dx1 != dx3) {
            System.out.println("разносторонний");
        }
//
        double px1, px2, px3;
        double py1, py2, py3;
        px1 = t1.x - t2.x;
        py1 = t1.y - t2.y;  //AB
        px2 = t2.x - t3.x;
        py2 = t2.y - t3.y;  //BC
        px3 = t3.x - t1.x;
        py3 = t3.y - t1.y;  //CA
//
        if (px1 == 0 & py3 == 0) {
            System.out.println("прямоугольный");
        }
        if (px2 == 0 & py1 == 0) {
            System.out.println("прямоугольный");
        }
        if (px3 == 0 & py2 == 0) {
            System.out.println("прямоугольный");
        }
//периметр
        double Perimetr;
        Perimetr = dx1 + dx2 + dx3;
        System.out.println("периметр треугольника= " + Perimetr + "м");
//площадь треугольника по формуле Герона
        double Sg, P2;
        P2 = Perimetr / 2;
        Sg = sqrt(P2 * (P2 - dx1) * (P2 - dx2) * (P2 - dx3));
        System.out.println("площадь треугольника= " + Sg+"м^2");
//
        System.out.println("");
        Colin.collinear(t1.x, t2.x, t3.x, t1.y, t2.y, t3.y);
//
        System.out.println("Создайте метод, поворачивающий треугольник вокруг центра пересечения медиан на указанное в аргументе количество градусов.");
        double Xo, Yo, ugol, ugol1, ugol2, sangle;
        double xt1, yt1, gt1;
        double pi, xt11, yt11;
        double Ug, Ssangle, Csangle;
        float Ugr,X1,Y1,X2,Y2,X3,Y3;
//
        xt11 = 0;   yt11 = 0;
        pi = Math.PI;
//
        Xo = (t1.x + t2.x + t3.x) / 3;
        Yo = (t1.y + t2.y + t3.y) / 3;
        System.out.println(" координаты Центра пересечения медиан (в системк X,Y)   Xo =" + Xo + "    Yo=" + Yo);
//
//            System.out.println("ввод угла поворота вокруг центра пересечения медиан: ");
//            Scanner s7 = new Scanner(System.in);
//            ugol = s7.nextFloat();
//            ugol = 0;  // в градусахп
//           ugol = 6.7478;  // в градусахп
        ugol = 6.0;  // в градусахп
//            ugol = ugol * 0.02261655822376;
        ugol = ugol * 0.017455064928218;
//  https://www.fxyz.ru/формулы_по_геометрии/углы_угол/измерение_углов/преобразование_мер_углов/градусы_в_радианы/ - ошибка
        float U = (float) ugol;
//            System.out.println("угол поворота в радианах =" + U);
//            System.out.println("");
// вершина A - t1
        xt1 = t1.x - Xo; //координаты t1 в системе осей Xm,Ym (пересечение медиан)
        yt1 = t1.y - Yo;
        System.out.println("xt1= " + xt1 + "    yt1 =" + yt1);
        ugol1 = Math.atan(yt1 / xt1);
//            System.out.println("угол наклона медианы M ugol1="+ugol1);
        Ug = 57.295779513082*ugol1;
        Ugr = (float) Ug;
        System.out.println("угол наклона медианы в градусах Ugr=" +Ugr);
//            System.out.println("");
        if (xt1 < 0 & yt1 > 0)  {ugol1=pi-ugol1;}  //2 четверть
        if (xt1 < 0 & yt1 < 0)  {ugol1=ugol1+pi;}  //3  четверть
        if (xt1 > 0 & yt1 < 0)  {ugol1=2*pi-ugol1;}  //4  четверть
        System.out.println("угол наклона медианы (отсчет от оси X)   ugol1="+ugol1);
//
        Ug = 57.295779513082*ugol1;
        Ugr = (float) Ug;
        System.out.println("угол наклона медианы в градусах Ugr=" +Ugr);
        System.out.println("");

        sangle = ugol1 + ugol;
        System.out.println("суммарный угол поворота в радианах (от оси)  sangle=" + sangle);
        Ug = 57.295779513082*sangle;
        Ugr = (float) Ug;
        System.out.println("суммарный угол наклона медианы в градусах sangle=" +Ugr);
        System.out.println("");
//
        gt1 = sqrt(xt1 * xt1 + yt1 * yt1);
        System.out.println("расстояние от центра пересечения медиан до вершины (гипотенуза) t1 ="+gt1);
        Ssangle = sin(sangle);  Csangle = cos(sangle);
//            System.out.println("sin(sangle) ="+Ssangle+"   cos(sangle)="+Csangle);
//
        //       if (xt1 > 0 & yt1 > 0) {
        xt11 = gt1 * Csangle;  yt11 = gt1 * Ssangle;  //t1
//        }  //1 квадрант

//           if (xt1 < 0 & yt1 > 0) {xt11 = gt1 * sin(sangle);  yt11 = gt1 * cos(sangle);}  //2 квадрант
//            if (xt1 < 0 & yt1 < 0) {xt11 = gt1 * sin(sangle);  xt11 = gt1 * sin(sangle);}  //3 квадрант
//            if (xt1 > 0 & yt1 < 0) {xt11 = gt1 * sin(sangle);  xt11 = gt1 * sin(sangle);}  //4 квадрант
        xt11=xt11+Xo;             yt11=yt11+Yo;
        X1 =  (float)xt11;   Y1 =  (float)yt11;
        System.out.println("координаты смещённого 1 угла:  X1=" + X1 + " Y1=" + Y1);
//
// вершина B - t2
        xt1 = t2.x - Xo;
        yt1 = t2.y - Yo;
        ugol1 = Math.atan(yt1 / xt1);
        Ug = 57.295779513082*ugol1;
        Ugr = (float) Ug;
        if (xt1 < 0 & yt1 > 0)  {ugol1=pi-ugol1;}  //2 четверть
        if (xt1 < 0 & yt1 < 0)  {ugol1=ugol1+pi;}  //3  четверть
        if (xt1 > 0 & yt1 < 0)  {ugol1=2*pi-ugol1;}  //4  четверть
        Ug = 57.295779513082*ugol1;
        Ugr = (float) Ug;
        sangle = ugol1 + ugol;
        Ug = 57.295779513082*sangle;
        Ugr = (float) Ug;
        gt1 = sqrt(xt1 * xt1 + yt1 * yt1);
        Ssangle = sin(sangle);  Csangle = cos(sangle);
        xt11 = gt1 * Csangle;  yt11 = gt1 * Ssangle;  //t1
        xt11=xt11+Xo;             yt11=yt11+Yo;
        X2 =  (float)xt11;   Y2 =  (float)yt11;
        System.out.println("координаты смещённого 2 угла:  X2=" + X2 + " Y2=" + Y2);
//
// вершина C - t3
        xt1 = t3.x - Xo;
        yt1 = t3.y - Yo;
        ugol1 = Math.atan(yt1 / xt1);
        Ug = 57.295779513082*ugol1;
        Ugr = (float) Ug;
        if (xt1 < 0 & yt1 > 0)  {ugol1=pi-ugol1;}  //2 четверть
        if (xt1 < 0 & yt1 < 0)  {ugol1=ugol1+pi;}  //3  четверть
        if (xt1 > 0 & yt1 < 0)  {ugol1=2*pi-ugol1;}  //4  четверть
        Ug = 57.295779513082*ugol1;
        Ugr = (float) Ug;
        sangle = ugol1 + ugol;
        Ug = 57.295779513082*sangle;
        Ugr = (float) Ug;
        gt1 = sqrt(xt1 * xt1 + yt1 * yt1);
        Ssangle = sin(sangle);  Csangle = cos(sangle);
        xt11 = gt1 * Csangle;  yt11 = gt1 * Ssangle;  //t1
        xt11=xt11+Xo;             yt11=yt11+Yo;
        X3 =  (float)xt11;   Y3 =  (float)yt11;
        System.out.println("координаты смещённого 3 угла:  X3=" + X3 + " Y3=" + Y3);

//==========================================
    }
}
