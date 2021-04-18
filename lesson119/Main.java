package lesson119;

import java.io.*;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Main {
    public static int getDateDiff(Date date1) {
        Date date2 = new Date();
        long diffInMillies = date2.getTime() - date1.getTime();
        return (int) (diffInMillies/1000);
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        String[] months = { "січня", "лютого", "березня", "квітня",
                "травня", "червня", "липня", "серпня",
                "вересня", "жовтня", "листопада", "грудня",};
        Date date = new Date();
        System.out.printf("%s:%s:%s, %s %s %s", date.getHours(), date.getMinutes(),
                date.getSeconds(), date.getDate(), months[date.getMonth()], date.getYear()+1900);
        FileOutputStream outputStreamDate = new FileOutputStream("date.ser");
        ObjectOutputStream objectOutputStreamDate = new ObjectOutputStream(outputStreamDate);
        objectOutputStreamDate.writeObject(date);
        objectOutputStreamDate.close();
        TimeUnit.SECONDS.sleep(5);

        System.out.println("");
        FileInputStream fileInputStreamDate = new FileInputStream("date.ser");
        ObjectInputStream objectInputStreamDate = new ObjectInputStream(fileInputStreamDate );
        Date date2 = (Date) objectInputStreamDate.readObject();
        System.out.println("");
        System.out.println("Между датами разница " + getDateDiff(date2) + " секунд");


        Animal animal = new Animal();
        animal.setName("Син чихухуа");
        animal.setBreed("Чихухуа");
        animal.setWeight(1.5);

        Animal animal2 = new Animal();
        animal2.setName("Кунгфу Панда");
        animal2.setBreed("Панда");
        animal2.setWeight(100);

        try{
            Animal[] animals = {animal,animal2};
            FileOutputStream outputStream = new FileOutputStream("date.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(animals);
            objectOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream("date.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Animal[] animal1 = (Animal[]) objectInputStream.readObject();
            for (Animal animalObject:
                    animal1) {
                System.out.println("");
                System.out.println(animalObject);
            }
        }
        catch (Exception exception){
            System.out.println(exception);
        }
    }
}
