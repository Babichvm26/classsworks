package lesson108;
import java.io.IOException;
import java.rmi.RemoteException;

 public class Solution_6 {
    public static void main(String[] args) {
        processException(new Solution_6());
    }

    public static void processException(Solution_6 obj) {
        try {

            obj.method1();
            obj.method2();
            obj.method3();
        } catch (RemoteException r){
            System.out.println(r);
        } catch (IOException i) {
            System.out.println(i);

        } catch (NoSuchFieldException n) {
            System.out.println(n);

        }
    }
        public void  method1 () throws IOException {
            throw new IOException();
        }
        public void method2 () throws NoSuchFieldException {
            throw new NoSuchFieldException();
        }
        public void method3 () throws RemoteException {
            throw new RemoteException();
            // Перехват исключений в методе processExceptions
        }
    }

