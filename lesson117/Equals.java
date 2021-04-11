package lesson117;
import java.io.BufferedReader;
import java.io.IOException;

public class Equals {
    public static boolean checkIfEquals(BufferedReader BufferedReader1, BufferedReader BufferedReader2) throws IOException {

        String br1List = BufferedReader1.readLine();
        String br2List = BufferedReader2.readLine();
        System.out.println(br1List + " " + br2List);

            if (br1List.length()==br2List.length()){
            for (int i = 0; i < br1List.length(); i++) {
            if (Character.toLowerCase(br1List.charAt(i)) != Character.toLowerCase(br2List.charAt(i))){
                System.out.println(br1List.charAt(i) + " " + br2List.charAt(i));
                    return false;
                  }
                 }
               }
            else{return false;}
        return true;
    }
}
