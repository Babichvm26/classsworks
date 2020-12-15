package package1;

import package2.Animal;
import package2.Dog;


public class Dispatcher extends Animal {

    int y1=7;
    public int y2=4;
    private int y3=4;
    protected int y4=45;

    public static void main(String[] args) {


        System.out.println("переменные доступны все");
        package1.Dispatcher d = new package1.Dispatcher();
        System.out.println(d.y1);
        System.out.println(d.y2);
        System.out.println(d.y3);
        System.out.println(d.y4);

//
        System.out.println("переменные доступны из package1.Cat");
               System.out.println();
               Cat t1 = new Cat();
                System.out.println(t1.x1);
                System.out.println(t1.x2);
//               System.out.println(t1.x3); private в классе Animal
                System.out.println(t1.x4);

//
        System.out.println("переменные доступны из package2.Dog");
        package2.Dog t2 = new package2.Dog();
//        System.out.println(t2.z1);   //z1 определен в классе Animal default
        System.out.println(t2.z2);
//        System.out.println(t2.z3); private в классе Animal
//        System.out.println(t2.z4); //protected
//



//




//========================
            }
        }


