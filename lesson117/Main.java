package lesson117;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {
        Date date = new Date();
        System.out.println(date);
        FileReader fileToRead = new FileReader("src/lesson117/fileToRead");
        BufferedReader br1 = new BufferedReader(fileToRead);
        FileReader fileToRead2 = new FileReader("src/lesson117/fileToRead");
        BufferedReader br2 = new BufferedReader(fileToRead2);
        FileReader fileToRead3 = new FileReader("src/lesson117/fileToRead2");
        BufferedReader br3 = new BufferedReader(fileToRead3);



        System.out.println("Кількість символів K: " + br1.readLine().replaceAll("[^kK]","").length());
        System.out.println(Equals.checkIfEquals(br2, br3));
    }
}
