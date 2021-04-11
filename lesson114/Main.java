package lesson114;
import java.io.*;
import  java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {


        System.out.println("Створення файлу...");
        Scanner s1 = new Scanner(System.in);
        s1.nextLine();

        File myObj = new File("F:\\IntelliJ IDEA\\IntelliJ IDEA 2020.2.1\\Project2\\src\\lesson114\\input.txt");
   //     File myObj2 = new File("\"F:\\\\IntelliJ IDEA\\\\IntelliJ IDEA 2020.2.1\\\\Project2\\\\src\\\\lesson114\\\\input.txt\"");
        myObj.createNewFile();
        System.out.println("Файл " + myObj.getName() + " створено!");


        System.out.println("Існування файлу inputNew...");
        s1.nextLine();

        File f1 = new File("F:\\IntelliJ IDEA\\IntelliJ IDEA 2020.2.1\\Project2\\src\\lesson114\\inputNew.txt");
        f1.exists();

        try {
            System.out.println(f1.getCanonicalPath() + " Існує файл? " + f1.exists());
        } catch (IOException e) {
        }


        System.out.println("Створення папки javaNew...");
        s1.nextLine();

        Path p = Paths.get("F:\\ javaNew");

        File fd = new File("F:\\IntelliJ IDEA\\IntelliJ IDEA 2020.2.1\\Project2\\src\\lesson114\\javaNew");

        if (Files.notExists(p)) {
            boolean result = false;
            try {
                fd.mkdir();
                result = true;
            } catch (SecurityException se) {

            }
            if (result) {
                System.out.println("Папка javaNew створена!");
            }


            System.out.println("Запис букв...");
            String gotText = s1.nextLine();

            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("input.txt"));
                //        FileReader fr = new FileReader("input.txt");
                //      BufferedReader br = new BufferedReader(fr);
                // считаем сначала первую строку
                //   String line = br.readLine();
                //    while (line != null) {
                //      System.out.println(line);
                // считываем остальные строки в цикле
                //  line = br.readLine();
                writer.write(gotText);
                writer.close();

                //          }
                   }catch (IOException ex) {
                       ex.printStackTrace();
                   }
                // System.out.println("Буква(и) не записано(і)!" + ex.getMessage());


                System.out.println("Визначена довжина: " + new File("input.txt").length());
            s1.nextLine();
                System.out.println("Перейменування файлу...");
            s1.nextLine();
         //   file = new File("DB.properties");
            myObj = new File("input.txt");
         //   myObj2 = new File("Renamed.txt");
            System.out.println(p.getFileName());
            if(myObj.renameTo(myObj)){
                System.out.println("Файл перейменовано успішно!");;
            }else{
                System.out.println("Файл не  перейменовано!");
            }

             //   s1.nextLine();
            //    myObj.renameTo(new File("Renamed.txt"));

                //  File inputFile = new File("F:\\input.txt");
                //  inputFile.renameTo(new File("inputRenamed.txt"));


                System.out.println("Видалення файлу...");
                s1.nextLine();
                // new File("input.txt").delete();
                new File("input.inputRenamed").delete();
            new File("input.txt").delete();
                System.out.println("Файл видалено!");

                s1.nextLine();
                System.out.println("Список файлів у папці:");
                s1.nextLine();
                File directory = new File("F:\\ javaNew");
                File[] files = directory.listFiles();
            System.out.println(files);
             //   if (!directory.exists()) {
            //     directory.mkdirs();
                }
            System.out.println("Проверка существования файла");
        s1.nextLine();
      Path p1 = Paths.get("D:\\java");
      Path p2 = Paths.get("F:\\IntelliJ IDEA\\IntelliJ IDEA 2020.2.1\\Project2\\src\\lesson114\\input.txt");

        System.out.println("p1.equals p2" + p1.equals(p2));
        System.out.println("p2.equals pa.toAbsolutePath"+ p2.equals(p1.toAbsolutePath()));
        //   s1.nextLine();
         //   System.out.println((new File("inputNew.txt").exists()) ? "Файл є" : "Файла немає");

   //    System.out.println("(Введіть)Перевірка шляху...\\input.txt");

    //    String directoryToCheck = s1.next();
     //   System.out.println("D:\\java" + directoryToCheck + (new File(directoryToCheck).exists()? " Існує" : " Не існує"));

                System.out.println("Файли в директорії: \n" +
                        Arrays.toString(new File("F:\\IntelliJ IDEA\\IntelliJ IDEA 2020.2.1\\Project2\\src\\lesson114").listFiles()));

            }
        }

