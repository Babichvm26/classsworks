package lesson107;

public class Solution_3 {
    public static void main(String[] args) {
        processException(new Solution_3());
    }
    public  static void processException(Solution_3 obj) {
        try {
            obj.method1();
        } catch (NullPointerException ne) {
            printStack(ne);
            try {
                obj.method2();
            } catch (IndexOutOfBoundsException io) {
                printStack(io);
            }
        }
        try {
            obj.method3();
        }catch (NumberFormatException nf){
            printStack(nf);
        }

    }
    public static void printStack(Throwable throwable){
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }
    public  void method1(){

        throw new NullPointerException();
    }
    public  void method2()
    {
        throw new IndexOutOfBoundsException();

    }
    public void  method3()
    {
        throw new NumberFormatException();

    }
}
