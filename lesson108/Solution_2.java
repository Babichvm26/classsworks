package lesson108;

public class Solution_2 {
    public static void main(String[] args) throws  Exception {
        try {
            String s = null;
            String m = s.toLowerCase();
        } catch (NullPointerException e) {
            System.out.println(e);
            // Ошибка в том что null нельзя записать в toLowerCase, потому что он пустой
        }
    }
}