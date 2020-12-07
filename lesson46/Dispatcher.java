package lesson46;

import java.util.*;
import java.lang.Math.*;
import java.io.*;
public class Dispatcher {
    public static <geomVector> void main(String[] args) {

        System.out.println("Даны координаты вектора {a,b}");
        Vector v = new Vector(3, 2);
//
        System.out.println("Даны точки А(5; 1) и В(4; -3). Найти координаты векторов АВ и ВА. ");
        int xA,yA,xB,yB;
//        double xA,yA,xB,yB;
        xA =5;
        yA =1;
        xB =4;
        yB =-3;
        Controller a = new Controller();
        Controller b = new Controller();
//
        b.setVector(xB,yB,xA,yA);
        b.getVectorCoords();
        System.out.println("BA.xV="+b.xV+"  BA.yV="+b.yV);

        a.setVector(xA,yA,xB,yB);
        a.getVectorCoords();
        System.out.println("AB.xV="+a.xV+"  AB.yV="+a.yV);
//
        System.out.println("Вычислить длину вектора AB ");
        double DL,sDL;
        sDL=a.xV*a.xV+a.yV*a.yV;
        DL=Math.sqrt(sDL);
        System.out.println("Длина вектора ="+DL);
//
        System.out.println("Умножение вектора AB на скаляр");
        int scal=4;
        double sAx,sAy;
        sAx =scal*a.xV;
        sAy =scal*a.yV;
        System.out.println("sAB.xV="+sAx+"  sAB.yV="+sAy);
//
        System.out.println("Произведение векторов");
        Controller ab = new Controller();
        System.out.println("a*b = "+ab.scalMult(a,b));
//
        System.out.println("Векторное произведение ");
        Controller abv = new Controller();
        abv.xV=a.xV*b.yV;
        abv.yV=a.yV*b.xV;
        double abv1=abv.xV-abv.yV;
        System.out.println("abv = "+abv1);

//============================================
    }
}

