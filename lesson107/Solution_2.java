package lesson107;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.RemoteException;
public class Solution_2 {
    public static void main(String[] args) {
        processExceptions(new Solution_2());
    }

    public static  void processExceptions(Solution_2 obj){
        try {
            obj.method1();
            obj.method2();
            obj.method3();

        }catch (FileNotFoundException fe){
            System.out.println(fe);

        }catch (ClassNotFoundException cn){
            System.out.println(cn);

        }catch (NoSuchFieldException nf) {
            System.out.println(nf);
        }
    }
    public void method1() throws FileNotFoundException {
        throw new FileNotFoundException ();

    }
    public void method2()throws ClassNotFoundException{
        throw  new  ClassNotFoundException();
    }

    public void method3()throws NoSuchFieldException{
        throw new NoSuchFieldException();

    }
}
