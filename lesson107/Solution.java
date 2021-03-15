package lesson107;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) throws Exception {
        try{
        method1();
    }
        catch (NullPointerException np) {
            System.out.println(np);
        }
        catch (FileNotFoundException fe){
            System.out.println(fe);
        }
    }
    public static void method1()throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {
        int i = (int)(Math.random()*4);

        if (i == 0)
            throw new NullPointerException();

        if (i == 1)
            throw new ArithmeticException();//

        if (i == 2)
            throw new FileNotFoundException();

        if(i == 3)

            try {
                throw new URISyntaxException("frge", "sgdh");
            }catch (URISyntaxException uri){
            }
    }
}
