package lesson108;
import java.util.ArrayList;

public class Solution_4 {
    public static void main(String[] args) throws Exception {
        try {
            ArrayList<String> list = new ArrayList<String>();
            String s = list.get(18);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
            //В строку записываем число
        }
    }
}